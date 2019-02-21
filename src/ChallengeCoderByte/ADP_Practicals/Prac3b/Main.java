package ChallengeCoderByte.ADP_Practicals.Prac3b;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

/**
 * Main.java
 * This is the main app of the monthly sales
 *
 * @author Claude DE-TCHAMBILA
 * Date: 12 Feb 2019
 */
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        // creating an array of 12 monthlyCarSales objects
        MonthlyCarSales[] monthlyCarSales = new MonthlyCarSales[13];
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        // initializing first object in the monthlyCarSales for sorting purposes
        monthlyCarSales[0] = new MonthlyCarSales("", 0);

        for (int i = 1; i < 13; i++) {
            // referencing objects in monthlyCarSales array to class MonthlyCarSales
            monthlyCarSales[i] = new MonthlyCarSales();

            // setting saleMonth attribute for MonthlyCarSales objects
            monthlyCarSales[i].setSaleMonth(months[i]);

            double numberOfSales = 0.0;
            boolean check = true;

            // setting numberOfSales to a valid random number
            while (check) {
                // (rand.nextInt(499) + 2) will generate a range of int random numbers from 2 to 500
                numberOfSales = rand.nextDouble() * (rand.nextInt(499) + 2);

                // checking if numberOfSales is in the range of 2 to 500 included
                if (numberOfSales >= 2 && numberOfSales <= 500)
                    check = false;
            }

            // setting random saleValue attribute for MonthlyCarSales objects
            monthlyCarSales[i].setSaleValue(numberOfSales);
        }

        // determining the highest sales value
        double highest = 0.0;
        int index = 0;

        for (int i = 1; i < monthlyCarSales.length; i++) {
            if (monthlyCarSales[i].getSaleValue() > highest) {
                highest = monthlyCarSales[i].getSaleValue();
                index = i;
            }
        }

        // formatting the message to be displayed
        String msg = String.format("The highest sales value is %.2f in %s", highest, monthlyCarSales[index].getSaleMonth());

        // displaying the highest sale message
        JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.INFORMATION_MESSAGE);

        // determining the lowest sales value
        double lowest = Double.MAX_VALUE;

        for (int j = 1; j < monthlyCarSales.length; j++) {
            if (monthlyCarSales[j].getSaleValue() < lowest) {
                lowest = monthlyCarSales[j].getSaleValue();
                index = j;
            }
        }

        // formatting the message to be displayed
        String msg_1 = String.format("The lowest sales value is %.2f in %s", lowest, monthlyCarSales[index].getSaleMonth());

        // displaying the lowest sale message
        JOptionPane.showMessageDialog(null, msg_1, "Message", JOptionPane.INFORMATION_MESSAGE);

        // determining and displaying all objects in monthlyCarSales that contain the substring 'ar' in the month name
        //ArrayList<MonthlyCarSales> arInMonth = new ArrayList<>();
        String output = "";

        for (int i = 1; i < monthlyCarSales.length; i++) {
            if (monthlyCarSales[i].getSaleMonth().contains("ar")) {
                //arInMonth.add(m);
                output += monthlyCarSales[i].toString() + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, output, "Message", JOptionPane.INFORMATION_MESSAGE);

        // before the sort
        System.out.println("Before sorting");
        for (int i = 1; i < monthlyCarSales.length; i++)
            System.out.println(monthlyCarSales[i]);

        // sorting the contents of the array in alphabetical order
        Arrays.sort(monthlyCarSales);

        // after the sort
        System.out.println("\n\nAfter sorting");
        for (int i = 1; i < monthlyCarSales.length; i++)
            System.out.println(monthlyCarSales[i]);
    }

}
