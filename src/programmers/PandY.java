package programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/12916
//12월26일

public class PandY {
	public static void main(String[] args) {
		String s = "ppPooyYy";
		String tr = s.toLowerCase();
		int pNum = 0;
		int yNum = 0;

		for (int i = 0; i < tr.length(); i++) {
			if (tr.charAt(i) == 'p') {
				pNum++;
			} else if (tr.charAt(i) == 'y') {
				yNum++;
			}
		}

		if (pNum == yNum && pNum != 0 && yNum != 0) {
			System.out.println("true");
		} else if (pNum == 0 && yNum == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
