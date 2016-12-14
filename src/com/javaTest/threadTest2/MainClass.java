package threadTest2;

public class MainClass {

	public static void main(String[] args) {
		
		RunnableTest2 rt2 = new RunnableTest2();
		RunnableTest2 rt3 = new RunnableTest2();
		
		Thread thread0 = new Thread(rt2, "A");
		Thread thread1 = new Thread(rt3, "B");
		
		thread0.start();
		thread1.start();
		
		System.out.println(Thread.currentThread().getName());
	}
}
