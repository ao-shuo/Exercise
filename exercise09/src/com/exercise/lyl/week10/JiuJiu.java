package com.exercise.lyl.week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class JiuJiu {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps=new PrintStream("E:\\JavaTest\\a.txt");
        ps.println("李云龙:20220405401007");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.printf("%d*%d=%d\t",j,i,j*i);
                ps.printf("%d*%d=%d\t",j,i,j*i);
            }
            System.out.println();
            ps.println();

        }
        Scanner sc=new Scanner(new File("E:\\JavaTest\\a.txt"));
        int count=0;
        while (sc.hasNext()){
            sc.nextLine();
        }
    }
}
