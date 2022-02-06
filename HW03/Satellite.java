/**
 * Create Satellite class.
 * @author Phillip Kim
 * @version 1.0
 */
public class Satellite {
    private String name;
    private int catalogNumber;
    private int launchYear;
    private int launchDay;
    private double inclination;
    private double meanMotion;

    /**
     * Constructor that takes in .
     * @param name The name of the satellite.
     * @param catalogNumber The catalog number of the satellite.
     * @param launchYear The launch year of the satellite.
     * @param launchDay The launch day of the satellite.
     * @param inclination The inclination of the satellite.
     * @param meanMotion The mean motion of the satellite.
     */
    public Satellite(String name, int catalogNumber,
        int launchYear, int launchDay, double inclination, double meanMotion) {
        this.name = name;
        this.catalogNumber = catalogNumber;
        this.launchYear = launchYear;
        this.launchDay = launchDay;
        this.inclination = inclination;
        this.meanMotion = meanMotion;
    }

    /**
     * Method that calculates the mean motion of the satellite.
     * @return A double that represents the mean motion.
     */
    public double orbitTime() {
        return (24 * 60) / this.meanMotion;
    }

    /**
     * Method that returns a string representation of the satellite.
     * @return A string representation of the satellite.
     */
    public String toString() {
        return String.format("%s: #%d. Launched on day %d of %d. Inclination: %f degrees. "
            + "%f orbits per day - %f minutes per orbit.\n", this.name, this.catalogNumber,
            this.launchDay, this.launchYear, this.inclination, this.meanMotion, this.orbitTime());
    }

    /**
     * Method that returns a string to be written into a csv file.
     * @return A string to be written into a csv file.
     */
    public String encodeCSV() {
        return String.format("%s, %d, %d, %d, %f, %f, %f\n", this.name, this.catalogNumber, this.launchYear,
            this.launchDay, this.inclination, this.meanMotion, this.orbitTime());
    }
}