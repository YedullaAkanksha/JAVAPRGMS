package collectiondemo;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
//import java.util.Treeset;
public class Treeset{
	public static void main(String[] args) {
		Set<Integer> intset=new TreeSet<Integer>();
		intset.add(10);
		intset.add(1);
		intset.add(18);
		System.out.println(intset);
		Set<String> strset=new TreeSet<String>();
		strset.add("hi");
		strset.add("gh");
		strset.add("ui");
		System.out.println(strset);
		Set<String> strset1=new TreeSet<String>( Stringcomparator());
		strset1.add("hi");
		strset1.add("gh");
		strset1.add("ui");
		System.out.println(strset1);
		Set<emp> e=new TreeSet<emp>();
		e.add(new emp(1,"akki",15000,"A23"));
		e.add(new emp(2,"a",1500,"A123"));
		System.out.println(e);
					}
	private static Comparator<? super String> Stringcomparator() {
		// TODO Auto-generated method stub
		return null;
	}
	class Stringcomparator implements Comparable<String>{
	


	public int compareTo(String str,String str1) {
		int l1=str.length();
		int l2=str.length();
		if(l1<l2) {
			return -1;
		}else if(l1>l2) {
			return 1;
		}else {
			return str.compareTo(str1);
		}
		
		
	}

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}}
	class emp implements Comparable{
		int id;
		String name;
		double salary;
		String aadhar;
		emp(int id,String name,double salary,String aadhar){
			this.id=id;
			this.name=name;
			this.salary=salary;
			this.aadhar=aadhar;
		}
		@Override
		public String toString() {
			return this.id + "|" + this.name + "|" + this.aadhar.charAt(id);
		}
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
}
