package wikihow.VolatileDemo;

public class VolatileData {

	private volatile int counter = 0;

	// return the current value
	public int getCounter() {
		return counter;

	}

	// increase the current value by one, respectively.
	public void increaseCounter() {
		++counter;
	}

}
