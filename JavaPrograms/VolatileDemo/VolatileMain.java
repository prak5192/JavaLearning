package wikihow.VolatileDemo;

public class VolatileMain {
	// When a variable is declared as static,
	// then a single copy of variable is created and shared among all objects at
	// class level.
	// Static variables are, essentially, global variables. All instances of the
	// class share the same static variable.
	private final static int TOTAL_THREADS = 2;

	public static void main(String[] args) throws InterruptedException {
		VolatileData volatileData = new VolatileData();

		Thread[] threads = new Thread[TOTAL_THREADS];
		for (int i = 0; i < TOTAL_THREADS; i++)
			threads[i] = new VolatileThread(volatileData);
		// Start all reader threads.

		for (int i = 0; i < TOTAL_THREADS; i++)
			threads[i].start();
		// Wait for all threads to terminate.
		for (int i = 0; i < TOTAL_THREADS; i++)
			threads[i].join();
	}

}
