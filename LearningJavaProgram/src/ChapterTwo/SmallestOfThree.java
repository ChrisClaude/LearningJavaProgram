package ChapterTwo;

import java.util.Scanner;

/**
 * SmallestOfThree.java
 * This program compares three numbers input by the user
 * then prints the smallest
 * @author: Claude Christ DE-TCHAMBILA
 * Date: 31 October 2018
 */
public class SmallestOfThree {

    public static void main(String[] args){
        int x, y, z;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        x= input.nextInt();

        System.out.print("Enter second number: ");
        y = input.nextInt();

        System.out.print("Enter third number: ");
        z = input.nextInt();

        if(x < y) {
            if(x < z)
                System.out.printf("%d is the smallest number", x);
        }

        if(y < x) {
            if(y < z)
                System.out.printf("%d is the smallest number", y);
        }

        if(z < y) {
            if(z < x)
                System.out.printf("%d is the smallest number", z);
        }

    }

}
