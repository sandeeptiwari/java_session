package LambdaExpession;

public interface MultiDemo {

	//Program of Multiply of two number using Lambda Function

	public abstract int mul(int a, int b);
		
		public static void main(String[] args) {
			
			MultiDemo multiDemo = (int a, int b)->{
				
				return a*b;
			};
			
			System.out.println(multiDemo.mul(15,12));
		}

}
