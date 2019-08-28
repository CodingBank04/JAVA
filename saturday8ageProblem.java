package com.testing;
import java.util.Scanner;

public class saturday8ageProblem {
    public static void main(String[] args){

        Scanner ageInput = new Scanner(System.in);
        System.out.println("Please enter the age");
        int age = ageInput.nextInt();

        if(age<0) {
            System.out.println("print cannot be negative");

        }

        else if(age>120) {
            System.out.println("print cannot be larger than 120");
        }

        else {
            System.out.println("Your age is: " + age);
        }


    }


}
