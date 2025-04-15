package StreamApi;


//1. By Extending the Thread class
//class MyThread extends Thread {
//    public void run() {
//        System.out.println("Thread is running using Thread class");
//    }
//}
//
//public class TestThread1 {
//    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        t1.start(); // starts a new threads
//    }
//}



//2. By Implementing the Runnable Interface
//class MyRunnable implements Runnable {
//    public void run() {
//        System.out.println("Thread is running using Runnable interface");
//    }
//}
//
//public class TestThread2 {
//    public static void main(String[] args) {
//        MyRunnable r = new MyRunnable();
//        Thread t1 = new Thread(r);
//        t1.start();
//    }
//}



//3. Using Lambda Expression (Java 8+)
//public class TestThread3 {
//    public static void main(String[] args) {
//        Thread t1 = new Thread(() -> {
//            System.out.println("Thread is running using Lambda");
//        });
//        t1.start();
//    }
//}


