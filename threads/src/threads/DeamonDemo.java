package threads;

public class DeamonDemo {
	public static void main(String[] args) {
			Utils.printmessage(Thread.currentThread().isDaemon());
			Worker1 worker=new Worker1();
			Utils.printmessage(worker.isDaemon());
			worker.start();
			try {
			worker.join();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	class Worker1 extends Thread{
		public void run() {
			for(int i=0;i<10;i++) {
				Utils.printmessage(i);
				try {
				Thread.sleep(1000);}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
	}

}
