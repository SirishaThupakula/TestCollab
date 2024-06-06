package snippet;


 interface Phone {
	 void call();
	 default void message()
	 {
		 System.out.println("in Java 8 i can send messages");
	 }
	 
}
 
 class classPhone implements Phone{

	@Override
	public void call() {
		System.out.println("calling everyone");
		
	}
	 
 }
public class FirstFeature {

	public static void main(String[] args) {
		Phone p = new classPhone();
		p.call();
		p.message();
		
		

	}

}
