package com.exercise.lyl;

import java.util.Calendar;
import java.util.Scanner;

public class IDInfo {
    public static void main(String[] args) {
        String[] strArray={"一","二","三","四","五","六","日"};
        Scanner sc=new Scanner(System.in);
        String str=new String();
        str=sc.nextLine();
        String xingzhengquyu=str.substring(0,6);
        String year=str.substring(6,10);
        String moth=str.substring(10,12);
        String day=str.substring(12,14);
        int year01=Integer.parseInt(year);
        int month01=Integer.parseInt(moth);
        int day01=Integer.parseInt(day);
        //如果性别位为偶数的话会返回false，false代表女，true代表男
        char sex=(str.charAt(16)-'0')%2!=0?'男':'女';
        Calendar cal= Calendar.getInstance();
        int nowyear=cal.get(Calendar.YEAR);
        cal.set(year01,month01,day01);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.printf("已经%d岁了\n",nowyear-year01+1);
        cal.set(year01,month01-1,1);
        int week=cal.get(Calendar.DAY_OF_WEEK);
        for (int i = 0; i < 7; i++) {
            System.out.print(strArray[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < week-2; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= 31; i++) {
            System.out.print(i+"\t");
            if((i+week-2)%7==0){
                System.out.println();
            }
        }

    }
}