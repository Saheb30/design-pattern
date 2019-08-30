package decorator;

public class Client {

	public static void main(String[] args) {
		Car car = new BasicCar();
		Car sportsCar = new SportsCar(car);
		sportsCar.assemble();
		
		Car luxuryCar = new LuxuryCar(car);
		luxuryCar.assemble();
	}

}
