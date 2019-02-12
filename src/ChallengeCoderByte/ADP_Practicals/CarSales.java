package ChallengeCoderByte.ADP_Practicals;

import javax.swing.*;
import java.util.Random;

/*
Declare one class with a main method in which you do the following:

a)	Write Java statements to declare an array that will store the total car sales values (int) for each month of the
year for South Africa.		(1)

b)	Write Java statements to declare another array and initialize it with the names of the months of the year. 						(1)

c)	The value at index position x in the first array corresponds to the value at the same index position in the second
array.
Initialize the array in (a) with hard-coded random sales values. Using the arrays in (a) and (b) above, write Java
statements to determine and display the highest sales value, and the month in which it occurred. Use the JOptionPane
class to display the output.				(7)

d)	Write Java statements to assign all the names of the months from the array in (b) that start with the letter ‘J’
to another array.		(7)

e)	Write Java statements to display the contents of the 2nd array in a single JOptionPane dialog box. 							(4)

 */
public class CarSales {

    public static void main(String[] args) {
        int[] carSales = new int[13];
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        Random random = new Random();
        int highest = 0;
        int index = 0;

        // assigning random number of sales to the carSales array
        for (int i = 1; i < carSales.length; i++)
            carSales[i] = random.nextInt(Integer.MAX_VALUE - 1) + 1;

        // finding the highest sales in the carSales array
        for (int i = 1; i < carSales.length; i++) {
            if (carSales[i] > highest) {
                highest = carSales[i];
                index = i;
            }
        }

        // displaying the highest sale and the month in which in occurred
        String output = String.format("The highest sale is %d, which has occurred in %s.%n%n", carSales[index], months[index]);
        JOptionPane.showMessageDialog(null, output, "Output", JOptionPane.INFORMATION_MESSAGE);

        int init = 0; // init will hold the size of the new array

        // looking for months starting with J in the months array
        for (String m : months) {
            if (m.startsWith("J"))
                init++;
        }

        String[] newArray = new String[init];

        // assigning months starting with J to the array
        int num = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i].startsWith("J")) {
                newArray[num] = months[i];
                num++;
            }
        }

        // formatting the message to display
        String msg = "";
        for (String str : newArray) {
            msg += String.format(" %s", str);
        }

        // displaying the newArray
        JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.INFORMATION_MESSAGE);

    }

}
