package com.company;

public class CWH_30 {

    static int sum(int x) {
        if (x == 0) {
            return 0;
        } else {
            return x + sum(x - 1);
        }

    }

    public static void main(String[] args) {

        System.out.println("sum of natural no.s " + sum(8));
    }
}
