package collectiondemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class map {
	public static void main(String[] args) {
		Map<String, Integer> marks=new HashMap<>();
		marks.put("akki", 96);
		marks.put("Akhil", 99);
		marks.put("rahul", 91);
		marks.put("akki", 92);
		System.out.println(marks);
		System.out.print(marks.keySet());
		System.out.println(marks.values());
		for(String Key: marks.keySet()) {
			System.out.println(marks.get(Key));
		}
		Map<String, Integer> marks1=new LinkedHashMap<>();
		marks1.put("akki", 96);
		marks1.put("Akhil", 99);
		marks1.put("rahul", 91);
		marks1.put("akki", 92);
		System.out.println(marks1);
		System.out.print(marks1.keySet());
		System.out.println(marks1.values());
		
	}

}
