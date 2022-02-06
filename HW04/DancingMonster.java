/**
 * Create DancingMonster subclass that implements Danceable.
 * @author Phillip Kim
 * @version 1.0
 */
public class DancingMonster extends Monster implements Danceable {
    private String danceMove;
    private int dancesWon;

    /**
     * Constructor that takes in name, spookiness, and danceMove.
     * @param name The name of the monster.
     * @param spookiness The spookiness of the monster.
     * @param danceMove The dance move of the monster.
     */
    public DancingMonster(String name, int spookiness, String danceMove) {
        super(name, spookiness);
        this.danceMove = danceMove;
        this.dancesWon = 0;
    }

    /**
     * Getter method that returns the dance move of the monster.
     * @return Returns the dance move of the monster.
     */
    public String getDanceMove() {
        return this.danceMove;
    }
    /**
     * Getter method that returns the number of dances won by the monster.
     * @return Returns the number of dances won by the monster.
     */
    public int getDancesWon() {
        return this.dancesWon;
    }

    /**
     * Setter method that sets the dance move of the monster.
     * @param danceMove The dance move of the monster.
     */
    public void setDanceMove(String danceMove) {
        this.danceMove = danceMove;
    }
    /**
     * Setter method that sets the number of dances won by the monster.
     * @param dancesWon The number of dances won by the monster.
     */
    public void setDancesWon(int dancesWon) {
        this.dancesWon = dancesWon;
    }


    @Override
    public int dance() {
        System.out.printf("%s does the %s!\n", getName(), danceMove);
        int rand = (int) (Math.random() * (getSpookiness() + 1));
        return rand;
    }

    @Override
    public void wonDance() {
        this.dancesWon = dancesWon + 1;
    }

    @Override
    public String toString() {
        return String.format("%s has a spook rating of %d and has won"
            + " %d dances thus far", getName(), getSpookiness(), dancesWon);
    }
}