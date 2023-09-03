package study;

import java.util.Scanner;

public class Practice5_6 {

	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone" };

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();

			for (int x = 0; x < question.length; x++) {
				int random = (int) (Math.random() * question.length);
				char temp;

				if (x != random) {
					temp = question[x];
					question[x] = question[random];
					question[random] = temp;
				}

			}

			System.out.printf("Q%d. %s의 정답을 입력하세요.", i + 1, new String(question));

			String answer = scanner.nextLine();
			if (words[i].equals(answer.trim()))
				System.out.println("정답입니다.");
			else
				System.out.println("틀렸습니다.");
		}
	}

}
