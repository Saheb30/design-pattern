package observer.derek;

public class ObserverImpl implements Observer {
	private double ibmPrice;
	private double applPrice;
	private double googPrice;
	Subject subject;
	public ObserverImpl(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}
	@Override
	public void update(double ibmPrice, double applPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		this.applPrice = applPrice;
		this.googPrice= googPrice;
		printPrices();
	}
	private void printPrices(){
		System.out.println("IBM::"+ibmPrice);
		System.out.println("APPL::"+applPrice);
		System.out.println("GOOG::"+googPrice);
	}

}
