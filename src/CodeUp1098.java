import java.util.Scanner;

public class CodeUp1098 {

	public static void main(String[] args) {

		// https://www.codeup.kr/problem.php?id=1098

		Scanner scan = new Scanner(System.in);

//		첫 줄에 격자판의 세로(h), 가로(w) 가 공백을 두고 입력되고,
		String[] firstLine = scan.nextLine().split(" "); // 바둑판 가로 세로
		int height = Integer.parseInt(firstLine[0]);
		int width = Integer.parseInt(firstLine[1]);

//		바둑판 초기화
		int[][] plate = new int[height][width];

//		두 번째 줄에 놓을 수 있는 막대의 개수(n)
		String numberOfSticks = scan.nextLine(); // 막대 갯수

//		세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력된다.
		for (int i = 0; i < Integer.parseInt(numberOfSticks); i++) {
			String[] thirdLine = scan.nextLine().split(" ");
			int length = Integer.parseInt(thirdLine[0]);
			int direction = Integer.parseInt(thirdLine[1]);
			int x = Integer.parseInt(thirdLine[2]);
			int y = Integer.parseInt(thirdLine[3]);

//			plate 배열에다가 조건에 충족하는 값들을 넣고 출력해주자

			// 막대 갯수만큼 반복
			// 입력한 위치(x,y)에서 -1을 해야 해당 위치가 선택된다.
			for (int j = 0; j < length; j++) {
				if (direction == 0) {
					plate[x-1][y-1+j] = 1;	
					// 가로 방향으로 숫자가 찍힌다는 것은, x축은 고정되고 y축에 숫자가 출력된다는 것이다.
				} else {
					plate[x-1+j][y-1] = 1;
				}
			}
		}

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.printf("%d ",plate[i][j]);
			}
			System.out.println();
		}

	}
}
