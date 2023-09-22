package codeup;

import java.util.Scanner;

public class CodeUp1180 {
	// https://www.codeup.kr/problem.php?id=1180
	// 9월22일

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String number = scan.nextLine();
		int resultNumber = 0;
		String resultMessage;

//		입력값의 범위는 1<= number <=99

		if (number.length() == 2) {
			// 입력값 위치 바꾸기
			// 예) 15 입력되면 51
			int first = Integer.parseInt(number.substring(1, 2)); // 5
			int second = Integer.parseInt(number.substring(0, 1)); // 1
			resultNumber = (first * 20) + (second * 2);
			if (resultNumber > 100) {
				resultNumber = resultNumber % 100;
			}
		} else {
			resultNumber = Integer.parseInt(number) * 2;
		}

		System.out.println(resultNumber);
		if (resultNumber <= 50) {
			System.out.println("GOOD");
		} else {
			System.out.println("OH MY GOD");
		}

	}

}
