package LambdaExpession;

public interface DivideDemo {

	//Program of Divide of two number using Lambda Function

		public abstract int div(int a, int b);
		
		public static void main(String[] args) {
			
			DivideDemo divDemo = (int a, int b)->{
				
				return a/b;
			};
			
			System.out.println(divDemo.div(200, 2));
		}
	}


