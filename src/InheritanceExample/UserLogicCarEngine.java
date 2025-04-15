package InheritanceExample;

public class UserLogicCarEngine {

	public static void main(String[] args) {

		Car car = new Car("white", 500000, new Engine(200.0, 50000));

		car.e.display();
		car.e.combustion();
		car.display1();
		car.drive();
	}

}
