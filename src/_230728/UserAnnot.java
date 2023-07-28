package _230728;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 사용자 어노테이션 정의
@Retention (value = RetentionPolicy.RUNTIME) // 리텐션 정책은 RUNTIME, CLASS, SOURCE가 있다.
@Target(ElementType.METHOD) // 이 사용자 어노테이션이 어디에 붙을 수 있는지 제한 (현재는 메서드 위에만 붙을 수 있게 한 것) -> 만약 생략하면 모든 곳에 붙일 수 있음
// 어노테이션 범위 어디까지 미칠지 선언. 어노테이션이 런타임 시에도 유효하도록 지정하는 것.
public @interface UserAnnot {
	
	// 사용자 정의 어노테이션이 갖는 멤버 변수
	// 사용자 정의 어노테이션을 선언할 때, 멤버 변수들을 정의할 때 메서드 선언과 유사한 방식으로 한다.
	// 
	String value(); // 문자열 타입의 값을 저장
	
	// 이렇게 선언해놓으면, @UserAnnot(value = "Hello")와 같이 사용하게 된다.
	int number() default 5;
}
