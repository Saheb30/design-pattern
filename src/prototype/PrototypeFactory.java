package prototype;

import java.util.EnumMap;
import java.util.Map;

public class PrototypeFactory {
	private static Map<CarType, Car> prototypes = new EnumMap<CarType, Car>(CarType.class);

	static {
		prototypes.put(CarType.HATCH_BACK, new HatchBack());
		prototypes.put(CarType.SEDAN, new Sedan());
		prototypes.put(CarType.SUV, new Suv());
	}

	public static Car getInstance(final CarType carType) throws CloneNotSupportedException {
		return prototypes.get(carType).clone();
	}
}
