package observer.cricket;

public class AverageScoreDisplay implements Observer {

	private float runRate;
	private int predictedScore;
	private Subject subject;
	public AverageScoreDisplay(Subject subject) {
		super();
		this.subject = subject;
		subject.registerObserver(this);
	}

	@Override
	public void update(int runs, int wickets, float overs) {
		this.runRate = (float) runs / overs;
		this.predictedScore = (int) (this.runRate * 50);
		display();
	}

	public void display() {
		System.out.println("\nAverage Score Display: \n\t" + "Run Rate: " + runRate + "\n\tPredictedScore: " + predictedScore);
	}

}
