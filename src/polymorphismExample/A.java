package polymorphismExample;

public class A {

	static int i = 10;
	int j = 20;

	public static void staticMethod() {
		System.out.println("static method of superclass");
	}

	public void nonStaticMethod() {
		System.out.println("non static method from superclass");
	}
}
