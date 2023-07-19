package _230718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class InputPractice1 {
	public static void main(String[] args) {
		// 1. 두 수를 입력받아 해당 숫자들의 합계를 구하시오
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder("");
			
			System.out.print("두 수를 공백으로 구분해 입력해주세요 : ");
			
			String input = br.readLine();
			
			StringTokenizer st = new StringTokenizer(input);

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int sum = a + b;
			
			sb.append(String.format("두 숫자의 합은 %d입니다", sum));
			
			System.out.println(sb.toString());
			
		} catch (IOException e) {
			System.out.println("두 숫자를 제대로 입력해주세요");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
