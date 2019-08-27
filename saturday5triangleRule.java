package com.testing;

import java.util.Scanner;

public class saturday5triangleRule {
    public static void main(String[] args) {
        Scanner edge = new Scanner(System.in);

        System.out.println("Please enter edge1 value");
        int edge1 = edge.nextInt();
        System.out.println("Please enter edge2 value");
        int edge2 = edge.nextInt();
        System.out.println("Please enter edge3 value");
        int edge3 = edge.nextInt();


        if(edge1<edge2+edge3 && edge2<edge1+edge3 && edge3<edge1+edge2) {

            System.out.println("This is a triangle.");
        }
        else{
            System.out.println("This is not a triangle");
        }

    }
}
