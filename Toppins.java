package pizza_bill_gendrator;

//Represents the standard pizza toppings (vegetables, cheese, meat) as an enum.

public enum Toppins {
    vegetables(1),
    cheese(2),
    meat(3);

    int sequence;
    private Toppins(int sequence) { this.sequence = sequence; }
}