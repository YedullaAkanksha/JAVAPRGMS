package threads;

public class SyncDemo {
	public static void main(String[] args) {
		Monitor m=new Monitor();
		Thread t1=new Thread(new Worker1(m,"hii"));
		t1.setName("T1");
		Thread t2=new Thread(new Worker1(m,"bye"));
		t1.setName("T2");
		t1.start();
		t2.start();
	}

	class Worker1 implements Runnable{
		Monitor mon;
		String msg;
		Worker1(Monitor mon,String msg){
			this.mon=mon;
			this.msg=msg;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			mon.display(msg);
		}
		
	}
}
class Monitor{
	public synchronized void display(String msg) {
		for(int i=1;i<=10;i++)
		Utils.printmessage("hello"+ msg+ "!");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
