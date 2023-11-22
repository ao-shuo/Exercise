package com.exercise.lyl.chapter07;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ColorAdjust extends JFrame implements ChangeListener {
    private JButton jb=new JButton();
    private JLabel js_prompt=new JLabel("移动滑杆可以改变按钮颜色");
    private JLabel jl_r=new JLabel("红色:0-------100-------255");
    private JLabel jl_g=new JLabel("绿色:0-------100-------255");
    private JLabel jl_b=new JLabel("蓝色:0-------100-------255");
    private JSlider js_r=new JSlider(0,255,255);
    private JSlider js_g=new JSlider(0,255,0);
    private JSlider js_b=new JSlider(0,255,0);
    private JPanel jp_left=new JPanel();
    private JPanel jb_color=new JPanel();
    public ColorAdjust(){
        super("颜色调整器");
        init();
    }
    public void init(){
        //将容器设置为一行二列的GridLayout
        this.setLayout(new GridLayout(1,2));
        jp_left.add(js_prompt);
        jp_left.add(jl_r);
        jp_left.add(js_r);
        jp_left.add(jl_g);
        jp_left.add(js_g);
        jp_left.add(jl_b);
        jp_left.add(js_b);
        //先放在第一行第一列
        this.add(jp_left);
        //按钮的背景颜色定义为red
        jb_color.setBackground(Color.red);
        add(jb_color);
        //将滑杆与监听器关联起来
        js_r.addChangeListener(this);
        js_g.addChangeListener(this);
        js_b.addChangeListener(this);
        this.setSize(540,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        Color color=new Color(js_r.getValue(),js_g.getValue(),js_b.getValue());
        jb_color.setBackground(color);
    }

    public static void main(String[] args) {
        new ColorAdjust();
    }
}
