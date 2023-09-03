package codeup;
import java.util.Scanner;

public class CodeUp1082 {

	public static void main(String[] args) {
//		https://www.codeup.kr/problem.php?id=1082	16진수 구구단?
//		풀이중

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt(16);

		for (int i = 1; i <= 16; i++) {
			System.out.printf("%x", i * input);
		}

	}

}
