package InheritanceExample;

public class Engine {

	double hp;
	double price;

	public Engine() {
		super();
	}

	public Engine(double hp, double price) {
		super();
		this.hp = hp;
		this.price = price;
	}

	public void combustion() {
		System.out.println("dru dru .........");
	}

	public void display() {
		System.out.println("hp of engine" + hp);
		System.out.println("price of engine" + price);
	}

}
