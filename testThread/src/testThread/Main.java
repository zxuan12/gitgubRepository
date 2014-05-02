package testThread;

public class Main {
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"  "+i);
			if (i==20) {
				
				OneThread one=new OneThread();
				new Thread(one,"这是线程1").start();
				new Thread(one,"这是线程2").start();
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
