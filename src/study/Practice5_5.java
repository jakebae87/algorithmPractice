package study;

public class Practice5_5 {

	public static void main(String[] args) {
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];

		for (int i = 0; i < ballArr.length; i++) {
			int j = (int) (Math.random() * ballArr.length); // 임의의 index를 변수 j에 저장 (랜덤으로 위치를 선택한다.)
			int temp = 0;

			if (i != j) {
				temp = ballArr[i];
				ballArr[i] = ballArr[j];
				ballArr[j] = temp;
			}
		}

		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		for (int i = 0; i < 3; i++) {
			ball3[i] = ballArr[i];
		}

		for (int i = 0; i < ball3.length; i++) {
			System.out.println(ball3[i]);
		}
	}

}
