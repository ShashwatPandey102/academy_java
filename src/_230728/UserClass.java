package _230728;

public class UserClass {
	
//	@UserAnnot (value = "A")
	@UserAnnot ("A") // value는 약간 사용자 어노테이션에서 기본값처럼 사용되기 때문에 이렇게 써도 됨
	// methodA()는 value 속성에 A라는 문자열을 전달한다
	public void methodA() {
		System.out.println("methodA() 실행");
	}
	
	// methodB()는 value 속성에 B라는 문자열과 number 속성에 10이라는 정수를 전달한다
	@UserAnnot (value = "B", number = 10)
	public void methodB() {
		System.out.println("methodB() 실행");
	}
}
