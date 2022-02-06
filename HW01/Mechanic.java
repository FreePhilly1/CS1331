/**
 * Create Mechanic Class.
 * @author Phillip Kim
 * @version 1.0
 */
public class Mechanic {
    private final String name;
    private double revenue;
    private double oilChangePrice;
    private double newTirePrice;

    /**
     * Constructor that takes in name, revenue, oilChangePrice, newTirePrice.
     * @param name The name of the mechanic.
     * @param revenue The revenue earned by the mechanic.
     * @param oilChangePrice The price charged for an oil change.
     * @param newTirePrice The price charged for a new tire.
     */
    public Mechanic(String name, double revenue, double oilChangePrice, double newTirePrice) {
        this.name = name;
        if (revenue < 0) {
            this.revenue = 0;
        } else {
            this.revenue = revenue;
        }
        if (oilChangePrice < 0.99) {
            this.oilChangePrice = 44.99;
        } else {
            this.oilChangePrice = oilChangePrice;
        }
        if (newTirePrice < 0.99) {
            this.newTirePrice = 59.99;
        } else {
            this.newTirePrice = newTirePrice;
        }
    }

    /**
     * Constructor that takes in name, oilChangePrice, newTirePrice.
     * @param name The name of the mechanic.
     * @param oilChangePrice The price charged for an oil change.
     * @param newTirePrice The price charged for a new tire.
     */
    public Mechanic(String name, double oilChangePrice, double newTirePrice) {
        this(name, 0, oilChangePrice, newTirePrice);
    }

    /**
     * Constructor that takes in name.
     * @param name The name of the mechanic.
     */
    public Mechanic(String name) {
        this(name, 44.99, 59.99);
    }

    /**
     * Method that returns a description of the mechanic.
     * @return Returns a description of the mechanic.
     */
    public String toString() {
        return String.format("This is a mechanic named %s. I charge $%.2f for an oil change, and I charge "
        + "$%.2f for a new tire. I've made $%.2f in revenue.", name, oilChangePrice, newTirePrice, revenue);
    }
    /**
     * Method that takes in a car and lets the mechanic run their service on it.
     * @param c The car of the mechanic.
     */
    public void service(Car c) {
        if (c.getMileage() >= c.getNextOilChange()) {
            c.setNextOilChange(c.getMileage() + 3000);
            this.revenue = this.revenue + oilChangePrice;
        }
        double[] tires = new double[4];
        for (int i = 0; i < c.getTireLife().length; i++) {
            if (c.getTireLife()[i] <= 0.50) {
                tires[i] = 1.00;
                this.revenue = this.revenue + newTirePrice;
            } else {
                tires[i] = c.getTireLife()[i];
            }
        }
        c.setTireLife(tires);
    }
}