package threads;

public class ThreadsDemo  extends Thread{
		ThreadsDemo(){
			
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
				}			}}

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
	}
				
				public static void main(String[] args) {
					Thread t=new Thread();
					ThreadsDemo mt= new ThreadsDemo();
					mt.start();
					SingleThread st=new SingleThread();
					st.num();
				}}
