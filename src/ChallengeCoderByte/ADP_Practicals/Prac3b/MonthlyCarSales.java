package ChallengeCoderByte.ADP_Practicals.Prac3b;

/**
 * MonthlyCarSales.java
 * This is the worker class of monthly car sales
 *
 * @author Claude DE-TCHAMBILA
 * Date: 12 Feb 2019
 */
public class MonthlyCarSales implements Comparable<MonthlyCarSales>{

    private String saleMonth;
    private double saleValue;

    // no-argument constructor
    public MonthlyCarSales() {
    }

    // argument constructor
    public MonthlyCarSales(String saleMonth, double saleValue) {
        this.saleMonth = saleMonth;
        this.saleValue = saleValue;
    }

    // setters
    public void setSaleMonth(String saleMonth) {
        this.saleMonth = saleMonth;
    }

    public void setSaleValue(double saleValue) {
        this.saleValue = saleValue;
    }

    // getters
    public String getSaleMonth() {
        return saleMonth;
    }

    public double getSaleValue() {
        return saleValue;
    }

    @Override
    public String toString() {
        return String.format("MonthlyCarSales {saleMonth= '%s', saleValue= '%.2f'}", getSaleMonth(), getSaleValue());
    }

    @Override
    public int compareTo(MonthlyCarSales o) {
        return this.getSaleMonth().compareTo(o.getSaleMonth());
    }
}
