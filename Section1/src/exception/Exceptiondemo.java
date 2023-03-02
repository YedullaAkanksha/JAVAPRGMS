package exception;

public class Exceptiondemo {
	public static void main(String[] args) {
		int arr[]=new int[3];
		try {
			int a=10;
			int b=a/0;
			//arr[10]=6;
		}
		catch(Exception e) {
			System.out.println("exception");
		}
		finally {
		//System.out.printf("arr length is:"+ arr.length);	
			System.out.println("change the b" );
	}
	

}}
