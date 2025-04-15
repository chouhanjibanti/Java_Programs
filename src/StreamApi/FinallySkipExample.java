package StreamApi;

// using the system.exit(0);
public class FinallySkipExample {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try");
            System.exit(0); // forcefully terminates JVM
        } finally {
            System.out.println("Inside finally"); // ❌ will NOT execute
        }
    }
}



// crash
//public class FinallySkipExample {
//    public static void crash() {
//        crash(); // recursive call
//    }
//
//    public static void main(String[] args) {
//        try {
//        	System.out.println("h");
//            crash(); // this causes JVM crash
//        } finally {
//            System.out.println("Inside finally"); // ❌ might not run
//        }
//    }
//}
