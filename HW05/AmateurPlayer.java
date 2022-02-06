/**
 * Create AmateurPlayer subclass.
 * @author Phillip Kim
 * @version 1.0
 */
public class AmateurPlayer extends Player {
    /**
     * Constructor that takes in name, points, and trophies.
     * @param name The name of the player.
     * @param points The amount of points of the player.
     * @param trophies The amount of trophies of the player.
     */
    public AmateurPlayer(String name, double points, int trophies) {
        super(name, points, trophies);
    }

    /**
     * Method that calculates a player's skill level.
     * @return A double that represents the player's skill level.
     */
    public double calculateSkillLevel() {
        return this.getPoints() + 0.5 * this.getTrophies();
    }
}