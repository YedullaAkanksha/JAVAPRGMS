package threads;

public class Interruptdemo {
	public static void main(String[] args) {
		Utils.printmessage("start");
		Thread t=new Thread(new Worker());
		t.start();
		try {
			Thread.sleep(3000);
			t.interrupt();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		Utils.printmessage("end");
	}
}
class Worker implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Utils.printmessage("Start");
		for(int i=1;i<=10;i++) {
			Utils.printmessage(""+i);
			try {
			Thread.sleep(1000);
			}
			catch (Exception e) {
				//e.printStackTrace();
				Utils.printmessage("interrupted");
			}
			
		}
		Utils.printmessage("end");
	}
	
	
}
