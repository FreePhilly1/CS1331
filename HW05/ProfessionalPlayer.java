/**
 * Create ProfessionalPlayer subclass.
 * @author Phillip Kim
 * @version 1.0
 */
public class ProfessionalPlayer extends Player {
    private boolean isSeeded;

    /**
     * Constructor that takes in name, points, trophies, and isSeeded.
     * @param name The name of the player.
     * @param points The amount of points of the player.
     * @param trophies The amount of trophies of the player.
     * @param isSeeded Whether the player is ranked top 10.
     */
    public ProfessionalPlayer(String name, double points, int trophies, boolean isSeeded) {
        super(name, points, trophies);
        this.isSeeded = isSeeded;
    }

    @Override
    public double calculateSkillLevel() {
        double skill = this.getPoints() + 1.5 * this.getTrophies();
        if (isSeeded) {
            skill = skill * 2;
        }
        return skill;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        } else {
            ProfessionalPlayer anotherPlayer = (ProfessionalPlayer) obj;
            boolean cond1 = super.equals(anotherPlayer);
            boolean cond2 = this.isSeeded == anotherPlayer.isSeeded;
            return cond1 && cond2;
        }
    }
}