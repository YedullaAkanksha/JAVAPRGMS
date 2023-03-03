package threads;

public class Runnabledemo {
	public static void main(String[] args) {
		Utils.printmessage("Begin Main");
		ImageProcess ip=new ImageProcess();
		Thread t=new Thread(ip);
		t.start();
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Utils.printmessage("do wrk");
			}
			
		});
		t1.start();
		Utils.printmessage("end main");
	}
	
	}
class ImageProcess implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Utils.printmessage("process image");
	}
	
}
