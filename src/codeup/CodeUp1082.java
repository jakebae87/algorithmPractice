package codeup;

import java.util.Scanner;

public class CodeUp1082 {

	public static void main(String[] args) {
//		https://www.codeup.kr/problem.php?id=1082	16진수 구구단?
//		2023-09-04

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		int hexa = Integer.valueOf(input, 16);

		String number, result;

		for (int i = 1; i < 16; i++) {
			number = Integer.toHexString(i).toUpperCase();
			result = Integer.toHexString(i * hexa).toUpperCase();
			System.out.println(input + "*" + Integer.toHexString(i).toUpperCase() + "=" + result);
		}

	}

}
