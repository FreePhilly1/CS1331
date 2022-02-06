import java.util.ArrayList;
/**
 * Create Masters class.
 * @author Phillip Kim
 * @version 1.0
 */
public class Masters {
    private String name;
    private ArrayList<Player> leaderboard;

    /**
     * Constructor that takes in name and leaderboard.
     * @param name The name of the Masters tournament.
     * @param leaderboard A list of players in the Masters tournament.
     */
    public Masters(String name, ArrayList<Player> leaderboard) {
        this.name = name;
        this.leaderboard = leaderboard;
    }

    /**
     * Method that updates the leaderboard to reflect the rankings of the players.
     */
    public void createLeaderboard() {
        for (int i = 1; i < leaderboard.size(); i++) {
            Player currentPlayer = leaderboard.get(i);
            int k;
            for (k = i - 1; k >= 0 && currentPlayer.compareTo(leaderboard.get(k)) > 0; k--) {
                leaderboard.set(k + 1, leaderboard.get(k));
            }
            leaderboard.set(k + 1, currentPlayer);
        }
    }

    /**
     * Method that finds a player in the leaderboards.
     * @param player The player to be found.
     * @return An int the represents the index of the player.
     */
    public int findPlayer(Player player) {
        int index = 0;
        boolean found = false;
        while (!found && index < leaderboard.size()) {
            Player otherPlayer = leaderboard.get(index);
            if (player.equals(otherPlayer)) {
                found = true;
            } else {
                index++;
            }
        }
        if (found) {
            return index;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return String.format("Welcome to the %s tournament!"
            + " The current leaderboard is: %s", name, leaderboard.toString());
    }
}