//package com.company;
//class base1{
//    base1(){
//        System.out.println("i m constructor");
//    }
//    base1(int a){
//        System.out.println("i m overloaded constructor "+ a);
//    }
//
//    public int x;
//
//}
//class Derived1 extends base1 {
//    Derived1() {
//        super(0);
//        System.out.println("I m derived class ka constructor");
//    }
//    Derived1(int x, int y) {
//        super(x);
//
//        System.out.println("I m derived class ka overloaded  constructor" + x+y);
//    }
//
//    public int y;
//}
//class ChildOfDerived{
//    ChildOfDerived(){
//        System.out.println("i m child of derived ");
//    }
//    ChildOfDerived(int x, int y,int z){
//      //   super(x, y);  why error
//        System.out.println("i m child of derived constructor "+);
//    }
//
//}
//
//public class CWH_39 {
//    public static void main(String[] args) {
//      //    base1 b=new base1();
//      //  Derived1 d =new Derived1();
//      //  Derived1 d =new Derived1(3,7);
//        ChildOfDerived cd= new ChildOfDerived();
//    }
//}
