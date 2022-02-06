import java.util.ArrayList;
/**
 * Create GuestList class.
 * @author Phillip Kim
 * @version 1.0
 */
public class GuestList {
    private ArrayList<Monster> guests;
    private DancingMonster bestDancer;

    /**
     * Constructor that takes in guests.
     * @param guests A list of the invited monsters.
     */
    public GuestList(ArrayList<Monster> guests) {
        this.guests = guests;
        int danceExists = 0;
        for (Monster monster : guests) {
            if (monster instanceof DancingMonster) {
                bestDancer = (DancingMonster) monster;
                danceExists = 1;
                break;
            }
        }
        if (danceExists == 1) {
            for (Monster monster : guests) {
                if (monster instanceof DancingMonster && monster.compareTo(bestDancer) > 0) {
                    bestDancer = (DancingMonster) monster;
                }
            }
        } else {
            bestDancer = null;
        }
    }

    /**
     * Constructor that takes in no parameters.
     */
    public GuestList() {
        this.guests = new ArrayList<Monster>();
        this.bestDancer = null;
    }

    /**
     * Method that adds a guest to the list.
     * @param monster Monster to be added to the list.
     */
    public void addGuest(Monster monster) {
        guests.add(monster);
        if (monster instanceof DancingMonster) {
            if (bestDancer == null) {
                bestDancer = (DancingMonster) monster;
            } else if (monster.compareTo(bestDancer) > 0) {
                bestDancer = (DancingMonster) monster;
            }
        }
    }

    /**
     * Method that creates a string representation of the list.
     * @return A string representation of the list.
     */
    public String toString() {
        String monsterList = new String("");
        for (Monster monster : guests) {
            monsterList = monsterList + String.format("%s, ", monster.getName());
        }
        if (monsterList.length() == 0) {
            return monsterList;
        } else {
            return monsterList.substring(0, monsterList.length() - 2);
        }
    }

    /**
     * Method that creates a dance battle between two monsters.
     * @param m1 First monster in the dance battle.
     * @param m2 Second monster in the dance battle.
     */
    public void danceBattle(Monster m1, Monster m2) {
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        if (m1 instanceof DancingMonster && m2 instanceof DancingMonster) {
            int dance1 = ((DancingMonster) m1).dance();
            int dance2 = ((DancingMonster) m2).dance();
            if (dance1 > dance2) {
                System.out.printf("%s won the dance battle!\n", m1.getName());
                ((DancingMonster) m1).wonDance();
            } else if (dance1 < dance2) {
                System.out.printf("%s won the dance battle!\n", m2.getName());
                ((DancingMonster) m2).wonDance();
            } else {
                System.out.println("And this dance battle is a tie!");
            }
        } else if (m1 instanceof DancingMonster) {
            System.out.printf("%s won the dance battle!\n", m1.getName());
            ((DancingMonster) m1).wonDance();
        } else if (m2 instanceof DancingMonster) {
            System.out.printf("%s won the dance battle!\n", m2.getName());
            ((DancingMonster) m2).wonDance();
        } else {
            System.out.println("And this dance battle is a tie!");
        }
    }
}