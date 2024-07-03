package snippet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BooksSource {

	List<Books> bksource = new ArrayList<>();
			/*Arrays.asList(new Books(1,"super women",3),
			new Books(2,"Ashi women2",4),
			new Books(3,"Daddy ",5));*/
	
	public List<Books> getAllBooks(){
		bksource.add(new Books(4,"super women4",10));
		bksource.add(new Books(1,"super women",3));
		bksource.add(new Books(2,"Ashi women2",4));
		bksource.add(new Books(3,"Daddy ",5));
		return bksource;
	}
	//bksource.add(new Books(4,"super women4",10));

	
	
	
	
	
}
