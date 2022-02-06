import java.util.ArrayList;
/**
 * Create GrandSlam class.
 * @author Phillip Kim
 * @version 1.0
 */
public class GrandSlam {
    private String name;
    private ArrayList<ProfessionalPlayer> leaderboard;

    /**
     * Constructor that takes in name and leaderboard.
     * @param name The name of the GrandSlam tournament.
     * @param leaderboard A list of players in the GrandSlam tournament.
     */

    public GrandSlam(String name, ArrayList<ProfessionalPlayer> leaderboard) {
        this.name = name;
        this.leaderboard = leaderboard;
        this.createLeaderboard();
    }

    /**
     * Method that updates the leaderboard to reflect the rankings of the players.
     */
    public void createLeaderboard() {
        for (int i = 0; i < leaderboard.size() - 1; i++) {
            int maxIdx = i;
            ProfessionalPlayer currentPlayer = leaderboard.get(i);

            for (int k = i + 1; k < leaderboard.size(); k++) {
                if (currentPlayer.compareTo(leaderboard.get(k)) < 0) {
                    currentPlayer = leaderboard.get(k);
                    maxIdx = k;
                }
            }

            if (maxIdx != i) {
                leaderboard.set(maxIdx, leaderboard.get(i));
                leaderboard.set(i, currentPlayer);
            }
        }
    }

    /**
     * Method that finds a player in the leaderboards.
     * @param player The player to be found.
     * @return An int the represents the index of the player.
     */
    public int findPlayer(ProfessionalPlayer player) {
        int min = 0;
        int max = leaderboard.size() - 1;
        int mid = (min + max) / 2;
        boolean found = false;
        while (!found && min <= max) {
            mid = (min + max) / 2;
            ProfessionalPlayer otherPlayer = leaderboard.get(mid);
            if (otherPlayer.equals(player)) {
                found = true;
            } else if (player.compareTo(otherPlayer) >= 0) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        if (found) {
            return mid;
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