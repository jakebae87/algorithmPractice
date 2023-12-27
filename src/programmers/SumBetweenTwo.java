package programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/12912
//12월27일

public class SumBetweenTwo {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		long answer = 0;
		if (b > a) {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		} else {
			for (int i = a; i >= b; i--) {
				answer += i;
			}
		}
		System.out.println(answer);
	}
}
