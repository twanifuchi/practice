package strings;

import java.util.function.IntBinaryOperator;

public class Main {

//	public static int sub(int a, int b) {
//		return a - b;
//	}

	public static void main(String[] args){
		IntBinaryOperator func = (int a, int b) -> {return a-b ;};
		int a = func.applyAsInt(5, 3);
		System.out.println("5-3は" + a);
	}

}