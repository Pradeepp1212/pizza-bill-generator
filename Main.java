package pizza_bill_gendrator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        System.out.println("Welcome to pizza shop");

        boolean appRun = true;
        Scanner scanner = new Scanner(System.in);

        while (appRun) {
            Pizza pizza;

            System.out.println("Choose pizza type: 1. Ordinary  2. Deluxe");
            int useropt = scanner.nextInt();

            if (useropt == 1) {
                pizza = new OrdinaryPizza();
                System.out.println("Select: 1.VEG 2.NON_VEG");
                boolean type = scanner.nextInt() == 1;
                pizza.addType(type);

                System.out.println("How many slices?");
                pizza.sliceOfPizza(scanner.nextShort());

                System.out.println("Add toppings? YES/NO");
                pizza.addTopins(handleToppings(scanner.next()));

                System.out.println("Add cheese? 1.Yes 2.No");
                if (scanner.nextInt() == 1) pizza.addCheese();

                System.out.println("Take away? 1.Yes 2.No");
                if (scanner.nextInt() == 1) ((OrdinaryPizza) pizza).takeAway();

                ((OrdinaryPizza) pizza).billGeneration();
            } else {
                DeluxPizza dp = new DeluxPizza();
                System.out.println("Which Type: VEG or NON-VEG");
                dp.addType(handleType(scanner.next()));

                System.out.println("Take away? 1.Yes 2.No");
                if (scanner.nextInt() == 1) ((OrdinaryPizza) dp).takeAway();

                dp.billGeneration();
            }

            System.out.println("Continue? 1.Yes 2.No");
            appRun = scanner.nextInt() == 1;
        }
        scanner.close();
        System.out.println("DONE");
    }

    private static String handleToppings(String choice) {
        if (choice.equalsIgnoreCase("yes")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.vegetables  2.cheese  3.meat");
            return Toppins.values()[sc.nextInt() - 1].toString();
        }
        return null;
    }

    private static boolean handleType(String type) {
        return type.equalsIgnoreCase("veg");
    }
}
