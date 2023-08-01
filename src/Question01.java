public class Question01 {

	public static void main(String[] args) {

		int point[] = { 100, 555, 200, 300, 111 };

		// => point 순으로 출력하기
		for (int i = 0; i < point.length - 1; i++) { // 인덱스 i는 0부터 4까지 반복문 실행
			for (int j = point.length - 1; j > i; j--) { // 인덱스 j는 4부터 1까지 반복문 실행
				System.out.printf("%d,%d", point[i], point[j]);
				System.out.println();
			}
		}
		// 다른 풀이 방법
//		for (int i = 0; i < point.length; i++) {
//			for (int j = 0; j < point.length; j++) {
//				if (i < j)
//					System.out.printf("%d,%d", point[i], point[j]);
//				System.out.println();
//			}
//		}
	}

}
