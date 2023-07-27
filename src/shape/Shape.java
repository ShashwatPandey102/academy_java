package shape;

// 클래스 간의 관계
// 1. 상속
// 2. 포함

//public abstract class Shape { // abstract가 붙으면 추상 클래스를 의미한다 (추상 클래스라고 해서 반드시 추상 메서드만 가질 필요는 없음) -> 추상 클래스로 선언하면, 명시적으로 이 클래스로 구체화 (객체화)하지 말라는 것임)
// 위의 것을 인터페이스로 바꿀 것이다
public interface Shape { // 추상 인터페이스
	double area(); 
}
