package InheritanceExample;

public class Car {

	String color;
	double price;
	Engine e;

	public Car() {
		super();
	}

	public Car(String color, double price, Engine e) {
		super();
		this.color = color;
		this.price = price;
		this.e = e;
	}

	public void drive() {
		System.out.println("go to palasiya");
	}

	public void display1() {
		System.out.println(" color of car" + color);
		System.out.println("proce of car" + price);
		System.out.println("engine " + e);
	}

}
