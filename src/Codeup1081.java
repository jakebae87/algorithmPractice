import java.util.Scanner;

public class CodeUp1081 {

	public static void main(String[] args) {
//		https://www.codeup.kr/problem.php?id=1081
		
		Scanner scan = new Scanner(System.in);
		String[] numbers = scan.nextLine().split(" ");
		
		int firstNumber = Integer.parseInt(numbers[0]);
		int secondNumber = Integer.parseInt(numbers[1]);
		
		for(int i = 0; i < firstNumber; i++) {
			for(int j = 0; j < secondNumber; j++) {
				System.out.printf("%d %d\n", i+1,j+1);
			}
		}
	}

}
