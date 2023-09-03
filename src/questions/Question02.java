package questions;
import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d = 0;
		int m = 0;
		int y = 0;
		
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split("\\.");
		// split("."); 이렇게 해놓고 왜 안되는지 모르고 있었다.
		// 자바에서 특수문자를 사용한 split을 사용할 때는 주의해서 사용해야 한다.콤마(,)를 사용할 때는 아래와 같이 사용하면 문자열을 구분자로 나누어 배열로 사용할 수 있다.
		// 하지만, 특수문자를 사용할 때는 아래와 같이 "\\"를 포함하여 사용해야, 구분자로 사용해서 배열로 나눌 수 있다.
		
		y = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		d = Integer.parseInt(input[2]);

		System.out.printf("%02d-%02d-%04d", d, m, y);
	}
}
