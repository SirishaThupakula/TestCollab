package snippet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Snippet {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4,5,3,4);
		
		for(int i =0;i<values.size();i++) {
			System.out.println(values.get(i));
			
		}
		//trying something with new branch
		
		System.out.println("hello");
		for(int i:values) {
			System.out.println(i);
		}
		System.out.println("hello1");
		
		values.forEach(i->System.out.println(i));
		System.out.println("");
		System.out.println("hello2");
		Collections.sort(values);
		System.out.println("sorted order::"+values);
		Collections.reverse(values);
		System.out.println("reverse sorted order::"+values);
		
		values.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}
}

