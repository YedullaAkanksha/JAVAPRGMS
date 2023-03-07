package functionalprogramming;

public class FuncPrgmDemo {
	public static void main(String[] args) {
		//traditional
		calculate c=new calculate();
		c.calculator(4,5);
		//anon
		Cal mul=new Cal() {
		public int calculator(int a, int b) {
			// TODO Auto-generated method stub
			int r=a*b;
			System.out.println("r is"+r);
			return r;
		}
		};
		//lamda
		int x=2;
		int y=8;
		Cal div=(a,b) ->{return a/b;};
		System.out.println("res is"+div.calculator(x,y));
	
		Sum s=(a,b) ->{return a+b;};
		System.out.println("res is"+sum.add(2,4));
		
	

}
interface Cal{
	int calculator(int a,int b) {
		
	}
class calculate implements Cal{

	@Override
	public int calculator(int a, int b) {
		// TODO Auto-generated method stub
		int r=a+b;
		System.out.println("r is"+r);
		return r;
	}
	
}
interface Sum{
	void add(int a,int b) {
		
	}
}
}}
