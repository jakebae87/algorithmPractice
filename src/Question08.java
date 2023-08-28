import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		
		//https://www.codeup.kr/problem.php?id=1098

		Scanner scan = new Scanner(System.in);
		
//		첫 줄에 격자판의 세로(h), 가로(w) 가 공백을 두고 입력되고,
		String[] firstLine = scan.nextLine().split(" ");	// 바둑판 가로 세로
		int height = Integer.parseInt(firstLine[0]);
		int width = Integer.parseInt(firstLine[1]);
		
//		두 번째 줄에 놓을 수 있는 막대의 개수(n)
		String numberOfSticks = scan.nextLine();	// 막대 갯수
		
//		세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력된다.
		String[] thirdLine = scan.nextLine().split(" ");
		int length = Integer.parseInt(thirdLine[0]);
		int direction = Integer.parseInt(thirdLine[1]);
		int x = Integer.parseInt(thirdLine[2]);
		int y = Integer.parseInt(thirdLine[3]);
		
		for(int i = 0; i < height; i++) {
			for(int j=0; j< width; j++) {
				if(i == x && j == y) System.out.print(1);
				else System.out.print(0);
			}
			System.out.println();
		}
	}
}
