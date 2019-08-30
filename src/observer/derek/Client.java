package observer.derek;

public class Client {

	public static void main(String[] args) {
		StockSubjectImpl subject = new StockSubjectImpl();
		ObserverImpl observerImpl = new ObserverImpl(subject);
		subject.setIbmPrice(170.00);
		subject.setApplPrice(700.00);
		subject.setGoogPrice(690.00);
		
		ObserverImpl observerImpl2 = new ObserverImpl(subject);
		subject.setIbmPrice(670.00);
		subject.setApplPrice(700.00);
		subject.setGoogPrice(690.00);
	}

}
