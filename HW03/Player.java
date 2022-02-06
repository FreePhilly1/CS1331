public abstract class Player implements Comparable<Player> {
    private String name;
    private double points;
    private int trophies;

    public Player(String name, double points, int trophies) {
        this.name = name;
        this.points = points;
        this.trophies = trophies;
    }

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

    public String getName() {
        return this.name;
    }
    public double getPoints() {
        return this.points;
    }
    public int getTrophies() {
        return this.trophies;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPoints(double points) {
        this.points = points;
    }
    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }
}