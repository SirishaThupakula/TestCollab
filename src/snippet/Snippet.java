package snippet;

import java.util.Arrays;
import java.util.List;

public class Snippet {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4,5,3,4);
		
		for(int i =0;i<values.size();i++) {
			System.out.println(values.get(i));
			
		}
		//trying conflict
		System.out.println("hello");
		for(int i:values) {
			System.out.println(i);
		}
		System.out.println("hello1");
		
		values.forEach(i->System.out.println(i));
		System.out.println("");
		System.out.println("hello2");
		
	}
}

