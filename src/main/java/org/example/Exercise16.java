/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise16 {
    public static void main (String []args)
    {
        Scanner scan = new Scanner(System.in);

        int legal = 16;

        System.out.println("What is your age?");
        int age = scan.nextInt();

        if(age >= 16)
            System.out.println("You are old enough to legally drive.");
        else
            System.out.println("You are not old enough to legally drive.");
    }
}