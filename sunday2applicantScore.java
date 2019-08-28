package com.testing;
import java.util.Scanner;

public class sunday2applicantScore {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = userInput.nextInt();
        System.out.println("Enter your java score: ");
        double javaScore = userInput.nextDouble();

        double score =0;

        if(age>=20 && age<=30 && javaScore>=80) {
             score = age*1.5 + javaScore * 4.5;
        }
        else if (age>=20 && age<=30 && javaScore<=80){
             score = age*1.5 + javaScore * 3.5;
        }
        else if (age>=31 && javaScore>=80){
             score = age*1.1 + javaScore * 4.5;
        }
        else if (age>=31 && javaScore<=80){
             score = age*1.1 + javaScore * 3.5;
        }
        else {
            System.out.println("Age needs to be above 20");
        }
        System.out.println("Score is: " + score);

    }

}
