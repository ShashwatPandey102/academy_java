package _230731;

public class WrapperEx {
	public static void main(String[] args) {

		Integer i1 = new Integer(10);
		Integer i2 = new Integer("10"); // 문자열형이라도 숫자로 변환 가능하면 Integer 객체 생성 가능
		
		System.out.println("i1 == i2 : " + (i1 == i2)); // 다르다고 나올 것임
		System.out.println("i1.equals(i2) : " + i1.equals(i2)); // 같다고 나올 것임
		System.out.println("i1.toString() : " + i1.toString()); // 10이라고 나올 듯
		
		System.out.println("i1 == 10 : " + (i1 == 10)); // 래퍼 클래스인 Integer 10과 기본자료형 10을 비교하면 같다고 나옴.
		// 이 때 자바는 래퍼 객체인 i1의 값을 언박싱을 수행하여 두 값을 비교한다. (자동 언박싱)
		
		int i3 = 10;
		
		System.out.println("i1 == i3 : " + (i1 == i3));
		
	}
}
