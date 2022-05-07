package com.company;

class EkClass{
    public int getA() {
        return a;
    }

    int a;
    EkClass (int v){
        this.a=v; // this.a=a
    }
    public int returnone(){
        return 1;
    }

}
public class CWH_40 {
    public static void main(String[] args) {
        EkClass e= new EkClass(5);
        System.out.println(e.getA());

    }
}
