package ChallengeCoderByte.Java_Challenges;

import java.util.Scanner;

/*
    Challenge
Using the Java language, have the function CheckNums(num1,num2) take both parameters being passed and return the string true if num2 is greater than num1, otherwise return the string false. If the parameter values are equal to each other then return the string -1.
Sample Test Cases
Input:3 & num2 = 122

Output:"true"


Input:67 & num2 = 67

Output:"-1"
 */
public class CheckNum {
    /*
    public static String CheckNums(int num1, int num2) {
        Boolean check = false;

        // checking whether num2 is greater than num1
        if(num2 > num1)
            check = true;

        // checking equality and returning comparison results
        if (num2 == num1)
            return "-1";
        else
            return check.toString();
    }
    */

    public static String CheckNums(int num1, int num2) {
        return (num1 == num2 ? "-1" : String.valueOf(num2 > num1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two number: ");
        System.out.print(CheckNums(s.nextInt(), s.nextInt()));
    }

}
