package polymorphismExample;

public class B extends A {

	static int i = 30;
	int j = 40;

	public static void staticMethod() {
		System.out.println("static method from subclass");
	}

	public void nonStaticMethod() {
		System.out.println("non static method from subclass");
	}
}
