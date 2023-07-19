package _230718;

import java.text.DecimalFormat;

public class FloatPointEx {
	public static void main(String[] args) {
		
		// 입력받은 소수의 자리수를 반올림하는 구현을 하여라. 소수점 셋째자리에서 둘째자리로 반올림.
		
		double d2 = 1.2345678901234;
		double d = 1000;
		double d3 = (int) (d2 * d) / d;
		
		System.out.println(d2);
		System.out.println(d3);
		
		// DecimalFormat 클래스를 이용한 방법도 있음
//		DecimalFormat df = new DecimalFormat("#.##");
//		String str = df.format(d2);
//		double d4 = Double.parseDouble(str);
//		System.out.println(d4);
		
		double n = 1.56089012;
		double m = 100;
		
		// 소수점 둘째자리로 반올림하기
//		System.out.println(Math.round(n * 100) / 100.0);
		// 위 방법 말고 해당 반올림하는 자리 한자리 뒤에서 5를 더하면 됨
		
//		System.out.println((int)((n + 1 / m * 0.5) * 100) / m);
		System.out.println((int)(n * m + 0.5) / m); // 이게 더 간단함
		
		System.out.println((int)(n * m + 0.9) / m); // 이건 올림 (근데 사실 0.9999999... 로 해야 함)

//		주로 페이징 처리 할 때 반올림을 사용한다
		
		int a = 10;
		int b = 5;
		
		a = 5;
		a += 10;
		
		System.out.println(++a); // 전위 연산자
		System.out.println(a++); // 후위 연산자
		System.out.println(a);
		
		a = a++ + ++a; // 17 + 19 (앞의 후위연산자에 의해 뒤의 a가 18이 되고, 뒤의 전위연산자에 의해 19가 됨)
		System.out.println(a);
	}
}


