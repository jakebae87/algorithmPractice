package programmers;

import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/133502
// 10월11일

//ingredient					result
//[2, 1, 1, 2, 3, 1, 2, 3, 1]	2
//[1, 3, 2, 1, 2, 1, 3, 1, 2]	0

public class PackHamburger {

	public static void main(String[] args) {
		int[] ingredient = { 2, 1, 1, 2, 3, 1, 2, 3, 1 };
		int answer = 0;
		Stack<Integer> pack = new Stack<>();
		
		for(int a : ingredient) {
			pack.push(a);
			
			if(pack.size() > 3) {
				if(pack.get(pack.size()-1) == 1 
						&& pack.get(pack.size()-2) == 3
						&& pack.get(pack.size()-3) == 2
						&& pack.get(pack.size()-4) == 1
						) 
				{
					answer++;
					pack.pop();
					pack.pop();
					pack.pop();
					pack.pop();
				}
			}
		}
		
		System.out.println(answer);

		// 1,2,3,1 순서대로 배열의 요소가 정렬되었다면, answer에 1을 더하고 해당 인덱스값을 삭제한다.
		// 이 순서 조건을 충족해야지 인덱스를 삭제해야한다.
	}
}
