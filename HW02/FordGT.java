/**
 * Create FordGT subclass.
 * @author Phillip Kim
 * @version 1.0
 */
public class FordGT extends Car {
    private double weight;
    private String driverName;

    /**
     * Constructor that takes in name, make, fuelLevel, horsepower, previousUpgrade, weight, and driverName.
     * @param name The name of the car.
     * @param make The make of the car.
     * @param fuelLevel The fuelLevel of the car.
     * @param horsepower The horsepower of the car.
     * @param previousUpgrade Whether the car as been upgraded before.
     * @param weight The weight of the car.
     * @param driverName The name of the driver.
     */
    public FordGT(String name, String make, double fuelLevel,
        int horsepower, boolean previousUpgrade, double weight, String driverName) {
        super(name, make, fuelLevel, horsepower, previousUpgrade);
        this.weight = weight;
        this.driverName = driverName;
    }

    /**
     * Default Constructor that does not take any parameters.
     */
    public FordGT() {
        this("Pony", "Ford", 100, 450, false, 3300, "Ken Miles");
    }

    @Override
    public String toString() {
        return String.format(super.toString() + ", Weight: %f, Driver: %s", weight, driverName);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        } else {
            return super.equals((Car) obj) && this.weight == ((FordGT) obj).weight;
        }
    }

    @Override
    public void upgrade() {
        if (!this.getPreviousUpgrade()) {
            this.setPreviousUpgrade(true);
            if (this.getHorsepower() < 200) {
                this.setHorsepower(this.getHorsepower() + 100);
            } else {
                this.setHorsepower(this.getHorsepower() + 50);
            }
            this.setFuelLevel(this.getFuelLevel() + 50);
            if (this.getFuelLevel() > this.MAX_FUEL_LEVEL) {
                this.setFuelLevel(this.MAX_FUEL_LEVEL);
            }
        }
    }

    @Override
    public void race(Car anotherCar) {
        if (this.getClass() == anotherCar.getClass() && this.getFuelLevel() > 50 && anotherCar.getFuelLevel() > 50) {
            this.setFuelLevel(this.getFuelLevel() - 25);
            anotherCar.setFuelLevel(anotherCar.getFuelLevel() - 25);
            if (this.getHorsepower() > anotherCar.getHorsepower()) {
                System.out.printf("%s with %s as the driver won against %s with %s as the driver",
                    this.getName(), this.driverName, anotherCar.getName(), ((FordGT) anotherCar).driverName);
            } else if (this.getHorsepower() < anotherCar.getHorsepower()) {
                System.out.printf("%s with %s as the driver won against %s with %s as the driver",
                    anotherCar.getName(), ((FordGT) anotherCar).driverName, this.getName(), this.driverName);
            } else {
                if (this.weight > ((FordGT) anotherCar).weight) {
                    System.out.printf("%s with %s as the driver won against %s with %s as the driver",
                        this.getName(), this.driverName, anotherCar.getName(), ((FordGT) anotherCar).driverName);
                } else if (this.weight < ((FordGT) anotherCar).weight) {
                    System.out.printf("%s with %s as the driver won against %s with %s as the driver",
                        anotherCar.getName(), ((FordGT) anotherCar).driverName, this.getName(), this.driverName);
                } else {
                    System.out.printf("%s tied with %s", anotherCar.getName(), this.getName());
                }
            }
        } else {
            System.out.printf("%s could not race %s", anotherCar.getName(), this.getName());
        }
    }
}