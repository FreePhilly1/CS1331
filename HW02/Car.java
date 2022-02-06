/**
 * Create Car class.
 * @author Phillip Kim
 * @version 1.0
 */
public abstract class Car {
    private String name;
    private String make;
    private double fuelLevel;
    private int horsepower;
    private boolean previousUpgrade;
    protected static final double MAX_FUEL_LEVEL = 100;

    /**
     * Constructor that takes in name, make, fuelLevel, horsepower, and previousUpgrade.
     * @param name The name of the car.
     * @param make The make of the car.
     * @param fuelLevel The fuelLevel of the car.
     * @param horsepower The horsepower of the car.
     * @param previousUpgrade Whether the car as been upgraded before.
     */
    public Car(String name, String make, double fuelLevel, int horsepower, boolean previousUpgrade) {
        this.name = name;
        this.make = make;
        this.fuelLevel = fuelLevel;
        if (fuelLevel > MAX_FUEL_LEVEL) {
            this.fuelLevel = MAX_FUEL_LEVEL;
        }
        this.horsepower = horsepower;
        this.previousUpgrade = previousUpgrade;
    }

    /**
     * Getter method that returns the name of the car.
     * @return Returns the name of the car.
     */
    public String getName() {
        return name;
    }
    /**
     * Getter method that returns the make of the car.
     * @return Returns the make of the car.
     */
    public String getMake() {
        return make;
    }
    /**
     * Getter method that returns the fuel level of the car.
     * @return Returns the fuel level of the car.
     */
    public double getFuelLevel() {
        return fuelLevel;
    }
    /**
     * Getter method that returns the horsepower of the car.
     * @return Returns the horsepower of the car.
     */
    public int getHorsepower() {
        return horsepower;
    }
    /**
     * Getter method that returns if the car has been upgraded.
     * @return Returns whether the car has been upgraded.
     */
    public boolean getPreviousUpgrade() {
        return previousUpgrade;
    }

    /**
     * Setter method that sets the name of the car.
     * @param name Sets the name of the car.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Setter method that sets the make of the car.
     * @param make Sets the make of the car.
     */
    public void setMake(String make) {
        this.make = make;
    }
    /**
     * Setter method that sets the fuel level of the car.
     * @param fuelLevel Sets the fuel level of the car.
     */
    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
    /**
     * Setter method that sets the horsepower of the car.
     * @param horsepower Sets the horsepower of the car.
     */
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
    /**
     * Setter method that sets whether the car has been upgraded.
     * @param previousUpgrade Sets whether the car has been upgraded.
     */
    public void setPreviousUpgrade(boolean previousUpgrade) {
        this.previousUpgrade = previousUpgrade;
    }

    @Override
    public String toString() {
        return String.format("Car named: %s, Make: %s, Fuel Amount: %.1f, HP: %d", name, make, fuelLevel, horsepower);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        } else {
            Car anotherCar = (Car) obj;
            boolean cond1 = this.name.equals(anotherCar.name);
            boolean cond2 = this.make.equals(anotherCar.make);
            boolean cond3 = this.horsepower == anotherCar.horsepower;
            return cond1 && cond2 && cond3;
        }
    }

    /**
     * Method that upgrades the car.
     */
    public void upgrade() {
        if (!this.previousUpgrade) {
            if (this.horsepower < 200) {
                this.horsepower = this.horsepower + 100;
            } else {
                this.horsepower = this.horsepower + 50;
            }
        }
        this.previousUpgrade = true;
    }

    /**
     * Method that takes in a car and races the two cars.
     * @param anotherCar Takes in another car to race.
     */
    public abstract void race(Car anotherCar);
}