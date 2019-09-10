package prototype;

public class Suv extends Car {
	Suv(){
		carType = CarType.SUV;
	}
	@Override
	public void assemble() {
		System.out.println("Assembling Sedan");
	}
	@Override
	public Suv clone() throws CloneNotSupportedException {
		return (Suv) super.clone();
	}

}
