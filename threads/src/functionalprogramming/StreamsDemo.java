package functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class StreamsDemo {
	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			lst.add(i);
			}
			System.out.println(lst);
			
			List<Integer> filteredlst=lst.stream().filter(i->i%2==0).collect(Collectors.toList());
			System.out.println(filteredlst);
			
			List<Integer> multiplyby2=lst.stream().map(i->i*2).collect(Collectors.toList());
			System.out.println(multiplyby2);
			
			List<String> names=new ArrayList<>();
			names.add("akki");
			names.add("vicky");
			List<String> n=names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
			System.out.println(n);
			
			Random random=new Random();
			List<Integer> numlst=new ArrayList<Integer>();
			for(int i=1;i<=10;i++) {
				List<Integer> l=numlst.stream().map(s->s.sorted()).collect(Collectors).toList());
				System.out.printn(l);
			}
			
			
		}
	

}
