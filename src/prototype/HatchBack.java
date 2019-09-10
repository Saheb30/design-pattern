package prototype;

public class HatchBack extends Car {
	public HatchBack() {
		carType = CarType.HATCH_BACK;
	}

	@Override
	public void assemble() {
		System.out.println("Assembling HatchBack");
	}

	@Override
	public HatchBack clone() throws CloneNotSupportedException {
		return (HatchBack) super.clone();
	}
}
