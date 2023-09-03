package codeup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CodeUp1084 {

	public static void main(String[] args) throws IOException {
		// https://www.codeup.kr/problem.php?id=1084	빛 섞어 색 만들기(설명)
		// 2023-09-01
		
		// 코드업에서 시간초과 발생해서 이를 해결하기 위해 BufferedReader와 BufferedWriter 사용

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = 0;

		String[] number = br.readLine().split(" ");

		for (int i = 0; i < Integer.valueOf(number[0]); i++)
			for (int j = 0; j < Integer.valueOf(number[1]); j++)
				for (int l = 0; l < Integer.valueOf(number[2]); l++) {
					bw.write(i+" "+j+" "+l+"\n");
					count++;
				}

		bw.write(String.valueOf(count));
		bw.flush();
	}

}
