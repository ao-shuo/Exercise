package com.exercise.lyl.week10;

import java.io.File;

public class Poi {
    public static void main(String[] args) {
        File file=new File("E:\\JDK\\POI");
        File[] fa=file.listFiles();

        for (int i = 0; i < fa.length; i++) {
            String name=fa[i].getName().toString();
            System.out.println(name);
        }
    }
}