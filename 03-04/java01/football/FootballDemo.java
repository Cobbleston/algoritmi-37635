package football;

public class FootballDemo {
	public static void main(String[] args) {
		Person p1 = new Person("Mario Rossi");
		
		FootballPlayer p2 = new FootballPlayer("Giuseppe Verdi");
		p2.addGoals(30);
	
		GoalKeeper p3 = new GoalKeeper("Luigi Bianchi");
		p3.addGoals(2);
		p3.addGoalsConceded(300);

		
		System.out.println(p1.getInfo());
		System.out.println(p2.getInfo());
		System.out.println(p3.getInfo());
	}
}
