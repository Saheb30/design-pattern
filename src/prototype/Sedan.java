package prototype;

public class Sedan extends Car {
	public Sedan() {
		carType = CarType.SEDAN;
	}

	@Override
	public void assemble() {
		System.out.println("Assembling Sedan");
	}

	@Override
	public Sedan clone() throws CloneNotSupportedException {
		return (Sedan) super.clone();
	}

}
