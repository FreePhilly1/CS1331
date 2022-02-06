import java.util.Scanner;
/**
 * Create ClassifiedSatellite subclass.
 * @author Phillip Kim
 * @version 1.0
 */
public class ClassifiedSatellite extends Satellite {
    /**
     * Constructor that takes in name, catalogNumber, launchYear, launchDay, inclination, meanMotion.
     * @param name The name of the satellite.
     * @param catalogNumber The catalog number of the satellite.
     * @param launchYear The launch year of the satellite.
     * @param launchDay The launch day of the satellite.
     * @param inclination The inclination of the satellite.
     * @param meanMotion The mean motion of the satellite.
     */
    public ClassifiedSatellite(String name, int catalogNumber,
        int launchYear, int launchDay, double inclination, double meanMotion) {
        super(name, catalogNumber, launchYear, launchDay, inclination, meanMotion);
    }

    @Override
    public String toString() {
        boolean passwordCheck = this.checkPassword();
        if (passwordCheck) {
            return super.toString();
        } else {
            return "INCORRECT PASSWORD";
        }
    }

    @Override
    public String encodeCSV() {
        boolean passwordCheck = this.checkPassword();
        if (passwordCheck) {
            return super.encodeCSV();
        } else {
            return "INCORRECT PASSWORD";
        }
    }

    /**
     * Method that checks the user inputted password.
     * @return A boolean that states whether the password is correct.
     */
    private boolean checkPassword() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Password:");
        String password = myScanner.nextLine();
        return password.equals("f8ee89496da476b3849f4de45a4528b4");
    }
}