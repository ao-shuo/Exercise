package com.exercise.lyl.chapter06;

public class Test {
    public static void main(String[] args) {
        StringBuffer bf1=new StringBuffer();
        //StringBuffer的实际
        System.out.println(bf1.length());
        //StringBuffer的最大字符容量
        System.out.println(bf1.capacity());
        bf1.append("12345");
        System.out.println(bf1.length());
        System.out.println(bf1.capacity());
        System.out.println(bf1);
        //String->StringBuffer
        StringBuffer bf2=new StringBuffer("0123456789");
        System.out.println(bf2.length());
        System.out.println(bf2.capacity());
        //StringBuffer->String
        System.out.println(bf2.toString());
        //翻转字符
        bf2.reverse();
    }
}
