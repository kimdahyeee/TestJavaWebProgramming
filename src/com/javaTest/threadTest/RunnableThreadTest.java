package threadTest;

public class RunnableThreadTest implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()); //������ �̸����ϱ�
		System.out.println("RunnableThreadTest");
		
		for(int i=0; i<10; i++){
			System.out.println("i = "+ i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}

}
