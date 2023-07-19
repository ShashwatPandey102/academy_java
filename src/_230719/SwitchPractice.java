package _230719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchPractice {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("탄생월을 입력하세요");
			
			int month = Integer.parseInt(br.readLine());
			String season = "";
			
			switch(month / 3) {
				case 1:
					season = "봄";
					break;
				case 2:
					season = "여름";
					break;
				case 3:
					season = "가을";
					break;
				case 0:
				case 4:
					season = "겨울";
					break;
				default:
					throw new Exception("제대로 입력해주세요");
			}
			
			System.out.printf("태어나신 달의 계절은 %s입니다", season);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


