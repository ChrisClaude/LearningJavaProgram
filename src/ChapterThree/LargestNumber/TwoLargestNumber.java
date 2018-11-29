package ChapterThree.LargestNumber;

import java.util.Scanner;

/**
 * TwoLargestNumber.java
 * In this program the user can input 10 numbers(integers)
 * each num can only be input once 
 * and the computer determines the two largest numbers
 * 
 * @author Claude C DE-TCHAMBILA
 * Date: 29 November 2018
 */
public class TwoLargestNumber {

    public static void main(String[] args) {
        int seclargest = 0;
        int largest = 0;
        int counter = 0;
        int num;
        Scanner input = new Scanner(System.in); 
        
        while(counter < 10) {
            System.out.print("Enter a num: ");
            num = input.nextInt();
            
            if(num > largest){
                seclargest = largest;
                largest = num;
            }
            
            ++counter;
        }

        System.out.println();
        System.out.printf("The two largest numbers are: %d and %d\n", largest, seclargest);
        
    }
    
}
