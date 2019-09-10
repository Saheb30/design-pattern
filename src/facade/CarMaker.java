package facade;


public class CarMaker {
	private HatchBack hatchBack;
	private Sedan sedan;
	private Suv suv;
	public CarMaker() {
		hatchBack = new HatchBack();
		sedan = new Sedan();
		suv = new Suv();
	}
	public void assembleHatchBack() {
		hatchBack.assemble();
	}
	public void assembleSedan() {
		sedan.assemble();
	}
	public void assembleSuv() {
		suv.assemble();
	}
}
