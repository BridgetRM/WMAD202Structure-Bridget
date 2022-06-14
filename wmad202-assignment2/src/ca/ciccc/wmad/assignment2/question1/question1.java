package ca.ciccc.wmad.assignment2.question1;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter numbers...");

        int a = myObj.nextInt();
        int b = myObj.nextInt();

        System.out.println();
        System.out.println("all numbers between A and B (A and B not included), which are divisible to both 3 and 5:");
        for(int i = a+1; i < b; i++){
            if((i%3==0) && (i%5==0)){
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("all numbers between A and B (A included by B not included), which are divisible by either 6 or 7:");

        for(int i = a; i < b; i++){
            if((i%6==0) || (i%7==0)){
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println("all numbers between A and B (A and B both included), which are not divisible by 3:");

        for(int i = a; i <= b; i++){
            if(i%3 != 0){
                System.out.println(i);
            }
        }
    }
}
