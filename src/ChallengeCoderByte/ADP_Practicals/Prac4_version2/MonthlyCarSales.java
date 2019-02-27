/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monthlycarsalesmain;

/**
 *
 * @author kingi
 */
public class MonthlyCarSales {
    
    private String saleMonth = "";
    private double saleValue = 0.0;
    
    public MonthlyCarSales() {


}
    
  public MonthlyCarSales(String mth, double val) {

      saleMonth = mth;
      saleValue = val;

}
    
    public void setSaleMonth(String nm){
    
      saleMonth = nm;  
    
    }
    
    public void setSaleValue(double val){
    
      saleValue = val;  
    
    }
    
    public String getSaleMonth(){
    
        
    return saleMonth;
        
    }
    
    public double getSaleValue(){
    
        
    return saleValue;
        
    }
    
    @Override
    public String toString(){
    
        String output = "\n\nMonth: " + getSaleMonth() + "\nSale: " + getSaleValue();
        
    return output;
        
    }
    
}
