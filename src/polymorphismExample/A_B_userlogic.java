package polymorphismExample;

public class A_B_userlogic {

	public static void main(String[] args) {

		B obj = new B();
		obj.staticMethod();
		obj.nonStaticMethod();
		System.out.println(obj.i);
		System.out.println(obj.j);

		A obj1 = new B();
		obj1.staticMethod();
		obj1.nonStaticMethod();
		System.out.println(obj1.i);
		System.out.println(obj1.j);

		A obj2 = new A();
		obj2.staticMethod();
		obj2.nonStaticMethod();
		System.out.println(obj2.i);
		System.out.println(obj2.j);

//		B obj = new B(); // you and papa
//		
//		
//		A obj2 = new A(); // papa
//		
//		
//		
//		A obj1= new B(); //  you and papa

//		B obj3 = new A();

	}

}
