package com.exercise.lyl.chapter07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BirthdayCalendarApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Birthday Calendar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        JLabel label = new JLabel("Enter your birthdate (yyyy/mm/dd): ");
        JTextField inputField = new JTextField(10);
        JButton showCalendarButton = new JButton("Show Calendar");

        inputPanel.add(label);
        inputPanel.add(inputField);
        inputPanel.add(showCalendarButton);

        JTextArea outputArea = new JTextArea(20, 40);
        outputArea.setEditable(false);

        showCalendarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String[] parts = input.split("/");
                if (parts.length == 3) {
                    try {
                        int year = Integer.parseInt(parts[0]);
                        int month = Integer.parseInt(parts[1]) - 1; // Calendar months are 0-based
                        int day = Integer.parseInt(parts[2]);

                        Calendar calendar = new GregorianCalendar(year, month, day);
                        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
                        calendar.set(Calendar.DAY_OF_MONTH, 1);

                        StringBuilder calendarText = new StringBuilder();
                        calendarText.append(String.format("Calendar for %s:%n", input));
                        for (int i = 1; i <= maxDay; i++) {
                            int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
                            calendarText.append(String.format("%2d ", currentDay));
                            if (i % 7 == 0) {
                                calendarText.append("\n");
                            }
                            calendar.add(Calendar.DAY_OF_MONTH, 1);
                        }

                        outputArea.setText(calendarText.toString());
                    } catch (NumberFormatException ex) {
                        outputArea.setText("Invalid date format. Please use yyyy/mm/dd.");
                    }
                } else {
                    outputArea.setText("Invalid date format. Please use yyyy/mm/dd.");
                }
            }
        });

        JScrollPane scrollPane = new JScrollPane(outputArea);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}

