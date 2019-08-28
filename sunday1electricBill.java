package com.testing;

import java.util.Scanner;

public class sunday1electricBill {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter kwh spent: ");

        int kwh = userInput.nextInt();

        if(kwh>0 && kwh<500){

            double price = kwh * 0.4;
            System.out.println("Your bill is $" + price);
        }
        else if(kwh<1000){

            double price2 = kwh * 0.5;
            System.out.println("Your bill is $" + price2);

        }
        else {
            double price3 = kwh * 0.6;
            System.out.println("Your bill is &" + price3);
        }


    }
}
