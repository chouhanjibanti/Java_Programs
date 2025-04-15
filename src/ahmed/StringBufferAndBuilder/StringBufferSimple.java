// StringBuffer is  a ThreadSafe.
package ahmed.StringBufferAndBuilder;

public class StringBufferSimple {

	public static void main(String[] args) {

		// create ref var of the StringBuffer
		StringBuffer buffer = new StringBuffer();
//		StringBuilder builder = new StringBuilder();

		// we will create two threads
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				buffer.append("A");
//	    		builder.append("A");

			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				buffer.append("B");
//	    		builder.append("B");
			}
		});

		// we will execute both the thread at a time
		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("StringBuffer ThreadSafe : " + buffer.toString().length());
//	       System.out.println("StringBuilder ThreadSafe : "+builder.toString().length());

	}

}
