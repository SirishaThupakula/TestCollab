package snippet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StreamPractise {

	public static void main(String[] args) {
		Map<Integer,String> map= new HashMap<>();
		map.put(1,"woof woof");
		map.put(2,"meow meow");
		map.put(3,"quack quack");
		map.put(4,"baa baa");
		map.put(5,"oink oink");
		map.forEach((k,v)->System.out.println(k +"::" +v));
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		System.out.println(filterByStories(1));
		
		List<Entry<Integer,String>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries,new Comparator<Entry<Integer,String>>(){

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				
				return o2.getKey()-o1.getKey();
			}
			
		});
		System.out.println(entries);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		Map<Integer,Books> bookMap= new HashMap<>();
		bookMap.put(1,new Books(1,"quack quack",2));
		bookMap.put(2,new Books(2,"woof woof",3));
		bookMap.put(3,new Books(3,"squeak squeak",7));
		bookMap.put(4,new Books(4,"meow meow",9));
		bookMap.put(5,new Books(5,"moo moo",2));
		bookMap.put(6,new Books(6,"oink oink",8));
		System.out.println("Mapp sorting");
		bookMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Books::getName).reversed())).forEach(System.out::print);

	}
	public static List<Books> filterByStories(int storyCount){
		BooksSource bk = new BooksSource();
		return (storyCount>4)?bk.getAllBooks().stream().filter(b->b.getStories()>4).collect(Collectors.toList()):
		bk.getAllBooks().stream().filter(b->b.getStories()<4).collect(Collectors.toList());
		 
	}

}
