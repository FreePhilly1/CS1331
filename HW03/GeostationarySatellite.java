/**
 * Create GeostationarySatellite subclass.
 * @author Phillip Kim
 * @version 1.0
 */
public class GeostationarySatellite extends Satellite {
    /**
     * Constructor that takes in .
     * @param name The name of the satellite.
     * @param catalogNumber The catalog number of the satellite.
     * @param launchYear The launch year of the satellite.
     * @param launchDay The launch day of the satellite.
     * @param inclination The inclination of the satellite.
     */
    public GeostationarySatellite(String name, int catalogNumber,
        int launchYear, int launchDay, double inclination) {
        super(name, catalogNumber, launchYear, launchDay, inclination, 1.0);
    }
}