package ca.ciccc.wmad.assignment2.question6;

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the statement:");
        String statement = myObj.nextLine();

        int countParenthesisOpened = 0;
        int countParenthesisClosed = 0;
        Boolean condition = true;
        for(int i = 0; i < statement.length(); i++){
            if(countParenthesisOpened >= countParenthesisClosed){
                if(statement.charAt(i) == '('){
                    countParenthesisOpened++;
                }else if((statement.charAt(i) == ')')){
                    countParenthesisClosed++;
                }
                System.out.println("counting");
            }else{
                condition = false;
                break;
            }
        }

        if(countParenthesisClosed == countParenthesisOpened){
            System.out.println("valid statement");
        }
        else{
            System.out.println("invalid statement");
        }
    }
}
