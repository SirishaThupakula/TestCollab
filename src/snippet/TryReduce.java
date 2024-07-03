package snippet;

import java.util.Arrays;
import java.util.List;

public class TryReduce {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,8,7,9);
		List<String> values = Arrays.asList("quack","moo","meow","oink");
		System.out.println(nums.stream().mapToInt(Integer::intValue).sum());
		System.out.println(nums.stream().reduce(0,(a,b)->a+b));
		System.out.println(nums.stream().reduce(Integer::sum));
		System.out.println(nums.stream().reduce(Integer::sum).get());
		System.out.println(nums.stream().reduce(Integer::max).get());
		System.out.println(nums.stream().reduce(1,(a,b)->a*b));
		System.out.println(values.stream().reduce(values.get(0),(v1,v2)->v1.length()>v2.length()?v1:v2));
		System.out.println(nums.stream().mapToInt(Integer::intValue).average().getAsDouble());
	}

}
