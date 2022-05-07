package com.company;

interface Bicycle{
   int i =45;  // its like final a=45 means cant modify
   void applyBreak(int decrement) ;
   void speedUp(int increament);

        }

    interface horn{
        void blowHorn();
    }
     class a1 implements Bicycle,horn{

      public void applyBreak(int decrement){
          System.out.println("Applying break");
      }
      public void speedUp(int increment){
          System.out.println("Applying speedup");
      }
       public  void blowHorn(){
             System.out.println("pee pee poo poo ");
         }
     }

public class CWH_46 {
    public static void main(String[] args) {
        //can creat properties in intreference
                 a1 shriCycle=new a1();
        System.out.println(shriCycle.i);
       shriCycle.applyBreak(4);
       shriCycle.blowHorn();
    }

}
