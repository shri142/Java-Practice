package com.company;

public class CWH_29 {
    static int factorial(int n){
        int val;
        if (n==0 || n==1){
            val=1;
        }
        else{
            val= n*factorial(n-1);
        }

     return val;
    }
    public static void main(String[] args) {
        int a=4;
       System.out.println("factorial is "+ factorial(a));
    }
}
