package com.company;
interface camera1{
     void pic();
}
interface gps{
    void location();
}

    class phone1{
      public  void start(){
          System.out.println("srarting phone");
      }
    }
    class smartphone1 extends phone implements camera1,gps{
        public void pic(){
            System.out.println("taking photo");
        }
        public  void location(){
            System.out.println("checking gps");
        }
        public void porn(){
            System.out.println("playing porn");
        }
    }


public class CWH_49 {
    public static void main(String[] args) {
//       camera1 cam1= new smartphone1();
//        cam1.pic();

        smartphone1 jio =new smartphone1();
        jio.porn();

    }
}
