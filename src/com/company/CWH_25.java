package com.company;

public class CWH_25 {

    static void logic(int x,int y){
        x=x+1;
        System.out.println(x+y);

    }
    public static void main(String[] args) {
        int a=4;
        int b=6;
//        CWH_25 obj= new CWH_25();   remove static from method
//        obj.logic(a,b);
        logic(a,b);
        System.out.println(a+b);
    }
}
