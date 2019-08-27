package com.testing;
import java.util.Scanner;

public class saturday7ageExample {
    public static void main(String[] args){

        Scanner ageInput = new Scanner(System.in);
        System.out.println("Enter your age please:");
        int age = ageInput.nextInt();


        if(age>0 && age <=15){
            System.out.println("You are a Child");

        }
        else if(age>15 && age<=23){
            System.out.println("You are a Teenager");
        }

        else {
            System.out.println("You are an Adult");

        }



    }


}
