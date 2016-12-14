package threadTest;

public class MainClass {

	public static void main(String[] args) {

		RunnableThreadTest rtt = new RunnableThreadTest();
		
		Thread thread = new Thread(rtt, "A");
		thread.start(); //rtt의 run메소드 실행.
		
		System.out.println(Thread.currentThread().getName()); //main출력 -> thread.start이후 main나머지 실행된다.
		
		//extends Thread한 경우
		ThreadTest tt = new ThreadTest(); //thread 생성했기 때문에 따로 스레드 선언하지 않아도된다.
		tt.setName("B");
		tt.start();
		
	}

}
