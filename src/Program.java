import EnumHelper.DrinksMachine;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Drinks drinks = new Drinks();
        while (true) {
            Drinks.menuDrinks();
            String drink = scanner.nextLine();
            if (drink != null && (drink.equalsIgnoreCase("exit")
                    || drink.equalsIgnoreCase("0"))){
               break;
            }
            DrinksMachine choice = drinks.getDrinksMachineDrink(drink);
            drinks.orderDrinks(choice);
            System.out.printf("Current price for %s = %.2f \n", choice, choice.getPrice());
        }
        System.out.printf("Total price for drinks(%d) = %.2f", drinks.getDrinksCounter(), drinks.getTotalPrice());
    }
}
