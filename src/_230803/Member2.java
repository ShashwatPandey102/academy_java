package _230803;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
// Comparable이란 뜻이 '비교 가능한'이란 뜻이듯이, 이건 해당 클래스가 TreeSet에서 내부적으로 정렬할 수 있는 기준을 만들어뒀다는 뜻이다.
public class Member2 implements Comparable<Member2>{ // 미리 제네릭에 Member2 클래스로 지정해둔다
	private String name;
	private int age;
	
	// Comparable 인터페이스를 구현했으므로 compareTo 메서드를 오버라이딩 해야 한
	@Override
	public int compareTo(Member2 o) {
		// 여기서 Member2의 compareTo와 String의 compareTo가 다름에 주의할 것! (재귀함수 아님!)
		return this.name.compareTo(o.name); // 문자열 기준 오름차순 (앞에서 뒤를 비교)
//		return o.name.compareTo(this.name); // 문자열 기준 내림차순 (뒤에서 앞을 비교)
	}
}
