package snippet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class PredicateDemo implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		if(t%2==0) {
			return true;
		}
		return false;
	}
	
}

public class ConsumerPredicateSupplier {

	public static void main(String[] args) {
		Consumer<Integer> consumer = t -> System.out.print("hello ::"+t +" ");
		consumer.accept(9);
		
		Consumer<String> consumer1 = t -> System.out.println("hello ::"+t);
		
		List<String> myList = Arrays.asList("hello","moo moo","quack quack" ,"woof woof");
		myList.forEach(consumer1);
		
		PredicateDemo demo = new PredicateDemo();
		demo.test(14);
		demo.test(19);
		
		List<Integer> intList = Arrays.asList(2,4,5,7,10,6);
		intList.stream().filter(demo).forEach(consumer);
		
		Supplier<Books> supply = ()->new Books(1,"hello book supplier",3);
		List<Books> booksSupply = new ArrayList<>();
		System.out.println(booksSupply.stream().findAny().orElseGet(supply));
		System.out.println(booksSupply.stream().findAny().orElseGet(()->new Books(1,"hello java",3)));
		

	}

}
