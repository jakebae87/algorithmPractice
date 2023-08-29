import java.util.Scanner;

public class Codeup1024 {

	public static void main(String[] args) {
//		https://www.codeup.kr/problem.php?id=1024
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		for(int i = 0; i < input.length(); i++) {
			System.out.println("\'"+ input.charAt(i) + "\'");
		}
		scan.close();
	}

}
