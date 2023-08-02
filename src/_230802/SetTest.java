package _230802;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class SetTest {
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		
		set.add(new Member(1, "홍길동"));
		set.add(new Member(2, "김길동"));
		set.add(new Member(2, "김길동"));
		set.add(new Member(1, "김길동"));
		
		System.out.println(set);
		
		for(Member m : set) {
			System.out.println(m.hashCode());
		}
	}
}

@NoArgsConstructor
@AllArgsConstructor
@ToString
//@EqualsAndHashCode // equals()와 hashCode()를 오버라이딩하면 자동으로 객체의 동등성을 판단하여 완전히 객체의 값이 같을 때 같다고 판단해준다
class Member implements Cloneable{
	private int no;
	private String name;
	
	// hashCode()와 equals() 메서드를 오버라이딩하는 이유는, 이 두 가지를 이용해 두 객체가 같은지를 판단하기 위해서이다.
	// Set은 내부적으로 equals() 메서드와 hashCode() 메서드를 함께 사용하여 요소들의 동일성 여부를 판단한다.
	// 아래와 같은 작업을 자동화하기 위해 @EqualsAndHashCode 어노테이션을 붙이는 것이다.
	// 또한 @Data 어노테이션엔 getter, setter, toString, RequiredConstructor, EqualsAndHashCode 등을 포함하고 있다.
	
	@Override
	public int hashCode() {
//		return super.hashCode();
		// no, name 필드값을 기준으로 해시값을 만든다
		return Objects.hash(this.no, this.name); // 넣은 인자를 기반으로 해시값을 만들어 줌
	}
	
	@Override
	public boolean equals(Object obj) { // 두 객체가 동등한지 판단하여 boolean값을 리턴함
		if(!(obj instanceof Member)) { // 아예 Member 객체가 아니면 false
			return false;
		}
		
		Member member = (Member)obj; // 인자로 받은 객체를 Member로 명시적 형변환
		
		if(this.no == member.no && this.name.equals(member.name)) {
			return true;
		}
		
		return false;
	}
	
	// 생성자를 통한 객체 복사
	Member(Member m){ // 자기 자신의 타입을 인자로 받아 그 인자 객체의 값을 본인의 값으로 한다.
		this.no = m.no;
		this.name = m.name;
	}
	
	// Object 클래스에 있는 clone() 메서드를 오버라이딩
	// 오버라이딩하려면 오버라이딩하는 메서드는 접근제한자는 넓어질 수만 있고, 예외는 좁아질 수만 있다.
	// 또한 오버라이딩할 때, 반환 타입은 원래 반환 타입의 자식 클래스일 수 있음.
	@Override
//	protected Object clone() throws CloneNotSupportedException {
//	protected Object clone() { // 여기서 처리하면 이를 호출하는 곳에서 예외를 처리하지 않아도 됨
	public Member clone() { // 공변 반환 타입 (Covariant Return Type), 접근 제한자를 public으로 넓힘
//		Object obj = null;
		Member obj = null;
		
		try {
//			obj = super.clone();
			obj = (Member)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return obj;
	}
}


















