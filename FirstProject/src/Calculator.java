import java.util.Scanner;

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class Calculator {
	public static void main(String[] args) {
		// Scanner get the input

		System.out.println(Adder.add(1, 2));
		System.out.println(Adder.add(1, 2, 3));

	}
}
