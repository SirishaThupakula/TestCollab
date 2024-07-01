package snippet;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4,5,3,4);
		values.forEach(System.out::println);
		List<String> names = Arrays.asList("nav","Ash","Ami");
		names.stream().map(String::toUpperCase).forEach(System.out::println);
		
		List<Integer> mapValues = Arrays.asList(4,5,3,11,2,8,6,3,4);
		mapValues.parallelStream().map(i->i*2).filter(i->i%4>1).forEach(System.out::println);
	}
}
