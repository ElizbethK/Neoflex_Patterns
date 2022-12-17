package neoflex.factory;

public class Espresso implements Coffee{
     private int hotWater = 0; //ml
     private int coffeePowder = 30; //ml
     private String coffeName = "-Espresso-";


    @Override
    public int getVolumeOfWater() {
        return hotWater;
    }

    @Override
    public int getVolumeOfCoffeePowder() {
        return coffeePowder;
    }

    @Override
    public String getTypeOfCoffee() {
        return coffeName;
    }
}
