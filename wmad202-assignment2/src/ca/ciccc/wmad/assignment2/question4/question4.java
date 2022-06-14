package ca.ciccc.wmad.assignment2.question4;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int count = 0;
        Boolean condition = true;
        while(condition){
            System.out.println("Enter a number:");
            String number = myObj.nextLine();
            for(int i = 0; i < number.length(); i++){
                if(Character.isDigit(number.charAt(i))){
                    continue;
                }else{
                    condition = false;
                }
            }

            if (condition){
                int intNumber = Integer.parseInt(number);
                if (count == 0){
                    min = intNumber;
                    max = intNumber;
                    count++;
                }else{
                    if(intNumber > max){
                        max = intNumber;
                    }
                    if(intNumber < min){
                        min = intNumber;
                    }
                    count++;
                }
            }
        }
        System.out.println("The min number is: " + min);
        System.out.println("The max number is: " + max);
    }
}
