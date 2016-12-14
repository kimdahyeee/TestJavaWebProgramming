package synchronizedTest;

public class MainClass {

	public static void main(String[] args) {
		SyncTest st = new SyncTest();
		
		Thread thread0 = new Thread(st, "A");
		Thread thread1 = new Thread(st, "B");
		
		thread0.start();
		thread1.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
	}
}
