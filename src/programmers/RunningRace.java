package programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/178871
// 테스트 9,10,11,12,13이 시간초과로 실패가 뜸

public class RunningRace {

	static String[] players = { "mumu", "soe", "poe", "kai", "mine" };
	static String[] callings = { "kai", "kai", "mine", "mine" };

	public static String[] solution(String[] players, String[] callings) {

		for (int i = 0; i < callings.length; i++) {
			for (int j = 0; j < players.length; j++) {
				if (callings[i].equals(players[j])) {
					String temp;
					temp = players[j];
					players[j] = players[j - 1];
					players[j - 1] = temp;
					break;
				}
			}
		}

		String[] answer = new String[players.length];
		for (int i = 0; i < players.length; i++) {
			answer[i] = players[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(players, callings)));
	}

}
