package com.company;

public class CWH_27 {
    static void sum(int x,int y){
        System.out.println(x+y);
    }
    static void sum(int p,int q, int r){   // p,q and r are parameter

        System.out.println(p+q+r);
    }

    public static void main(String[] args) {
        int a=2;
        int b=3;
        int c=4;
        sum(a,b);
        sum(a,b,c);//a,b,c are arguments
    }
}
