package com.testing;
import java.util.Scanner;

public class sunday6pointOfTheItem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter color of the item B or R:");
        String color = input.next();
        System.out.println("Enter the tag price");
        double price = input.nextDouble();
        System.out.println("Enter the discount percentage 1 to 100");
        double discountAmount = input.nextDouble();
        double pointOfItem;
        double colorPoint =0;

        if(color.equals("R")){ colorPoint = 20; }
        else if(color.equals("B")){ colorPoint = 10; }

        pointOfItem = price * discountAmount - colorPoint;


        if(pointOfItem>=100){
            System.out.println("Dont Buy");}
        else if(pointOfItem>50 && pointOfItem<100){
            System.out.println("Buy Later"); }
        else {
            System.out.println("Buy it now");
        }
    }
}
