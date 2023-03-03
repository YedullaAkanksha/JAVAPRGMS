package threads;

public class ThreadCommunication {
	public static void main(String[] args) throws InterruptedException {
		MyThread mythread=new MyThread();
		Thread t=new Thread(mythread);
		t.setName("T1");
		t.start();
		synchronized(t) {
			Utils.printmessage("wait");
			Utils.printmessage("Total" +mythread.total);
		}}
	

class MyThread implements Runnable{
	int total;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Utils.printmessage("calculating");
		for(int i=0;i<=100;i++) {
			total+=i;
		}
		Utils.printmessage("calculation compltd");
		this.notify();
				
		}
	
public int getTotal() {
	return total;
	
}}}
