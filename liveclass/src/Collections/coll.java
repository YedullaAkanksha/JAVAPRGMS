package Collections;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;

	public class coll {
		public static void main(String[] args) {
			List<String> lst=new ArrayList<String>();
			lst.add("hi");
			lst.add("gh");
			lst.add("ui");
			System.out.println(lst);
			Collections.sort(lst);
			System.out.println(lst);
			//Collections.sort(lst,MyComparator());
			//System.out.println(lst);
			Collections.reverse(lst);
			System.out.println(lst);
			String[] s=["hii","dfg"];
		
		class MyComparator implements Comparator<String>{
			MyComparator c=new MyComparator(); 
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
				
			}
			
		}

	}}
