package main;

public class quiz8 {

	public static void main(String[] args) {
		Calc calc = new Calculator();
		System.out.println(calc.add(10, 5));
		System.out.println(calc.substract(10, 5));
		System.out.println(calc.times(10, 5));
		System.out.println(calc.divide(10, 5));

		System.out.println(calc.times(10, 0));
		System.out.println(calc.divide(10, 20));
	}

}

class Calculator implements Calc {
	int n1;
	int n2;
	String 연산자;
	
	if (연산자 == "*" && n2 == 0 || n2 == < 0) {
		return ERROR;
	} elseif (연산자 == "/" && n1 < n2 ) {
		return ERROR;
	}
	
	if (연산자 == "+") {
		return n1 + n2;
	} else if (연산자 == "-") {
		return n1 - n2;
	} else if (연산자 == "*") {
		return n1 * n2;
	} else if (연산자 == "/") {
		return n1 / n2;
	} 
	
	
}