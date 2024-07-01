package snippet;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> entireList = Arrays.asList("Ami","Ashi","Latha");
		String name = "Ashi";
		Integer intOptional = null;
		Optional<?> optionalObj = Optional.empty();
		System.out.println(optionalObj);
		
		Optional<String> nameOpt = Optional.of(name);
		System.out.println(nameOpt);
		
		System.out.println(Optional.ofNullable(intOptional)); 
		
		
		System.out.println(Optional.ofNullable(intOptional).orElse(100)); 
		System.out.println(nameOpt.map(String::toUpperCase).orElseGet(()->"Ami"));
		System.out.println(entireList.stream().filter(nam->nam.equals("Ash")).findAny().orElse("Ami"));
		System.out.println(Optional.ofNullable(intOptional).orElseThrow(()->new IllegalArgumentException("provide value"))); 
		
		
		System.out.println(Optional.of(intOptional)); 
		
		
		
	}

}
