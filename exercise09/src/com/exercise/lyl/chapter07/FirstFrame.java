package com.exercise.lyl.chapter07;

import java.awt.Color;
import java.awt.Frame;

public class FirstFrame extends Frame{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FirstFrame fr = new FirstFrame("Hello"); //构造方法
        fr.setSize(240,240);  //设置Frame的大小
        fr.setBackground(Color.blue); //设置Frame的背景色
        fr.setVisible(true); //设置Frame为可见，默认不可见
    }

    public FirstFrame(String str){
        super(str);
        
    }

}