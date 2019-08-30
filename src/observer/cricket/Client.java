package observer.cricket;

public class Client {
	public static void main(String args[]) {
		CricketData data = new CricketData();
		CurrentScoreDisplay current = new CurrentScoreDisplay(data);
		AverageScoreDisplay average = new AverageScoreDisplay(data);
		data.setOvers(50);
		data.setRuns(280);
		data.setWickets(6);
	}
}
