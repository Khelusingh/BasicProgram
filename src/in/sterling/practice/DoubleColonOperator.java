package in.sterling.practice;

import java.util.Arrays;
import java.util.List;

public class DoubleColonOperator {
	
	
	//STATIC METHOD CALLING USING DOUBLECOLON OPERATOR
	public static void even(String even) {
		System.out.print(even + "\t");
	}

	public static void main(String[] args) {
		// static method
		List<String> string = Arrays.asList("ab", "cd", "ef", "gh", "ij", "kl", "mn", "op");

		string.forEach(DoubleColonOperator::even);
	}
}
