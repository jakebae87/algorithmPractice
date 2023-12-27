package programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/12943
//12월27일

public class Collatz {
	public static void main(String[] args) {
		int num = 626331;
		int answer = 0;

		if (num == 1) {
			answer = 0;
		} else {
			long n = num;
			while (n != 1) {
				if (n % 2 == 0) {
					// 짝수
					n = n / 2;
					answer++;
				} else {
					// 홀수
					n = (n * 3) + 1;
					answer++;
				}
			}
		}

		if (answer >= 500) {
			answer = -1;
		}

		System.out.println(answer);
	}
}
