package com.Assignment.LambdaF;

public class TypeInferencxeExample {

	public static void main(String[] args) {
		StringLengthLambda myLambda= (String s) -> s.length();
		System.out.println(myLambda.getLength("Hello Lambda"));
		
		
	}
interface StringLengthLambda {
	int getLength(String s);
}
}
