/**
 * Create ShelbyMustang subclass.
 * @author Phillip Kim
 * @version 1.0
 */
public class ShelbyMustang extends Car {
    private int racesWon;

    /**
     * Constructor that takes in name, make, fuelLevel, horsepower, previousUpgrade, and racesWon.
     * @param name The name of the car.
     * @param make The make of the car.
     * @param fuelLevel The fuelLevel of the car.
     * @param horsepower The horsepower of the car.
     * @param previousUpgrade Whether the car as been upgraded before.
     * @param racesWon How many races the car has won.
     */
    public ShelbyMustang(String name, String make, double fuelLevel,
        int horsepower, boolean previousUpgrade, int racesWon) {
        super(name, make, fuelLevel, horsepower, previousUpgrade);
        this.racesWon = racesWon;
    }

    /**
     * Default Constructor that does not take any parameters.
     */
    public ShelbyMustang() {
        this("Carroll", "Shelby Automotives", 100, 350, false, 0);
    }

    @Override
    public String toString() {
        return String.format(super.toString() + ", Races Won: %d", racesWon);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        } else {
            return super.equals((Car) obj) && this.racesWon == ((ShelbyMustang) obj).racesWon;
        }
    }

    @Override
    public void race(Car anotherCar) {
        if (this.getClass() == anotherCar.getClass() && this.getFuelLevel() > 50 && anotherCar.getFuelLevel() > 50) {
            this.setFuelLevel(this.getFuelLevel() - 25);
            anotherCar.setFuelLevel(anotherCar.getFuelLevel() - 25);
            if (this.getHorsepower() > anotherCar.getHorsepower()) {
                this.racesWon += 1;
                System.out.printf("%s won against %s", this.getName(), anotherCar.getName());
            } else if (this.getHorsepower() < anotherCar.getHorsepower()) {
                ((ShelbyMustang) anotherCar).racesWon += 1;
                System.out.printf("%s won against %s", anotherCar.getName(), this.getName());
            } else {
                if (this.racesWon > ((ShelbyMustang) anotherCar).racesWon) {
                    this.racesWon += 1;
                    System.out.printf("%s won against %s", this.getName(), anotherCar.getName());
                } else if (this.racesWon < ((ShelbyMustang) anotherCar).racesWon) {
                    ((ShelbyMustang) anotherCar).racesWon += 1;
                    System.out.printf("%s won against %s", anotherCar.getName(), this.getName());
                } else {
                    System.out.printf("%s tied with %s", anotherCar.getName(), this.getName());
                }
            }
        } else {
            System.out.printf("%s could not race %s", anotherCar.getName(), this.getName());
        }
    }
}