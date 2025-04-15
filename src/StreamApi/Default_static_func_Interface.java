package StreamApi;

public class Default_static_func_Interface {

	
	@FunctionalInterface
	interface MyFunction {

	    // Abstract method (required for functional interface)
	    void sayHello(String name);

	    // Default method
	    default void greet() {
	        System.out.println("Hello from default method!");
	    }

	    // Static method
	    static void staticGreet() {
	        System.out.println("Hello from static method!");
	    }
	}
	
	
	 public static void main(String[] args) {

	        // Using lambda expression to implement the abstract method
	        MyFunction func = (name) -> System.out.println("Hello, " + name);
	        func.sayHello("John"); // Output: Hello, John

	        // Calling default method using object
	        func.greet(); // Output: Hello from default method!

	        // Calling static method using interface name
	        MyFunction.staticGreet(); // Output: Hello from static method!
	    }
	

}
