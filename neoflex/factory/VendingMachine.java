package neoflex.factory;

public class VendingMachine {

    private CoffeeMachine coffeeMachine;

    public VendingMachine(CoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }

    public void start(CoffeeType coffeeType){
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.getCoffee(coffeeType);

        makeACoffeeChoice();
        System.out.println("   Your coffee is: " + coffee.getTypeOfCoffee());
        coffeeMachine.makeCoffee(coffee);
        bref(coffee.getVolumeOfCoffeePowder(), coffee.getVolumeOfWater());
        pour();
        System.out.println("   Please enjoy your drink and have a nice day! :) ");

    }

    private void makeACoffeeChoice(){
        System.out.println("-> Тhe type of drink is selected.");
    }

    private void bref(int coffeePowder, int hotWater){
        System.out.println(
                "  In your coffee: " + "\n" +
                 "   - " + coffeePowder + " ml. of coffee powder," + "\n" +
                "   - " + hotWater + " ml. of hot water. " + "\n" +
                "-> The drink is brewed.");
    }

    private void pour(){
        System.out.println("-> The drink is ready and poured into a glass.");
    }

}
