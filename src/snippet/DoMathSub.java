package snippet;

interface Calculator{
	int subtract(int i1,int i2);
}

public class DoMathSub {

	public static void main(String[] args) {
		
		
		Calculator cal = (x1,x2)->{
			if(x1>x2)
				throw new IllegalArgumentException("provide correct value");
			else
				return x2-x1;
		};
		System.out.println(cal.subtract(3,12));
		System.out.println(cal.subtract(12,4));
	}
}
