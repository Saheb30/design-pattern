package observer.derek;

public interface Subject {
	public void registerObserver(Observer observer);
	public void unregisterObserver(Observer observer);
	public void notifyObserver();
}
