package Aa2;

public class CarsMain {
	public static void main(String[] args) {
		Car[] cars = {new Audi(), new Mercedes(), new BMW(), new Volvo()};
		for(Car car : cars)
		{
			System.out.println(car.name);
			car.drive();
			car.refuel();
			car.parked();
			System.out.println();
		}
	}
}
