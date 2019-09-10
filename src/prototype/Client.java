package prototype;

public class Client {
	public static void main(String[] args) {
		try {
			Car hatchback = PrototypeFactory.getInstance(CarType.HATCH_BACK);
			hatchback.setId(1);
			System.out.println("Hatchback Type->"+hatchback.getCarType());
			System.out.println("Hatchback ID->"+hatchback.getId());

			Car sedan = PrototypeFactory.getInstance(CarType.SEDAN);
			System.out.println(sedan.getCarType());

			Car suv = PrototypeFactory.getInstance(CarType.SUV);
			System.out.println(suv.getCarType());

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
/**
 * If we do not want to create heavy weight instances everytime as it is costly. then, we will create their prototype instances, 
 * and everytime when we will need a new instance, will will just clone the prototype.
 */
