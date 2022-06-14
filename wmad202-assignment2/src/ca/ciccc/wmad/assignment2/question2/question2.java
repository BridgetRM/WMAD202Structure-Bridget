package ca.ciccc.wmad.assignment2.question2;

import java.util.Scanner;

public class question2 {
        public static void main(String[] args) {
                Scanner myObj = new Scanner(System.in);
                System.out.println("Enter a number:");

                int number = myObj.nextInt();
                int reverse = 0;
                while(number%10==0){
                        System.out.println("Enter a valid number not divisible by 10...");
                        number = myObj.nextInt();
                }
                while(number != 0){
                        int remainder = number % 10;
                        reverse = reverse*10 + remainder;
                        number = number/10;
                }
                System.out.println("result: " + reverse);
        }
}
