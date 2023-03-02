package accessspecifier;

public class AccessSpecifier {
	 public AccessSpecifier(int i,int j) {
		int r=i+j;
		System.out.println(r);
		
	}
	private void mul(double d,double e,double f) {
		double s=d*e*f;
		System.out.println("mul is"+ s);
	}
	public static void main(String[] args) {
		AccessSpecifier A=new AccessSpecifier(2,9);
		//AccessSpecifier(2, 9);
		A.mul(2.3,5.6, 9.0);
	}
}

