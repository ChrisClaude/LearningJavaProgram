package Chapter_8.Using_BigDecimal_for_Precise_Monetary_Calculations;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * Interest.java
 * Compound-Interest calculations with BigDecimal
 */
public class Interest {

    public static void main(String[] args) {
        // initial principal amount before interest
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05); // interest rate

        // display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        // calculate amount on deposit for each of ten years
        for (int year = 0; year <= 10; year++) {
            // calculate new amount for specified year
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));

            // display the year and the amount
            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
        }
    }

}
