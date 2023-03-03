package threads;

public class ThreadsDemo {
	public static void main(String[] args) {
		Thread t=new Thread();
		MultiThread mt= new MultiThread();
		mt.start();
		SingleThread st=new SingleThread();
		st.num();
	}

class SingleThread{
	void num() {
		for(int i=1;i<=200;i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}}
class MultiThread extends Thread{
	MultiThread(){
		
	}
		public void run() {
			for(int i=1;i<=200;i++) {
				System.out.println(Thread.currentThread().getName()+"-"+i);
				try {
					Thread.sleep(100);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
}}}
}