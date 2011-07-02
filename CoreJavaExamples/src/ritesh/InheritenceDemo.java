package ritesh;

class Vehicle { public int speed() {return 0;} }
class Car extends Vehicle { public int speed() { return 60; } }
class RaceCar extends Car { public int speed() { return 150; }}

public class InheritenceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		Car car = new RaceCar();
		RaceCar racer = new RaceCar();
		System.out.println(racer.speed() + ", " + car.speed()+ ", "+ vehicle.speed());
	}

}
