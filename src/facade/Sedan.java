package facade;

public class Sedan extends Car {
	public Sedan() {
		carType = CarType.SEDAN;
	}

	@Override
	public void assemble() {
		System.out.println("Assembling Sedan");
	}
}
