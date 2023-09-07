package codeup;

import java.util.Scanner;

public class CodeUp1054 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		
		if(a == 1 && b == 1) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
