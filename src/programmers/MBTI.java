package programmers;

import java.util.HashMap;
import java.util.Map;

//https://school.programmers.co.kr/learn/courses/30/lessons/118666
//10월16일

//survey							choices				result
//["AN", "CF", "MJ", "RT", "NA"]	[5, 3, 2, 7, 5]		"TCMA"
//["TR", "RT", "TR"]				[7, 1, 3]			"RCJA"

public class MBTI {

	public static void main(String[] args) {
//		test 1
//		String[] survey = { "AN", "CF", "MJ", "RT", "NA" };
//		int[] choices = { 5, 3, 2, 7, 5 };

//		test 2
		String[] survey = { "TR", "RT", "TR" };
		int[] choices = { 7, 1, 3 };
		String answer = "";
		StringBuilder temp = new StringBuilder();

		Map<Character, Integer> result = new HashMap<>();

		result.put('R', 0);
		result.put('T', 0);
		result.put('C', 0);
		result.put('F', 0);
		result.put('J', 0);
		result.put('M', 0);
		result.put('A', 0);
		result.put('N', 0);

		for (int i = 0; i < survey.length; i++) {
			char first = survey[i].charAt(0); // A
			char second = survey[i].charAt(1); // N

			if (choices[i] < 4) {
				int firstNumber = result.get(first);
				result.put(first, firstNumber + 4-choices[i]);
			} else {
				int secondNumber = result.get(second);
				result.put(second, secondNumber + choices[i]-4);
			}

		}
		temp.append(result.get('R') >= result.get('T') ? 'R' : 'T');
		temp.append(result.get('C') >= result.get('F') ? 'C' : 'F');
		temp.append(result.get('J') >= result.get('M') ? 'J' : 'M');
		temp.append(result.get('A') >= result.get('N') ? 'A' : 'N');

		answer = temp.toString();
		System.out.println(answer);
	} // main
}
// class
