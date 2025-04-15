package StreamApi;

public class WithoutMainMethod {
    static {
        System.out.println("Hello from static block!");
        System.exit(0); // Stops JVM so it won’t look for main()
    }
    
    public static void main(String[] args) {
		
	}
}
