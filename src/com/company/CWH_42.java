package com.company;
//harry ka ye video best hey bro ekdam op analogy
class phone{
    public void showTime(){
        System.out.println("Time is 00 ");
    }
    public void turnOn(){
        System.out.println("Turning on phone");
    }
}

class smartPhone extends phone {
    public void music(){
        System.out.println("playing Mp3");
    }
    public void turnOn(){
        System.out.println("Turning on smart phone");
    }

}

public class CWH_42 {
    public static void main(String[] args) {
           phone samsung = new smartPhone();
        // super class          sub class
//        can say smart phonr a phone but not vice versa
//        jo method commen hey vo smartphone ke hee call hoge
//        jo only phone mai hey vo phone ke hee call hoge
//        and extra smartphone ke jo phone mai nahi vo method call nahi hoge
        samsung.showTime();
        samsung.turnOn();
//        samsung.music();    error in this

    }
}
