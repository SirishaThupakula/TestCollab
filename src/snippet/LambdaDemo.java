package snippet;

interface SomeInterface{
	void tellSomething();
}

/*
 * class SomeClass implements SomeInterface{
 * 
 * @Override public void tellSomething() {
 * System.out.println("Nope its a secret");
 * 
 * }
 * 
 * }
 */
public class LambdaDemo {

	public static void main(String[] args) {
		SomeInterface i = () ->System.out.println("Nope its a secret1 from class");
			
				  
				  
				 
		
    i.tellSomething();
	}

}
