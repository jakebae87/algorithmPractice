package codeup;

import java.util.Scanner;

public class CodeUp1484 {
	// https://www.codeup.kr/problem.php?id=1484
	// 9월8일

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int row = scan.nextInt();
		int column = scan.nextInt();

		int[][] array = new int[row][column];

		// 바둑판을 0으로 채운다.
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = 0;
			}
		}

		// 초기 시작 세팅
		int a = 0, b = 0, count = 2;
		array[a][b] = 1;

		while (count <= row * column) {

			// 오른쪽 방향
			while (b + 1 < column && array[a][b + 1] == 0) {
				b++;
				array[a][b] = count;
				count++;
			}

			// 아래쪽 방향
			while (a + 1 < row && array[a + 1][b] == 0) {
				a++;
				array[a][b] = count;
				count++;
			}

			// 왼쪽 방향
			while (b - 1 >= 0 && array[a][b - 1] == 0) {
				b--;
				array[a][b] = count;
				count++;
			}

			// 위쪽 방향
			while (a - 1 >= 0 && array[a - 1][b] == 0) {
				a--;
				array[a][b] = count;
				count++;
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf("%d ", array[i][j]);
			}
			System.out.printf("\n");
		}

	}

}
