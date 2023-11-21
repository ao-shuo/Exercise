package com.exercise.lyl.chapter06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("C:\\Users\\35763\\Desktop\\lake.txt");
        Scanner sc=new Scanner(f);
        TreeMap<String,Integer> tm=new TreeMap<>();
        sc.useDelimiter("[\\s\\.\\?\"\'\\-;:,\\(\\)\\d\\+!@#$%^&/]");
        while (sc.hasNext()){
            String s=sc.next();
            if(!s.equals("")){
                if(tm.containsKey(s)){
                    int n=tm.get(s);
                    tm.put(s,n+1);
                }else {
                    tm.put(s,1);
                }
            }
        }
        for(String word:tm.keySet()){
            System.out.println(word+"-"+tm.get(word));
        }
    }
}
