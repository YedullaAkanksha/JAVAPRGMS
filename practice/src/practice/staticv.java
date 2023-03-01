package practice;

public class staticv {
	int temp;static int max=0;
	public void max(int i) {
		temp=i;
		if(temp>max) {
			max=i;
		}
	}
	public static void main(String[] args) {
		staticv s=new staticv();
		s.max(100);s.max(10);
		System.out.println("max is:"+ max);
	}
	

}
