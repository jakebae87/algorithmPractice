package programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/12947
//12월26일

public class harshadNumber {
	public static void main(String[] args) {
		int x = 12;
		int number = 0;
		boolean answer = true;
		
		String translation = String.valueOf(x);				// 매개변수 x를 String으로 형변환 (길이 구하기 위함)
		
		for(int i = 0; i < translation.length(); i++) {	
			char imp = translation.charAt(i);					// index 0부터 매개변수의 값을 분리
			int data = Character.getNumericValue(imp);
			number += data;
		}

		if(x%number == 0) {
			System.out.println(answer);
		}else {
			System.out.println(answer);
		}
	}
}
