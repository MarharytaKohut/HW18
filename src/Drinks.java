import EnumHelper.DrinksMachine;

public class Drinks {

    private int drinksCounter;
    private double totalPrice;

    public int getDrinksCounter() {
        return drinksCounter;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public static void menuDrinks() {
        DrinksMachine[] drinks = DrinksMachine.values();
        System.out.println("DrinksMachine menu");
        for (int i = 1; i < drinks.length; i++) {
            System.out.printf("\t%d. %s - price: %.2f\n", i, drinks[i - 1], drinks[i - 1].getPrice());
        }
        System.out.println("Type 0 or exit to stop.");
    }

    public void orderDrinks(DrinksMachine drinksMachine) {
        switch (drinksMachine) {
            case COFFEE:
                drinksCounter++;
                totalPrice += drinksMachine.COFFEE.getPrice();
                System.out.printf("Making %s...", drinksMachine);
                break;
            case TEA:
                drinksCounter++;
                totalPrice += drinksMachine.TEA.getPrice();
                System.out.printf("Making %s...", drinksMachine);
                break;
            case LEMONADE:
                drinksCounter++;
                totalPrice += drinksMachine.LEMONADE.getPrice();
                System.out.printf("Making %s...", drinksMachine);
                break;
            case MOJITO:
                drinksCounter++;
                totalPrice += drinksMachine.MOJITO.getPrice();
                System.out.printf("Making %s...", drinksMachine);
                break;
            case WATER:
                drinksCounter++;
                totalPrice += drinksMachine.WATER.getPrice();
                System.out.printf("Making %s...", drinksMachine);
                break;
            case COLA:
                drinksCounter++;
                totalPrice += drinksMachine.COLA.getPrice();
                System.out.printf("Making %s...", drinksMachine);
                break;
        }
    }

    public DrinksMachine getDrinksMachineDrink(String drink) {
        DrinksMachine[] drinks = DrinksMachine.values();
        for (int i = 1; i < drinks.length; i++) {
        if (drinks[i-1].toString().equalsIgnoreCase(drink) || drink.equalsIgnoreCase(String.valueOf(i))){
            return drinks[i-1];
        }
        }
        return DrinksMachine.NOTHING;
    }
}

