package programmers;

import java.util.ArrayList;
import java.util.List;

//https://school.programmers.co.kr/learn/courses/30/lessons/12928
//12월21일

public class SumOfDivisors {
	public static void main(String[] args) {
		int n = 120;
		int answer = 0;
		List<Integer> numbers = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				numbers.add(i);
			}
		}
		System.out.println(numbers);
		for(int a : numbers) {
			answer += a;
		}
		
		System.out.println(answer);
	}
}
