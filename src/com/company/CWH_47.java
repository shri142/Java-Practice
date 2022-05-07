package com.company;
interface sample{
    void meth1();
    void meth2();
}
interface childSample extends sample{
//    void meth1();
//    void meth2();   dry method ka use kar na chutiya jese ki interference
    void meth3();
}
  class MySample implements childSample {
    public void meth1(){
        System.out.println("meth1");//meth1 and meth2 ko bina implement kiye iss class mai meth 3ke function koo implement nahi kar saktey
    }
      public void meth2(){
          System.out.println("meth2");
      }
    public void meth3(){
        System.out.println("meth3");
    }


  }

public class CWH_47 {
    public static void main(String[] args) {
        MySample obj =new MySample();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}
