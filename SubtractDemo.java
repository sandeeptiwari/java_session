package LambdaExpession;

public interface SubtractDemo {

	//Program of Subtract of two number using Lambda Function
		
	public abstract int sub(int a, int b);
		
		public static void main(String[] args) {
			
			SubtractDemo subDemo = (int a, int b)->{
				
				return a-b;
			};
			
			System.out.println(subDemo.sub(500, 25));
		}

	}



