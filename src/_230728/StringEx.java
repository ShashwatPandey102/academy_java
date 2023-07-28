package _230728;

public class StringEx {
	public static void main(String[] args) {
		
		String str1 = "abcd";
		String str2 = "abcd";
		
		String str3 = new String("abcd");
		String str4 = new String("abcd");
		
		String str5 = "a" + "bcd";

		// 문자열은 자체적인 리터럴을 갖고 있음.
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		System.out.println(str3 == str4);
		
		System.out.println(str1 == str5);
		
		// intern() 을 하면 문자열 리터럴을 반환하는 것과 같다.
		System.out.println(str1 == str3.intern());
		
		System.out.println(str1.equals(str3));
		
		// 그래서 문자열의 주소가 아닌 내용이 같은지를 비교하려면, equals() 메서드를 사용해야 한다
		// 이 equals()는 Object 클래스의 equals이다.
	}
}
