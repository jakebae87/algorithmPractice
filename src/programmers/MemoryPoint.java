package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/176963
// 9월26일

public class MemoryPoint {

	public static void main(String[] args) {
		String[] name = { "may", "kein", "kain", "radi" };
		int[] yearning = { 5, 10, 1, 3 };
		String[][] photo = { { "may", "kein", "kain", "radi" }, { "may", "kein", "brin", "deny" },
				{ "kon", "kain", "may", "coni" } };

		int[] result = new int[photo.length];

		Map<String, Integer> data = new HashMap<>();

		for (int i = 0; i < name.length; i++) {
			data.put(name[i], yearning[i]);
		}

		for (int i = 0; i < photo.length; i++) { // 행의 길이 3
			for (int j = 0; j < photo[i].length; j++) { // 열의 길이 4
				if (data.get(photo[i][j]) == null) {
					result[i] += 0;
				} else {
					result[i] += data.get(photo[i][j]);
				}
			}
		}

		System.out.println(Arrays.toString(result));
	}

}