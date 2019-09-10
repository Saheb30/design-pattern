package prototype;

public abstract class Car implements PrototypeCapable {
	protected CarType carType;
	private long id;

	abstract public void assemble();

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public Car clone() throws CloneNotSupportedException {
		return (Car) super.clone();
	}
}
