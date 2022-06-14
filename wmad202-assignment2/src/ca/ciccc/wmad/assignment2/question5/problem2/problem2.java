package ca.ciccc.wmad.assignment2.question5.problem2;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the name...");

        String str = myObj.nextLine();
        String reversedStr="";
        char character;
        for (int i=0; i<str.length(); i++){
            character= str.charAt(i);
            reversedStr= character+reversedStr;
        }
        System.out.println("Original word: "+ str);
        System.out.println("Reversed word: "+ reversedStr);
        if(str == reversedStr){
            System.out.println("are equal");
        }else{
            System.out.println("are not equal");
        }

    }
}
