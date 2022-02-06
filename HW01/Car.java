/**
 * Create Car class.
 * @author Phillip Kim
 * @version 1.0
 */
public class Car {
    private String type;
    private int mileage;
    private int nextOilChange;
    private double[] tireLife = new double[4];
    private static int numCars;

    /**
     * Constructor that takes in type, mileage, nextOilChange, tireLife.
     * @param type The type of car.
     * @param mileage The mileage on the car.
     * @param nextOilChange The mile value when the next oil change is needed.
     * @param tireLife An array with a tire life percentage for each tire.
     */
    public Car(String type, int mileage, int nextOilChange, double[] tireLife) {
        this.type = type;
        if (mileage < 0) {
            this.mileage = 0;
        } else {
            this.mileage = mileage;
        }
        this.nextOilChange = nextOilChange;
        if (nextOilChange < 0) {
            this.nextOilChange = 3000 + this.mileage;
        }
        for (int i = 0; i < tireLife.length; i++) {
            if (tireLife[i] < 0 || tireLife[i] > 1) {
                this.tireLife[i] = 1;
            } else {
                this.tireLife[i] = tireLife[i];
            }
        }
        numCars++;
    }

    /**
     * Constructor that takes in type, mileage, tireLife.
     * @param type The type of car.
     * @param mileage The mileage on the car.
     * @param tireLife An array with a tire life percentage for each tire.
     */
    public Car(String type, int mileage, double[] tireLife) {
        this(type, mileage, mileage + 3000, tireLife);
    }

    /**
     * Constructor that takes in type and tireLife.
     * @param type The type of car.
     * @param tireLife An array with a tire life percentage for each tire.
     */
    public Car(String type, double[] tireLife) {
        this(type, 0, tireLife);
    }

    /**
     * Constructor that takes in anotherCar and makes a Deep Copy.
     * @param anotherCar A Car object to be copied.
     */
    public Car(Car anotherCar) {
        this.type = new String(anotherCar.type);
        this.mileage = anotherCar.mileage;
        this.nextOilChange = anotherCar.nextOilChange;
        this.tireLife = new double[4];
        for (int i = 0; i < this.tireLife.length; i++) {
            this.tireLife[i] = anotherCar.tireLife[i];
        }
        numCars++;
    }

    /**
     * Method that returns the average tire life as a percentage.
     * @return Returns the average tire life as a percentage.
     */
    private int averageTireLife() {
        double tireSum = 0;
        for (double tire : this.tireLife) {
            tireSum += tire;
        }
        tireSum = ((tireSum) / 4) * 100;
        return (int) tireSum;
    }

    /**
     * Method that returns a description of the car.
     * @return Returns a description of the car as a string.
     */
    public String toString() {
        return String.format("This is a car of type %s with a mileage of %d miles. I'm due for"
        + " a checkup in %d miles, and "
        + "my average tire life is %d%%.", type, mileage, nextOilChange - mileage, this.averageTireLife());
    }

    /**
     * Getter method that returns the type of car.
     * @return Returns the type of car.
     */
    public String getType() {
        return new String(this.type);
    }
    /**
     * Getter method that returns the mileage of the car.
     * @return Returns the mileage of the car.
     */
    public int getMileage() {
        return this.mileage;
    }
    /**
     * Getter method that returns maximum mile before oil change.
     * @return Returns the maximum mile before an oil change is needed.
     */
    public int getNextOilChange() {
        return this.nextOilChange;
    }
    /**
     * Getter method that returns the condition of each tire.
     * @return Returns an array with the life of each tire as a percentage.
     */
    public double[] getTireLife() {
        double[] tireLifeCopy = new double[4];
        for (int i = 0; i < tireLifeCopy.length; i++) {
            tireLifeCopy[i] = this.tireLife[i];
        }
        return tireLifeCopy;
    }

    /**
     * Setter method that sets the type of car.
     * @param type Sets the type of car.
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * Setter method that sets the mileage of the car.
     * @param mileage Sets the mileage of the car.
     */
    public void setMileage(int mileage) {
        if (mileage < 0) {
            this.mileage = 0;
        } else {
            this.mileage = mileage;
        }
    }
    /**
     * Setter method that sets the maximum mile of the car.
     * @param nextOilChange Sets the maximum mile of the car.
     */
    public void setNextOilChange(int nextOilChange) {
        if (nextOilChange < 0) {
            this.nextOilChange = this.mileage + 3000;
        } else {
            this.nextOilChange = nextOilChange;
        }
    }
    /**
     * Setter method that sets the tire life of the car.
     * @param tireLife Sets the tire life of the car.
     */
    public void setTireLife(double[] tireLife) {
        for (int i = 0; i < tireLife.length; i++) {
            if (tireLife[i] < 0 || tireLife[i] > 1) {
                this.tireLife[i] = 1;
            } else {
                this.tireLife[i] = tireLife[i];
            }
        }
    }

}