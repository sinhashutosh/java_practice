package org.example;

import java.util.Scanner;
import java.util.SortedSet;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1,num2;
        System.out.println("You Can Perform Following Operations");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Enter Your Choices... ");
        int ch=sc.nextInt();

        switch (ch) {

            case 1:
                System.out.println("Enter First Number");
                num1=sc.nextInt();
                System.out.println("Enter Second Number");
                num2=sc.nextInt();
                int sum=num1+num2;
                System.out.println("Sum of Two Number are : " + sum);
                break;
            case 2:
                int dif;
                System.out.println("Enter First Number");
                num1=sc.nextInt();
                System.out.println("Enter Second Number");
                num2=sc.nextInt();
                if (num1>num2) {
                    dif = num1 - num2;
                    System.out.println("Difference of Two Number are : " + dif);
                    break;
                } else {
                    dif = num2 - num1;
                    System.out.println("Difference of Two Number are : " + dif);
                    break;
                }
            case 3:
                System.out.println("Enter First Number");
                num1=sc.nextInt();
                System.out.println("Enter Second Number");
                num2=sc.nextInt();
                int mul=num1*num2;
                System.out.println("Multiplication of Two Number are : " + mul);
                break;
            case 4:
                System.out.println("Enter First Number");
                num1=sc.nextInt();
                System.out.println("Enter Second Number");
                num2=sc.nextInt();
                if(num1>num2) {
                    int div = num1 / num2;
                    int rem;
                    rem = num1 % num2;
                    System.out.println("Division of Two Number are : " + div);
                    System.out.println("And Remainder  are : " + rem);
                    break;
                } else {
                    int div = num2 / num1;
                    int rem;
                    rem = num2 % num1;
                    System.out.println("Division of Two Number are : " + div);
                    System.out.println("And Remainder  are : " + rem);
                    break;
                }
                default:
                    System.out.println("Invalid Selection");
                    break;

        }


    }
}


