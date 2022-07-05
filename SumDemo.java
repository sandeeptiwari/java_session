package LambdaExpession;

public interface SumDemo {

	//Program of Subtract of two number using Lambda Function
		
	public abstract int sub(int a, int b);
		
		public static void main(String[] args) {
			
			SumDemo sumDemo = (int a, int b)->{
				
				return a+b;
			};
			
			System.out.println(sumDemo.sub(50, 25));
		}

	}


