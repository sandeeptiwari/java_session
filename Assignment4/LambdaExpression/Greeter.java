package com.Assignment.LambdaF;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		// HelloWorldGreeting hwg=new HelloWorldGreeting();
		// greeter.greet(hwg);

		Greeting lambdaGreeting = () -> System.out.println("Hello World");

		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("hello world");
			}

		};

		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
		// Myadd addFunction=(int a, int b)-> a+b;

	}
}
/*
 * interface MyLambda() { void foo(); } interface Myadd() { int add(int x, int
 * y); }
 */