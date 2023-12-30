package programmers;

import java.util.ArrayList;
import java.util.List;

//https://school.programmers.co.kr/learn/courses/30/lessons/12910?language=java
//12월30일

public class DivideNumbers {
	public static void main(String[] args) {
		int[] arr = { 2, 36, 1, 3 };
		int divisor = 1;
		List<Integer> answer = new ArrayList<Integer>();

		for (int num : arr) {
			if (num % divisor == 0) {
				answer.add(num);
			}
		}
		
		if(answer.size() == 0) {
			answer.add(-1);
		}
		
		for (int i = 0; i < answer.size(); i++) {
		    for (int j = i + 1; j < answer.size(); j++) {
		        if (answer.get(i) > answer.get(j)) {
		            int temp = answer.get(i);
		            answer.set(i, answer.get(j));
		            answer.set(j, temp);
		        }
		    }
		}

		System.out.println(answer);
	}
}
