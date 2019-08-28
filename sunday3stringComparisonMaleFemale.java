package com.testing;
import java.util.Scanner;

public class sunday3stringComparisonMaleFemale {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter F or M for gender");
        String gender = userInput.next();

        if(gender == "M"){
            System.out.println("Male");
        }
        else if (gender == "F") {
            System.out.println("Female");
        }
        else{

        }


    }


}
