package programmers;

public class Fibonacci_numbers {

	public static void main(String[] args) {

		int n = 44;
		int answer = 0;

		int[] number = new int[n + 1];
		number[0] = 0;
		number[1] = 1;
		for (int i = 2; i < number.length; i++) {
			number[i] = number[i - 2] + number[i - 1];
			int temp = number[i] % 1234567;
			answer = temp;
		}
		System.out.println(answer);
	}

}