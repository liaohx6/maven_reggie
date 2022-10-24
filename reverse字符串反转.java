package com.company;

import java.sql.SQLOutput;

public class reverse字符串反转 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1000;i<=9999;i++){
            StringBuilder String=new StringBuilder(i+"");//i+"":可以将int型的i直接转变成String型；
            if(String.toString().equals(String.reverse().toString())){
                System.out.println(i);
               sum++;
            }


        }
        System.out.println(sum);
    }
}
