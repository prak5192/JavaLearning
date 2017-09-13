package wikihow.VolatileDemo;

//we declare a new class, called VolatileThread, which receives an instance of the VolatileClass in its constructor
public class VolatileThread extends Thread {

	private final VolatileData data;

	public VolatileThread(VolatileData data) {
		this.data = data;
	}

	@Override
	public void run() {

		int oldValue = data.getCounter();
		System.out.println("[Thread" + Thread.currentThread().getId()
				+ "] :  Old value = " + oldValue);
		data.increaseCounter();
		int newValue = data.getCounter();
		System.out.println("[Thead" + Thread.currentThread().getId()
				+ "] : New Value = " + newValue);
	}

}
