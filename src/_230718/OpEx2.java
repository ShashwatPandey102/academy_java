package _230718;

import java.text.DecimalFormat;

public class OpEx2 {
	public static void main(String[] args) {
		
		int a = 5 + 5;
		System.out.println("5 + 5 = " + a);
		
		int b = a - 5;
		System.out.println("10 - 5 = " + b);
		
		int c = b * 2;
		System.out.println("5 * 2 = " + c);
		
		int d = c / 5;
		System.out.println("10 / 5 = " + d);
		
		int e = 10 % 3;
		System.out.println("10 % 3 = " + e);
		
		System.out.println(2 + 4 * 2);
		
		System.out.println(10 / 3f);
		System.out.println(10 / 3d);
		
		int number = 1000_0000; // 자바에서는 숫자 사이에 언더바를 넣어 자리수를 편하게 볼 수 있다
		
		// * 와 / 는 연산순위가 동등하므로 왼쪽부터 순서대로 연산한다
		int result1 = number * number / number; // 0이 14개 붙으므로 오버플로우가 나서 제대로 연산값이 나오지 않는다
		int result2 = number / number * number; // 오버플로우가 나지 않는다
		
		long result3 = (long)number * number / number;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		double d2 = 1.2345678901234;
		double d3 = (int) (d2 * 100) / 100.0;
		
		// DecimalFormat 클래스를 이용한 방법도 있음
		DecimalFormat df = new DecimalFormat("#.##");
		String str = df.format(d2);
		double d4 = Double.parseDouble(str);
		
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
	}
}







