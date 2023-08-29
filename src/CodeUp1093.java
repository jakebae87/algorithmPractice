import java.util.Scanner;

public class CodeUp1093 {

	public static void main(String[] args) {
		// https://www.codeup.kr/problem.php?id=1093

//		int[] random = { 1, 3, 2, 2, 5, 6, 7, 4, 5, 9 }; 두번째 입력값 테스트용

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt(); // 첫번재 입력된 값을 변수에 저장
		int[] call = new int[number]; // 위 값으로 두번째 입력될 값을 저장할 배열의 길이 결정
		int[] result = new int[23];

		for (int i = 0; i < call.length; i++) {	
			//두번째 입력받은 값을 차례대로 result 배열의 인덱스로 받는다.
			//result 배열의 인덱스는 0부터 시작하므로, 만약 scan.nextInt()가 1이라면 인덱스가 불일치하게 된다.
			//그래서 result 배열의 인덱스 0이 출석번호 1이 되고 입력받은 숫자가 1(출석부른 번호)이라면 해당 인덱스에 +1을 시켜준다.
			result[scan.nextInt()-1]++;
		}
		
		scan.close();	// 사용 완료한 Scanner 클래스는 종료한다.
		
//		System.out.print(Arrays.toString(result));
		for (int i = 0; i < result.length; i++) {
			System.out.printf("%d ", result[i]);
		}
	}
}


//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		// https://www.codeup.kr/problem.php?id=1093
//
//		Scanner scan = new Scanner(System.in);
//		int times = scan.nextInt();
//		int[] call = new int[times];
//		int[] result = new int[23];
//
//		// 난수를 call에 저장하기
//		for (int i = 0; i < times; i++) {
//			int number = (int) (Math.random() * 24 + 1);
//			call[i] = number;
//		}
////		System.out.println(Arrays.toString(call));
//
//		for (int i = 0; i < result.length; i++) {
//			for (int j = 0; j < call.length; j++) {
//				if (i + 1 == call[j]) {
//					result[i] = result[i] + 1;
//				}
//			}
//		}
////		System.out.print(Arrays.toString(result));
//		for (int i = 0; i < result.length; i++) {
//			System.out.printf("%d ", result[i]);
//		}
//	}
//}





