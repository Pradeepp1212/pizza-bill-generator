package pizza_bill_gendrator;

//Common pizza blueprint
public interface Pizza {
    int TakeAway = 20;
    int meat = 35;
    int vegetables = 25;
    int cheese = 25;

    void addType(boolean veg);

    void sliceOfPizza(short slices);

    void addTopins(String toppin);

    void addCheese();

	

	
}

