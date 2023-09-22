package codeup;

import java.util.Scanner;

public class CodeUp1371 {
	// https://www.codeup.kr/problem.php?id=1371
	// 9월19일

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int line = scan.nextInt();

		// 빈칸4 *빈칸0*
		// 빈칸3 *빈칸2*
		// 빈칸2 *빈칸4*
		// 빈칸1 *빈칸6*
		// 빈칸0 *빈칸8*
		// 빈칸은 행값에 반비례, 처음 * 출력 후 2*행값 만큼 빈칸 출력하고 * 출력

		// 빈칸0 *빈칸8*
		// 빈칸1 *빈칸6*
		// 빈칸2 *빈칸4*
		// 빈칸3 *빈칸2*
		// 빈칸4 *빈칸0*
		// 빈칸은 행값에 비례

		for (int i = 0; i < line; i++) {
			// 위
			for (int j = line - i; j - 1 > 0; j--) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int y = 0; y < (2 * i); y++) {
				System.out.print(" ");
			}

			System.out.print("*");

			System.out.println();
		}

		// 아래

		for (int i = 0; i < line; i++) {

			for (int j = line - i; j < line; j++) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int y = 0; y < (line * 2) - (2 * (i + 1)); y++) {
				System.out.print(" ");
			}

			System.out.print("*");

			System.out.println();
		}

	}

}
