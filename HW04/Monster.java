/**
 * Create Monster class that implements Comparable Danceable.
 * @author Phillip Kim
 * @version 1.0
 */
public class Monster implements Comparable<Monster> {
    private String name;
    private int spookiness;

    /**
     * Constructor that takes in name and spookiness.
     * @param name The name of the monster.
     * @param spookiness The spookiness of the monster.
     */
    public Monster(String name, int spookiness) {
        this.name = name;
        this.spookiness = spookiness;
    }

    @Override
    public int compareTo(Monster monster) {
        if (getSpookiness() > monster.getSpookiness()) {
            return 1;
        } else if (getSpookiness() < monster.getSpookiness()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%s has a spook rating of %d", name, spookiness);
    }

    /**
     * Getter method that returns the name of the monster.
     * @return Returns the name of the monster.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Getter method that returns the name of the spookiness.
     * @return Returns the spookiness of the monster.
     */
    public int getSpookiness() {
        return this.spookiness;
    }

    /**
     * Setter method that sets the name of the monster.
     * @param name Sets the name of the monster.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Setter method that sets the spookiness of the monster.
     * @param spookiness Sets the spookiness of the monster.
     */
    public void setSpookiness(int spookiness) {
        this.spookiness = spookiness;
    }
}