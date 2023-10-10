package programmers;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/134240
// 10월10일

//food			result
//[1, 3, 4, 6]	"1223330333221"
//[1, 7, 1, 2]	"111303111"

public class FoodFighter {

	public static void main(String[] args) {

		int[] food = { 1, 3, 4, 6 };

		List<Integer> list = new ArrayList<>();

//		if (food[1] >= 2) {
//			for (int i = 0; i < food[1] / 2; i++) {
//				list.add(1);
//			}
//		}
//		
//		if (food[2] >= 2) {
//			for (int i = 0; i < food[2] / 2; i++) {
//				list.add(2);
//			}
//		}
//		
//		if (food[3] >= 2) {
//			for (int i = 0; i < food[3] / 2; i++) {
//				list.add(3);
//			}
//		}

		for (int i = 1; i < food.length; i++) {
			if (food[i] >= 2) {
				for (int j = 0; j < food[i] / 2; j++) {
					list.add(i);
				}
			}
		}

		list.add(0); // food[0]의 값 만큼 출력

//		
//		if (food[3] >= 2) {
//			for (int i = 0; i < food[3] / 2; i++) {
//				list.add(3);
//			}
//		}
//		
//		if (food[2] >= 2) {
//			for (int i = 0; i < food[2] / 2; i++) {
//				list.add(2);
//			}
//		}
//		
//		if (food[1] >= 2) {
//			for (int i = 0; i < food[1] / 2; i++) {
//				list.add(1);
//			}
//		}

		for (int i = food.length - 1; i > 0; i--) {
			if (food[i] >= 2) {
				for (int j = 0; j < food[i] / 2; j++) {
					list.add(i);
				}
			}
		}
		StringBuffer result = new StringBuffer();
		for (int a : list) {
			result.append(String.valueOf(a));
		}

		String answer = result.toString();
		System.out.println(answer);
	}
}
