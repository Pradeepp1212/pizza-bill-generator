package pizza_bill_gendrator;


//Deluxe pizza variant with fixed slices & pricing
/*
 A special pizza type with fixed slices and premium pricing.
It comes with auto-included toppings.
User only chooses veg/non-veg and takeaway.
Bill format is different and more decorated.
 */
public class DeluxPizza extends OrdinaryPizza {

 private final short slices = 10;
 private final int price = 100;

 public DeluxPizza() {
     setPerSlice(price);
     setTotal(slices * price);
 }

 @Override
 public void addType(boolean veg) {
     // Deluxe includes premium toppings automatically
     float total = getTotal();
     total += veg ? (vegetables + cheese) : (meat + vegetables + cheese);
     setTotal(total);
 }

 public short getSlices() { return slices; }

 @Override
 public void billGeneration() {
     System.out.println(
         "\n*************************************************\n" +
         "                 DELUXE PIZZA BILL               \n" +
         "*************************************************\n" +
         " Pizza Type             : Deluxe\n" +
         " Slices Included        : " + getSlices() + "\n" +
         " Base Price per Slice   : ₹ " + getPerSlice() + "\n" +
         "-------------------------------------------------\n" +
         " Toppings Added         : Premium Auto-included\n" +
         " Take Away Charges      : Applied If Selected\n" +
         "-------------------------------------------------\n" +
         String.format(" TOTAL PAYABLE AMOUNT   : ₹ %.2f\n", getTotal()) +
         "*************************************************\n" +
         "      Enjoy your mega deluxe bite!               \n" +
         "*************************************************\n"
     );
 }
}
