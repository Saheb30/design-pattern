package observer.cricket;

public class CurrentScoreDisplay implements Observer {
	private int runs, wickets;
	private float overs;
	private Subject subject;
	public CurrentScoreDisplay(Subject subject) {
		super();
		this.subject = subject;
		subject.registerObserver(this);
	}
	@Override
	public void update(int runs, int wickets, float overs) {
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
		display();
	}

	public void display() {
		System.out.println("\nCurrent Score Display:\n\t" + "Overs: " + overs + "\n\tRuns:" + runs + "\n\tWickets: " + wickets);
	}
}
