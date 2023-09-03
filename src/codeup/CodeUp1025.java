package codeup;
import java.util.Scanner;

public class CodeUp1025 {

	public static void main(String[] args) {
		// https://www.codeup.kr/problem.php?id=1025
		// 정수 1개 입력받아 나누어 출력하기(설명)

		Scanner scan = new Scanner(System.in);

		String[] numbers = scan.nextLine().split("");
		// 입력받은 값을 String으로 받기 위해 nextLine() 함수를 활용했다.
		// split() 함수로 return된 값을 numbers 배열에 저장한다.

		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("[%d]\n", Integer.parseInt(numbers[i]) * (int) Math.pow(10, (numbers.length - 1 - i)));

		}

	}
}
