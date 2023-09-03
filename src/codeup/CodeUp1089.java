package codeup;
import java.util.Scanner;

public class CodeUp1089 {

	public static void main(String[] args) {
		// https://www.codeup.kr/problem.php?id=1089	수 나열하기1
		// 2023-08-31

		Scanner scan = new Scanner(System.in);

		String[] numbers = scan.nextLine().split(" ");
		
		int startNumber = Integer.parseInt(numbers[0]);	// 시작값
		int gapNumber = Integer.parseInt(numbers[1]);	// 등차
		int count = Integer.parseInt(numbers[2]);		// 몇번째 수
		
		int result = 0;
		
		for(int i = 0; i < count-1; i++) {
			startNumber += gapNumber;
		}
		System.out.println(startNumber);
	}
}
