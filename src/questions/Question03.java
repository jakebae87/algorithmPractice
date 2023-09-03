package questions;
import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		final int number = scan.nextInt();
		int result = 0;
		
		for(int i = 1; ; i++) {
			if(result >= number) {
				System.out.print(i-1);
				break;
			}else {
				result += i;
			}
		}
	}
}
