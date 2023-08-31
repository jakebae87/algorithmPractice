import java.util.Scanner;

public class CodeUp1025 {

	public static void main(String[] args) {
		// https://www.codeup.kr/problem.php?id=1025
		// 정수 1개 입력받아 나누어 출력하기(설명)

		Scanner scan = new Scanner(System.in);

		String[] numbers = scan.nextLine().split("");

		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("[%d]\n", Integer.parseInt(numbers[i]) * (int) Math.pow(10, (numbers.length - 1 - i)));
		}

	}
}
