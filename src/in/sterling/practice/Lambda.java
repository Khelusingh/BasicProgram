package in.sterling.practice;

import java.util.function.Predicate;

public class Lambda {
	public static void main(String[] args) {
		Predicate<Integer> p = even -> (even % 2 == 0);
		for (int i = 0; i <= 100; i++) {

			if (p.test(i) == true) {
				System.out.print(i + "  ");
			}

		}

	}
}
