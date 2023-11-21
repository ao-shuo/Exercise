package com.exercise.lyl.chapter07;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        TreeMap<Character, Integer> hash=new TreeMap<Character,Integer>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(hash.containsKey(ch)){
                hash.put(ch,hash.get(ch)+1);
            }else {
                hash.put(ch,1);

            }
        }
        System.out.println(hash.toString());
    }
}
