package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkDemo {
	public static void main(String[] args) throws Exception {
		Videoprocessor[] vd= {
				new Videoprocessor("bank"),
				new Videoprocessor("schl"),
				new Videoprocessor("conference")};
			ExecutorService newFixedThreadpool=Executors.newFixedThreadPool(5);	
			for(Videoprocessor vptask:vd) {
				newFixedThreadpool.submit(vptask);
			}
			newFixedThreadpool.shutdown();
	}}

class Videoprocessor implements Runnable{
	String sourceName;
	public Videoprocessor(String source) {
		this.sourceName=source;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Utils.printmessage("processing" +sourceName + "strtd");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		Utils.printmessage("processing"+"ended");
	}
}