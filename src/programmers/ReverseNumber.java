package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12932
// 10월30일

//n				return
//12345			[5,4,3,2,1]

public class ReverseNumber {

	public static void main(String[] args) {

		long n = 21592L;

		String[] temp = String.valueOf(n).split("");
		int[] answer = new int[temp.length];

		for (int i = temp.length - 1; i >= 0; i--) {
			answer[temp.length - i -1] = Integer.parseInt(temp[i]);
		}
        
        System.out.println(answer);
	}
}
