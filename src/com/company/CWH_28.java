package com.company;
//variable arguments
public class CWH_28 {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    public static void main(String[] args) {
//
//        System.out.println("sum is "+ sum(3,5));
//        System.out.println("sum is "+ sum(3,5,5));   errror in this

    static int sum(int... arr) {  //sum(int x, int ...arr) in this x is must
        int result=0;

        for (int a:arr){
            result +=a ;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("sum is "+ sum());
        System.out.println("sum is "+ sum(3,5,5));
        System.out.println("sum is " + sum(3,4,5,6,7,8));

    }
}
