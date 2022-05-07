package com.company;

public class CWH_31 {

    static int fib(int n){
        if (n==0) {
            return 0;
        }
        else if (n==2) {
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void main(String[] args) {

        System.out.println("the 6th term of fibonacci series is " + fib(4));

    }
}
//why errrorssssssssssssssssssssssssssssssssssss