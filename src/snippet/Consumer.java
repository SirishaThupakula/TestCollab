package snippet;

import java.util.Arrays;
import java.util.List;





/*class ConsumerImpl implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(""+t);
		
	}

}*/

public class Consumer{
	
	
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4,5,3,4);
		java.util.function.Consumer<Integer> consumerImpl = i->System.out.println(i);
		values.forEach(consumerImpl);
	}
}
