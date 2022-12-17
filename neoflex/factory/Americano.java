package neoflex.factory;

public class Americano implements Coffee{
    private int hotWater = 220; //ml
    private int coffeePowder = 30; //ml
    private String coffeName = "-Americano-";


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
