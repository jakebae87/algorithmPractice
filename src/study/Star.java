package study;

public class Star {

	public static void main(String[] args) {

		int line = 5;
		int middle = (line+1)/2;

		for (int st, ed, i = 1; i <= line; i++) {
			if (i <= middle) {
				st = i; // 행과 숫자 시점이 같다 -> i = st
				ed = ((line - middle) * middle) - i;
			} else {
				st = ((line - middle) * middle) - i;
				ed = i;
			}
			for (int j = 1; j <= ed; j++) {
				if (j < st) {
					System.out.print('1');
				} else {
					System.out.print('*');
				}
			}
			System.out.println();

		}

	}
}
