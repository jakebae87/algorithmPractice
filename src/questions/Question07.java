package questions;
import java.util.Arrays;
import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] numbers = scan.nextLine().split(" ");
		
		int a,b,c =0;
		a = Integer.parseInt(numbers[0]);
		b = Integer.parseInt(numbers[1]);
		c = Integer.parseInt(numbers[2]);

		int result = (a < b) ? a : b;
		result = (result < c) ? result : c;
		
		System.out.println(result);
	}
}
