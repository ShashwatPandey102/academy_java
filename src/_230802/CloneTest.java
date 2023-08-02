package _230802;

import java.util.Arrays;

public class CloneTest {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
		int[] arr2 = arr.clone();
		
		System.out.println(Arrays.toString(arr2));
		
		Member m1 = new Member(1, "홍길동");
		
		// 이제 객체 자체는 다른 객체이지만 내용은 전부 같은 객체로 복사하고 싶다.
		// Array는 clone()을 지원하지만, 다른 사용자 객체인 경우 어떻게 복사할 것인가?
		
		// 생성자를 통한 객체를 클론하는 방법
		Member m3 = new Member(m1); // Member 클래스에 객체 클론용 생성자를 만들어 그것을 사용한다.
		
		// Object 클래스에 선언된 clone() 메서드를 사용하는 방법
		// 다만, 해당 클래스가 Cloneable 인터페이스를 구현해야만 한다
		Member m4 = m1.clone(); // Object 클래스에 clone() 메서드가 protected로 선언되어 있으나, 이것은 직접적인 상속 관계가 아니면 사용할 수 없음. 그래서 clone()을 복사할 해당 클래스에서 오버라이드해서 써야 한다.
		
		System.out.println(m4);
		
		// 지금까지 한 것을 정리하면,
		// 오버라이딩한 clone()의 접근 제한자 public 변경
		// 복사할 클래스에서 Cloneable 인터페이스 구현
		// 오버라이딩한 clone() 메서드 내에서 CloneNotSupportedException 처리
		// 오버라이딩한 clone() 메서드의 반환 타입을 해당 클래스로 변경 (공변 반환 타입)
	}
}







