package typecasting;
public class implicitexplicit {

		public static void main(String[] args) {
			
			//implicit conversion
			System.out.println("Implicit Type Casting");
			char a='f';
			System.out.println("Value of a: "+a);
			
			int b=a;
			System.out.println("Value of b: "+b);
			
			float c=a;
			System.out.println("Value of c: "+c);
			
			long d=a;
			System.out.println("Value of d: "+d);
			
			double e=a;
			System.out.println("Value of e: "+e);
			
					
			System.out.println("\n");
			
			System.out.println("Explicit Type Casting");
			//explicit conversion
			
			int i=88;
			char j=(char)i;
			System.out.println("Value of i: "+i);
			System.out.println("Value of j: "+j);
			
		}
	}


}
