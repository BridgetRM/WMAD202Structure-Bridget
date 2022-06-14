package ca.ciccc.wmad.assignment2.question3;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number:");

        int number = myObj.nextInt();
        int[] binaryNum = new int[1000];
        int i = 0;
        while (number > 0)
        {
            binaryNum[i] = number % 2;
            number = number / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--){
            System.out.print(binaryNum[j]);
        }
        System.out.println();
    }
}
