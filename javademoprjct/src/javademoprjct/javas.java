package javademoprjct;

public class javas {
	private javas() {}
	static {
		System.out.println("from static");
	
	}
	{
		System.out.println("from nonstatic");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		javas j1=new javas();
		javas j2=new javas();
		jvp j=new jvp();
		System.out.println(jvp.manu);

}
}
