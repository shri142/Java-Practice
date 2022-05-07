package com.company;

class A {
    public int a;
    public void meth1(){
        System.out.println("This is method 1  in class A");
    }
    public void meth2(){
        System.out.println("This is method 2 in class A");
    }
    public void meth3(){
        System.out.println("This is method 3 in class A");
    }

}
 class B extends A {
     @Override
     public void meth2() {
         System.out.println("This is method 2 in class B");

     }
 }

     public class CWH_41 {
         public static void main(String[] args) {
             B boy = new B();
             boy.meth2();

         }
     }
