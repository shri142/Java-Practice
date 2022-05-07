package com.company;
class circle{
    public int radius;
    circle(){
        System.out.println("not parameterised constructor");
    }
    circle(int r ){
        System.out.println("circle ka  constructr");
        this.radius=r;
    }

   public double area(){
       return Math.PI * this.radius * this.radius;
   }

}

class cylinder extends circle{
    cylinder(int r,int h){
     super(r); // if there is no super ...
        System.out.println("i m cylinder ");
     this.height =h;
    }

    public int height;
    public double volume(){
        return Math.PI * this.radius * this.radius*this.height;

    }

}
public class CWH_44 {
    public static void main(String[] args) {
        circle obj1 = new circle(6);
        cylinder obj=new cylinder(5,7);


    }
}
