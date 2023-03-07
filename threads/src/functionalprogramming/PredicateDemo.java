package functionalprogramming;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> gt30= (i) -> (i>30);
		System.out.println(""+gt30.test(33));
		
		Predicate<String> stringLenGreaterThan5= (s) -> (s.length()>5);
		System.out.println(""+stringLenGreaterThan5.test("Akki"));
		
		Predicate<Integer> gt10=(i) ->(i>10);
		int[] x= {10,11,12,13};
		m1(gt10,x);
		
		Predicate<Integer> gt5=(i) ->(i>5);
		Predicate<Integer> isodd=(i) ->(i%2!=0);
		m1(gt5.and(isodd),x);
		
		Predicate<Integer> even=(i) ->(i%2==0);
		int[] y= {1,2,3,4,5,6,7,8,9};
		m2(even,y);
		
	}
//		private boolean check(int a) {
//			return a>30;
//		}
	static void m1(Predicate<Integer> p,int[] x) {
		for(int i:x) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}
	static void m2(Predicate<Integer> p,int[] y) {
		for(int i:y) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}
	
}
