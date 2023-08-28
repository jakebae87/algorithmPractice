import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
		
//		https://www.codeup.kr/problem.php?id=1076
//		문자 1개 입력받아 알파벳 출력하기(설명)
		
		Scanner scan = new Scanner(System.in);
		char alphabet = scan.nextLine().charAt(0);
		// char type으로 입력받은 값을 alphabet이라는 식별자로 저장한다.
		
		int number = (int)alphabet;
		// alphabet의 정수값을 number에 저장하기 위해, 형변환을 한다.
		
		for(int i = 97; i <= number; i++) {
			char result = (char)i;
			System.out.printf("%c ",result);
		}
		
	}

}
