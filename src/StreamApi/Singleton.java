package StreamApi;

public class Singleton {
    
    // Step 1: Create a private static object of the same class
    private static Singleton singleInstance = null;

    // Step 2: Private constructor
    private Singleton() {
        System.out.println("Singleton object created");
    }

    // Step 3: Public static method to get the object
    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }



    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2); // true → both are same object
    }
}


