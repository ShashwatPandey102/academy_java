package _230718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputPractice2 {
	public static void main(String[] args) {
		// 2. 정수 하나를 입력받아 해당 숫자가 짝수(true)인지 홀수(false)인지 구하시오
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(br.readLine());

			System.out.println(n % 2 == 0);
			
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주세요");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
