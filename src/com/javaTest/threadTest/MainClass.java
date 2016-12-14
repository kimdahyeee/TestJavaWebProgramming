package threadTest;

public class MainClass {

	public static void main(String[] args) {

		RunnableThreadTest rtt = new RunnableThreadTest();
		
		Thread thread = new Thread(rtt, "A");
		thread.start(); //rtt�� run�޼ҵ� ����.
		
		System.out.println(Thread.currentThread().getName()); //main��� -> thread.start���� main������ ����ȴ�.
		
		//extends Thread�� ���
		ThreadTest tt = new ThreadTest(); //thread �����߱� ������ ���� ������ �������� �ʾƵ��ȴ�.
		tt.setName("B");
		tt.start();
		
	}

}
