package org.example;
//import util.java.scanner;

import java.util.Scanner;

//import java.util.*; This import all the method of util class
public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Integer Number ");
        int num1= sc.nextInt();
        System.out.println("Enter Second Integer Number ");
        int num2= sc.nextInt();
        int sum;
        sum = num1 + num2;
        System.out.println("Sum of Two Number is " + sum);
    }
}