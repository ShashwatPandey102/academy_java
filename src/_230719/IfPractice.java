package _230719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfPractice {
	public static void main(String[] args) {
		
		// 숫자를 입력받아 양수, 음수, 0 구분을 if문을 통해 해보자
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder res = new StringBuilder("");
			
			System.out.print("숫자를 입력해주세요 > ");
			
			int n = Integer.parseInt(br.readLine());
			
			if(n > 0) {
				res.append("양수입니다");
			}else if(n == 0) {
				res.append("0입니다");
			}else {
				res.append("음수입니다");
			}
			
			System.out.println(res);
			
		} catch (NumberFormatException e) {
			System.out.println("제대로 입력해주세요");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
