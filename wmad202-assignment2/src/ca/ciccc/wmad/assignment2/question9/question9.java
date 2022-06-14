package ca.ciccc.wmad.assignment2.question9;

import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Boolean condition = true;
        while(condition){
            System.out.println("Enter the name:");
            String name = myObj.nextLine();
            for(int i = 0; i < name.length(); i++){
                if(Character.isDigit(name.charAt(i))){
                    condition = false;
                }else{
                    continue;
                }
            }
            if(condition){
                System.out.println(name.toUpperCase());
            }else{
                break;
            }
        }
    }
}
