package football;

public class FootballPlayer extends Person {
	private Integer goals;	

	public FootballPlayer(String name) {
		super(name); // Costruttore della classe padre
		this.goals = 0;
	}

	public Integer getGoals() { return goals; }
	
	public void addGoals(Integer goals) { this.goals += goals; }
	
	@Override
  public String getInfo() {
		return super.getInfo() + " Ho segnato " + this.goals + " goal in carriera.";
	}
}
