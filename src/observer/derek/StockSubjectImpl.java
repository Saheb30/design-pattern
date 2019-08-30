package observer.derek;

import java.util.ArrayList;
import java.util.List;

public class StockSubjectImpl implements Subject {
	List<Observer> observerList = new ArrayList<Observer>(5);
	double ibmPrice;
	double applPrice;
	double googPrice;
	
	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void unregisterObserver(Observer observer) {
		observerList.remove(observer);

	}

	@Override
	public void notifyObserver() {
		for (Observer observer: observerList) {
			observer.update(ibmPrice, applPrice, googPrice);
		}
		//Or
		//this.observerList.forEach(observer->observer.update(ibmPrice, applPrice, googPrice));

	}
	public double getIbmPrice() {
		return ibmPrice;
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public double getApplPrice() {
		return applPrice;
	}

	public void setApplPrice(double applPrice) {
		this.applPrice = applPrice;
		notifyObserver();
	}

	public double getGoogPrice() {
		return googPrice;
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}

}
