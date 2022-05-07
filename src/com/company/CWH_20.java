package com.company;

import java.util.Scanner;
import java.util.Random;

public class CWH_20 {
    public static void main(String[] args) {

        Random rad = new Random();
        int num = rad.nextInt(3);

        int var;
        int score = 0;
        int score_comp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to game");
        int n = 0;
        while (n < 5) {
            System.out.println("Enter\n0 for rock\n 1 for paper \n 2 for sccisor");


            var = sc.nextInt();

            if ((var == 0 && num == 0) || (var == 1 && num == 1) || (var == 2 && num == 2)) {
                System.out.println("draw");
            } else if ((var == 0 && num == 1) || (var == 1 && num == 2) || (var == 2 && num == 0)) {
                System.out.println("you lose");
                score_comp++;
            } else if ((var == 0 && num == 2) || (var == 1 && num == 0) || (var == 2 && num == 1)) {
                System.out.println("you won");
                score++;

            }


            n++;
        }
        if (score_comp > score)
            System.out.println("you lose");
        else if (score_comp < score)
            System.out.println("you won hurrey");
        else
            System.out.println("match draw");

        System.out.println("THanks for playing");

    }

}
