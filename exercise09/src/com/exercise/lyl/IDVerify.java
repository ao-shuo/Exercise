package com.exercise.lyl;

import java.util.Scanner;

public class IDVerify {
    public int Verify(String str){
        int result=0;
        char[] arr=str.toCharArray();
        int[] w={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        int S=0;
        for (int i = 0; i<17; i++) {
            int temp=arr[i]-'0';
            S+=temp*w[i];
        }
        result=S%11;
        return result;
    }
    public static void main(String[] args) {
        IDVerify id=new IDVerify();
        String str=new String();
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int index=id.Verify(str);
        char[] v={'1','0','x','9','8','7','6','5','4','3','2'};
        System.out.println(v[index]);
    }
}