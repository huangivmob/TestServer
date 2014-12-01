package thinkinjava;

public class Car {
	private ControlUnit unit;

	public Car() {
		unit = new ControlUnit();
	}

	public static void main(String[] args) throws ClassNotFoundException {
		 Car car = new Car();
		 car.unit.left();
	}

}
