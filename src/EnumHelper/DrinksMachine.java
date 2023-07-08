package EnumHelper;

public enum DrinksMachine {
    COFFEE(12),
    TEA(15.50),
    LEMONADE(20),
    MOJITO(30.50),
    WATER(2.50),
    COLA(15),
    NOTHING(0);

    public final double price;

    DrinksMachine(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
