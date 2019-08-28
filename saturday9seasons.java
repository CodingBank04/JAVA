package com.testing;
import java.util.Scanner;


public class saturday9seasons {
    public static void main(String[] args){
        Scanner tempInput = new Scanner(System.in);
        System.out.println("Please enter the temperature: ");

        int temperature = tempInput.nextInt();

        if(temperature <= 20) {
            System.out.println("It is winter.");
        }
        else if(temperature <=40){
            System.out.println("it is fall.");
        }
        else if(temperature <=60){
            System.out.println("It is Spring.");
        }
        else {
            System.out.println("It is Summer.");
        }



    }


}
