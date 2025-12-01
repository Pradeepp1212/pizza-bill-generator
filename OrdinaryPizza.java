package pizza_bill_gendrator;

//Standard pizza implementation
public class OrdinaryPizza implements Pizza {

private static final float TAKE_AWAY = 0;
private float total = 0;
private float perSlice = 75;  // default price per slice

 @Override
 public void addType(boolean veg) {
     // Adds base toppings cost based on veg/non-veg
     if (veg) total += vegetables + cheese;
     else total += meat + cheese;
 }

 @Override
 public void sliceOfPizza(short slices) {
     // Adds cost based on slice count
     total += perSlice * slices;
 }

 @Override
 public void addTopins(String topping) {
     if (topping == null) return;

     switch (topping.toLowerCase()) {
         case "meat": total += meat; break;
         case "vegetables": total += vegetables; break;
         case "cheese": total += cheese; break;
         default: break;
     }
 }

 @Override
 public void addCheese() {
     total += cheese;
 }

 public void takeAway() {
     total += TAKE_AWAY;
 }

 // Getters and setters
 public float getPerSlice() { return perSlice; }
 protected void setPerSlice(int price) { this.perSlice = price; }
 protected void setTotal(float total) { this.total = total; }
 public float getTotal() { return total; }

 public void billGeneration() {
     System.out.println(
         "\n=============================================\n" +
         "               PIZZA BILL SUMMARY            \n" +
         "=============================================\n" +
         " Base Price per Slice   : ₹ " + perSlice + "\n" +
         "---------------------------------------------\n" +
         " Additional Toppings     : Added As Selected\n" +
         " Take Away Charges       : Applied If Selected\n" +
         "---------------------------------------------\n" +
         String.format(" TOTAL PAYABLE AMOUNT   : ₹ %.2f\n", total) +
         "=============================================\n" +
         "        Thank you for dining with us!        \n" +
         "=============================================\n"
     );
 }



}
