/**
 * Create ShopDriver class.
 * @author Phillip Kim
 * @version 1.0
 */
public class ShopDriver {
    /**
     * Main method that takes in args used to test Car and Mechanic.
     * @param args An array of strings.
     */
    public static void main(String[] args) {
        double[] tires = {0.70, 0.32, 0.45, 0.50};
        Car c1 = new Car("SUV", 15000, 14600, tires);
        Mechanic m1 = new Mechanic("Raul");
        m1.service(c1);
        System.out.println(c1.toString());
        System.out.println(m1.toString());
        // Test if passing in negative values in tireLife will resort to default values.
        double[] tires1 = {-1.0, 0.75, -3.0, 0.95};
        Car c2 = new Car("Truck", 250, 1000, tires1);
        tires1 = c2.getTireLife();
        for (double tire : tires1) {
            System.out.println(tire);
        }
        // Test other misc code
        Mechanic m2 = new Mechanic("Sam", 20, 0.45, 125);
        System.out.println(m2.toString());
    }
}