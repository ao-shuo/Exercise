package com.exercise.lyl.week10;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

//public class Dir {
//    public static void main(String[] args) {
//        File file=new File("E:\\Baidunet\\BaiduNetdisk");
//        File[] fa=file.listFiles();
//        String[] namea=new String[fa.length];
//        for (int i = 0; i < fa.length; i++) {
//            String name=fa[i].getName().toString();
//            long date01=fa[i].lastModified();
//            Date date=new Date(date01);
//            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH：mm");
//            String time=simpleDateFormat.format(date);
//            System.out.println(name+"\t"+time+fa[i].length()/1000.0);
//
//        }
//    }
//}
public class Dir {
    public static void main(String[] args) {
        File file=new File("D:\\communication\\WeChat Files\\wxid_20k9cdrblirl22\\FileStorage\\File\\2023-11");
        File[] fa=file.listFiles();
        String s="sss";
        char[] arr=s.toCharArray();
        String[] namea=new String[fa.length];
        for (int i = 0; i < fa.length; i++) {
            String name=fa[i].getName().toString();
            long date01=fa[i].lastModified();
            Date date=new Date();
            date.setTime(date01);
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH：mm");
            String time=simpleDateFormat.format(date);
            System.out.println(name + "\t" + time + fa[i].length() / 1000.0);
        }
    }
}