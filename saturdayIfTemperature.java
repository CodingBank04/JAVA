package com.testing;
import java.util.Scanner;

public class saturdayIfTemperature {
    public static void main(String[] args) {
       Scanner temperature = new Scanner(System.in);
        System.out.println("Please enter the temperature : ");

        if(temperature.nextInt() <= 30) {

            System.out.println("Wear hat");

        }
        else {
            System.out.println("Wear socks");
        }




    }
}
