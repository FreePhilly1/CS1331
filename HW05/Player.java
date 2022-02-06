/**
 * Create Player class.
 * @author Phillip Kim
 * @version 1.0
 */
public abstract class Player implements Comparable<Player> {
    private String name;
    private double points;
    private int trophies;

    /**
     * Constructor that takes in name, points, and trophies.
     * @param name The name of the player.
     * @param points The amount of points of the player.
     * @param trophies The amount of trophies of the player.
     */
    public Player(String name, double points, int trophies) {
        this.name = name;
        this.points = points;
        this.trophies = trophies;
    }

    /**
     * Method that calculates a player's skill level.
     * @return A double that represents the player's skill level.
     */
    public abstract double calculateSkillLevel();

    @Override
    public int compareTo(Player player) {
        if (this.calculateSkillLevel() > player.calculateSkillLevel()) {
            return 1;
        } else if (this.calculateSkillLevel() < player.calculateSkillLevel()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        } else {
            Player anotherPlayer = (Player) obj;
            boolean cond1 = this.name.equals(anotherPlayer.name);
            boolean cond2 = this.points == anotherPlayer.points;
            boolean cond3 = this.trophies == anotherPlayer.trophies;
            return cond1 && cond2 && cond3;
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %.1f points - %d trophies", name, points, trophies);
    }

    /**
     * Getter method that returns the name of the player.
     * @return A string representing the name of the player.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Getter method that returns the amount of points of the player.
     * @return A double representing the amount of points of the player.
     */
    public double getPoints() {
        return this.points;
    }
    /**
     * Getter method that returns the amount of trophies of the player.
     * @return A int representing the amount of trophies of the player.
     */
    public int getTrophies() {
        return this.trophies;
    }

    /**
     * Setter method that sets the name of the player.
     * @param name Sets the name of the player.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Setter method that sets the amount of points of the player.
     * @param points Sets the amount of points of the player.
     */
    public void setPoints(double points) {
        this.points = points;
    }
    /**
     * Setter method that sets the amount of trophies of the player.
     * @param trophies Sets the amount of trophies of the player.
     */
    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }
}