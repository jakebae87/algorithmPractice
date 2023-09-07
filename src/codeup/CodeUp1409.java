package codeup;

import java.util.Scanner;

public class CodeUp1409 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] numbers = scan.nextLine().split(" ");
		int call = scan.nextInt();

		for (int i = 0; i < numbers.length; i++) {
			if (i == (call - 1)) {
				System.out.println(numbers[i]);
			}
		}
	}

}
