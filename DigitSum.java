package org.example;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Any Integer Number");
        int number= sc.nextInt();
        while(number>0) {
            int temp= number%10;
            sum+=temp;
            number=number/10;
        }
        System.out.println("Sum of Digits of "+number+" is  "+sum);
    }
}
