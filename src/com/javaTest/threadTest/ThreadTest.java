package threadTest;

public class ThreadTest extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());//���罺���� ���
		
		for(int i=0; i<10; i++){
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
