package neoflex.factory;

public class CoffeeFactory {

    public Coffee getCoffee(CoffeeType coffeeType){
        Coffee coffee;
        switch (coffeeType){
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
            default: throw new IllegalArgumentException("! incorrect type of coffee.");
        } return coffee;
    }
}
