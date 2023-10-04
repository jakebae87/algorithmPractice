package programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/161989
// 10월4일

//n		m	section		result
//8		4	[2, 3, 6]		2
//5		4	[1, 3]			1
//4		1	[1, 2, 3, 4]	4

class Solution {
	public int solution(int n, int m, int[] section) {

		// 첫번째 예시 입력값 활용

		int answer = 0;
		return answer;
	}
}

public class RollingWall {

	public static void main(String[] args) {
		int n = 8;
		int m = 4;
		int[] section = { 2,3,6 };
		int answer = 0;

		int[] wall = new int[n];
		for (int i = 0; i < section.length; i++) {
			wall[section[i]-1] = 1;
		}
		
		System.out.println(Arrays.toString(wall));

		for (int i = 0; i < wall.length; i++) {
			if (wall[i] == 1) {
				for (int j = i; j < m; j++) {
					wall[j] = 0;
				}
				answer++;
			}
		}
		System.out.println(answer);
	}

}