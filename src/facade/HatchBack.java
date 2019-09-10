package facade;

public class HatchBack extends Car {
	public HatchBack() {
		carType = CarType.HATCH_BACK;
	}

	@Override
	public void assemble() {
		System.out.println("Assembling HatchBack");
	}
}
