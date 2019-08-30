package observer.cricket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CricketData implements Subject {
	
	int runs;
	int wickets;
	float overs;
	List<Observer> observerList = new ArrayList<>();

	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void unregisterObserver(Observer observer) {
		observerList.remove(observer);		
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> it = observerList.iterator();
		while(it.hasNext()) {
			Observer observer = it.next();
			observer.update(runs,wickets,overs); 
		}
		
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
		notifyObservers();
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
		notifyObservers();
	}

	public float getOvers() {
		return overs;
	}

	public void setOvers(float overs) {
		this.overs = overs;
		notifyObservers();
	}
	
}
