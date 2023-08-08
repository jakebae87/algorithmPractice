import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		// https://www.codeup.kr/problem.php?id=1167
		
		// 두 번째 수
		//세 개의 숫자가 주어질 때 작은 순서로 나열 했을 때, 두번째 수를 출력해보자.
		//예를 들어, 5 9 2 가 있다면, 작은 순서로 나열하면 2 5 9이고 두번째 수는 5이다.
		
		Scanner scan = new Scanner(System.in);
		
		String[] numbers = scan.nextLine().split(" ");
		// 입력받은 값을 numbers 변수에 배열로 저장한다.
		// 입력을 5 9 2로 입력하면 컴퓨터는 문자열로 '5 9 2'로 인식하게 된다. scan.nextLine();
		// 이 때 scan.next() 함수를 사용하면 문자열이 아닌 문자(글자) 하나만 저장하게 된다. 즉 5를 제외한 나머지 값은 저장이 안된다. 그래서 nextLine()함수로 문자열을 저장한다.
		// 이를 split 함수를 통해 빈공간을 기준으로 나누고 이를 배열로 저장한다. String[] numbers = {5,9,2};

//===================================================================================================
		
		// [방법1]for문을 두번써서 인덱스 0값과 나머지 전체를 비교
		
		for(int i = 0; i < numbers.length; i++) {		
			for(int j = 0; j < numbers.length; j++) {
				if(Integer.parseInt(numbers[i]) < Integer.parseInt(numbers[j])) {
					String temp;
					temp = numbers[i];			// 작은 비교값을 temp에 저장
					numbers[i] = numbers[j];	// 앞에 뒷값을 저장
					numbers[j] = temp;			// 작은 비교값을 뒷값에 저장
				}
			}
		}
					
//	첫 배열 값: 5,9,2
//	인덱스 0 비교(5기준): 9,5,2
//	인덱스 1 비교(9기준): 5,9,2
//	인덱스 2 비교(2기준): 2와 5 비교해서 위치 바꾸면 2,9,5 / i는 계속 인덱스 2이므로 값은 5, 5와 9비교해서 서로의 위치를 변경
//	그래서 2,5,9가 된다.
				
//===================================================================================================
		
		// [방법2] 중복 for문으로 비교한 인덱스를 순서대로 비교하기(중복비교 하지 않는다.)
		
		for(int i = 0; i < numbers.length; i++) {		
			for(int j = i; j < numbers.length; j++) {
				if(Integer.parseInt(numbers[i]) > Integer.parseInt(numbers[j])) {
					String temp;
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;	
				}
			}
		}
		
		System.out.printf("%s,%s,%s",numbers[0],numbers[1],numbers[2]);		// 두번째 값을 출력하기 위해서 인덱스 1값을 출력한다.
		
	}
}
