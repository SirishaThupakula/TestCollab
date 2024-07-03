package snippet;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BooksService {

  public void sortedBooks(){
		List<Books> booksList = new BooksSource().getAllBooks();
		List<Books> booksList1 = new BooksSource().getAllBooks();
		Collections.sort(booksList,new MyBookCompartor());
		Collections.sort(booksList1,(x1,x2)->x2.getStories()-x1.getStories());
		System.out.println(booksList);
		System.out.println(booksList1);
		new BooksSource().getAllBooks().stream().sorted((x1,x2)->x2.getId()-x1.getId()).forEach(System.out::println);
		
		new BooksSource().getAllBooks().stream().sorted((x1,x2)->x1.getName().compareTo(x2.getName())).forEach(System.out::println);
		System.out.println("comparator.comparing");
		new BooksSource().getAllBooks().stream().sorted(Comparator.comparing(Books::getName)).forEach(System.out::print);
  }
  
  public static void main(String[] args) {
	  new BooksService().sortedBooks();
  }
	
	
}
 

class MyBookCompartor implements Comparator<Books>{

	@Override
	public int compare(Books o1, Books o2) {
		return o1.getName().compareTo(o2.getName());
	
	}
	
	
	 
 }