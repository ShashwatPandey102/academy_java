package _230801;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("b[a-z]*");
		Matcher m;
		
		// 문자열 bat 확인
		m = p.matcher("bat");
		System.out.println("bat = " + m.matches());
		
		// 문자열 cat 확인
		m = p.matcher("cat");
		System.out.println("cat = " + m.matches());
		
		// 문자열 bed 확인
		m = p.matcher("abed");
		System.out.println("bed = " + m.matches());

		// 문자열 b 확인
		m = p.matcher("b");
		System.out.println("b = " + m.matches());
		
		
		System.out.println("bat".matches("b[a-z]*")); // 이렇게 하면 더 편하게 할 수 있음
		
		System.out.println("홍길동1".matches("[가-힣]*"));
		
		System.out.println("".matches("[A-Za-z0-9]+")); // 왼쪽에 있는 단어가 최소 1개 이상이어야 함
		
		// 첫 문자가 숫자가 안 되게
		System.out.println("".matches(""));
	}
}









