package football;

public class GoalKeeper extends FootballPlayer {
	private Integer gc; // Goals Conceded (Goal subiti)
	
	public GoalKeeper(String name) {
		super(name);
		this.gc = 0;
	}

	public Integer getGoalsConceded() {
		return this.gc;
	}

	public void addGoalsConceded(Integer gc) {
		this.gc += gc;
	}

	@Override
	public String getInfo() {
		return super.getInfo() + " Ho subito " + this.gc + " goal.";
	}
}
