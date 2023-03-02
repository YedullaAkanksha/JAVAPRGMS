package string;

public class StringDemo {
	public static void main(String[] args) {
		String s1="Akki";
		String s2="akanksha";
		System.out.println(s1+s2);
		System.out.println(s2.replace("n","e"));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));
		
		
	StringBuffer str=new StringBuffer("Akanksha");
	str.append("Akki");
	str.delete(1,3);
	str.replace(1, 4, "add");
	System.out.println(str)	;
	
	StringBuilder sb=new StringBuilder("hello");
	sb.insert(2,"y");
	System.out.println(sb);
	}

	
}
