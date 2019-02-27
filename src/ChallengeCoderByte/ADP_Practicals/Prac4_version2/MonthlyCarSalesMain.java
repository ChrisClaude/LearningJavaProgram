/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monthlycarsalesmain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author kingi
 */
public class MonthlyCarSalesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        
        b)	In another class with a main method write Java statements to 
        generate random sales values for 12 MonthlyCarSales objects using the 
        Random class. The sales values must be in the range of 2 to 500. 
        ssign the objects to an array.
        
         */
        Random r = new Random();

        int randomValue = 0;
        String mth = "";
        String[] months = new String[]{"January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"};

        MonthlyCarSales mcs;
        MonthlyCarSales[] mcsArray = new MonthlyCarSales[12];

        for (int i = 0; i < mcsArray.length; i++) {

            randomValue = r.nextInt(499) + 2;
            mcs = new MonthlyCarSales(months[i], randomValue);
            mcs.setSaleMonth(months[i]);
            mcs.setSaleValue(randomValue);
            mcsArray[i] = mcs;

        }

        /*
        
        c)	Now write Java statements to determine and display the 
        highest sales value, and the month in which it occurred.
        Use the JOptionPane class to display the output. Do the same 
        for the lowest sales value
        
         */
        double[] allSalesValues = new double[12];
        for (int i = 0; i < 12; i++) {

            allSalesValues[i] = mcsArray[i].getSaleValue(); // Yes, I know I 
                                                            // oould've just
                                                            // put this inside
                                                            // the previous
                                                            // for loop but
                                                            // it's over here
                                                            // clarity's sake.

        }

        //getting the highest
        double highestSale = Arrays.stream(allSalesValues).max().getAsDouble();
      
        int getMonthofHigh = Arrays.stream(allSalesValues).boxed().collect(Collectors.toList())
                .indexOf(highestSale);

        //getting the lowest
        double lowestSale = Arrays.stream(allSalesValues).min().getAsDouble();

        int getMonthofLow = Arrays.stream(allSalesValues).boxed().collect(Collectors.toList())
                .indexOf(lowestSale);
     
        //displaying it all
        JOptionPane.showMessageDialog(null, "The highest sale of " + highestSale
                + " occured in the month of " + months[getMonthofHigh] + "."
                + "\nThe lowest sale of " + lowestSale
                + " occured in the month of " + months[getMonthofLow] + ".");
        
        /*
        
        Write Java statements to determine and display all the details of the 
        objects in the array that contain the substring ‘ar’ in the month name.			
        The results must be displayed in a single JOptionPane dialog box.
        
         */
       String output = "";
    
        for (int i = 0; i < months.length; i++) {
           
            if (mcsArray[i].getSaleMonth().contains("ar")) {
            
            output += "\n" + mcsArray[i].getSaleMonth() + "\t\t" + mcsArray[i].getSaleValue(); 
                
        }
            
            
        }
        
        String title = "Month:\t\tSale Amount:\n";
        
        JOptionPane.showMessageDialog(null, new JTextArea(title + output));
        
        
        /*
        
        Optional: Write Java statements to sort the contents of the array in 
        alphabetical order. Display the array contents before and after the sort.
        You can use System.out.println to display contents.
        
        */
      
        HashMap hm = new HashMap(); // values are stored in a HashMap so that the
                                    // Sales data is synchronized with each month
        
        ArrayList alSales = new ArrayList();
        for (int i = 0; i < mcsArray.length; i++) {
            
            hm.put(mcsArray[i].getSaleMonth(), mcsArray[i].getSaleValue());
            
            alSales.add(mcsArray[i].getSaleValue());
            
        }
        String beforeSort = "";
        String afterSort = "";
        
        for (int i = 0; i < mcsArray.length; i++) {
            
            beforeSort += mcsArray[i].toString();
            
        }
        Arrays.sort(months);
        
        for (int i = 0; i < mcsArray.length; i++) {
            
            mcs = new MonthlyCarSales(months[i], Double.valueOf(hm.get(months[i]).toString()));
            mcs.setSaleMonth(months[i]);
            
            mcs.setSaleValue(Double.valueOf(hm.get(months[i]).toString()));
            mcsArray[i] = mcs;
            
        }
        
        for (int i = 0; i < mcsArray.length; i++) {
            
            afterSort += mcsArray[i].toString();
            
        }
        
        System.out.println("*****************************\nBefore the sort:\n*****************************" +
                beforeSort + "\n\n" + "*****************************\nAfter the sort:\n*****************************" + afterSort);
        
        
    }

}
