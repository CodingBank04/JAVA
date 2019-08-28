package com.testing;
import java.sql.SQLOutput;
import java.util.Scanner;

public class sunday5perimeters {
    public static void main(String[] args){
        Scanner scanParameter = new Scanner(System.in);
        System.out.println(" C for circle, R for rectangle, T for Triangle ");
        String shape = scanParameter.next();
        double perimeter = 0;

        if(shape.equals("C")){
            System.out.println("Please enter radius: ");
            int radius = scanParameter.nextInt();
            perimeter = 2 * 3.14 * radius;

        }
        else if(shape.equals("R")){
            System.out.print("Please width");
            int width = scanParameter.nextInt();
            System.out.println("Please height");
            int height = scanParameter.nextInt();
            perimeter = 2 * (width + height);
        }
        else if (shape.equals("T")) {
            System.out.println("Enter Side 1");
            int side1 = scanParameter.nextInt();
            System.out.println("Enter Side 2");
            int side2 = scanParameter.nextInt();
            System.out.println("Enter Side 3");
            int side3 = scanParameter.nextInt();
            perimeter = side1 + side2 + side3;

        }
        else{
            System.out.println("Please enter C, R or T");
        }
        System.out.printf("Perimeter is: %.3f" , perimeter);


    }


}
