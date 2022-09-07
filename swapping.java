package org.example;

public class swapping {
    public static void main(String[] args) {
        int number1 = 456;
        int number2 = 657;
        System.out.println("Number are number1= "+number1+"Number2= "+number2);
        int temp;
        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("Number after swapping are ");
        System.out.println("number1= "+number1+"Number2= "+number2);

    }
}
