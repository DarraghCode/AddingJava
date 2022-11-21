package com.DarraghCODE.Learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //First take the input
        System.out.println("Enter the first object for addition: ");
        Scanner myObj = new Scanner(System.in);
        //First check if its a float
        if (myObj.hasNextFloat()) {
            float a = myObj.nextFloat();
            System.out.println("Enter the next number: ");
            float b = myObj.nextFloat();
            myObj.close();
            // It will return the sum of a and b.
            System.out.println("The sum of a and b is = " + Float.sum(a, b));
        } else if (myObj.hasNext()) {
            String a = myObj.next();
            System.out.println("Enter the thing to add to '"+ a +"'");
            String b = myObj.next();
            myObj.close();
            // It will return the addition of a and b.
            System.out.println("The combo of a and b is = " + (a + " " + b));
        }
    }
}

