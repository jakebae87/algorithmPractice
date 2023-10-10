package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/161989
// 10월4일

public class RollingWall {

	public static void main(String[] args) {
		int n = 8;
		int m = 4;
		int[] section = { 2, 3, 6 };
		int answer = 0;
		int temp = 0;

		for (int i = 0; i < section.length; i++) {
			if (section[i] < temp)
				continue;
			answer++;
			temp = section[i] + m;
		}

		System.out.println(answer);
	}
}

