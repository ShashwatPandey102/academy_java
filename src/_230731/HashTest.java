package _230731;

public class HashTest {
	public static void main(String[] args) {
		
		HashTest hashTest = new HashTest();
		
		String str = "가나다라";
		String str2 = new String("가나다라");
		
		System.out.println(hashTest.hashCode());
		System.out.println(hashTest.getClass().getName() + "@" + Integer.toHexString(hashTest.hashCode()));
		System.out.println(hashTest); // 클래스명 + 해시코드의 16진수화
		
		// 원래 new로 했으면 다른 주소가 되어야 하지만, String.hashCode()는 오버라이딩돼있으므로 일반 hashCode와는 별개로 String 클래스 독자적으로 동등성을 확인한다.
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str)); // 이게 실제 Object.hashCode()와 같다.
		System.out.println(System.identityHashCode(str2));
	}
}
