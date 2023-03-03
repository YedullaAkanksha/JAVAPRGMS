package threads;

import java.util.Scanner;

public class JoinDemo {
	public static void main(String[] args) {
		long starttime=System.currentTimeMillis();
		System.out.println("sum of frst n nums");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		cal c=new cal(n);
		c.start();
		try {
			c.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		printmessage("sum of frst" + n + "nums=" +c.getSum());
		long endtime=System.currentTimeMillis();
		System.out.println(endtime-starttime);
	}
	private static void printmessage(String message) {
		System.out.println(Thread.currentThread().getName()+ "-" +message);
	}
}
class cal extends Thread{
	int n;
	int sum;
	cal(int n){
		this.n=n;
		
	}
	public void run() {
		for (int i=1;i<n;i++) {
			this.sum+=i;
		}
	}
	public int getSum() {
		return sum;
	}
}