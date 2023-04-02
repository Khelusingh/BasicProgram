package in.sterling.practice;

import java.util.Arrays;
import java.util.List;

public class DoubleColonOperator {

	// INSTANCE METHOD CALLING USING DOUBLECOLON OPERATOR
	public void even(String even) {
		System.out.print(even + "\t");
	}

	public static void main(String[] args) {
		List<String> string = Arrays.asList("ab", "cd", "ef", "gh", "ij", "kl", "mn", "op");
		// Instance method calling
		string.forEach(new DoubleColonOperator()::even);
	}
}
