package _230727;

// ClassA를 상속받음
public class ClassD extends ClassA{
	
	// protected를 쓰는 목적이라고 할 수 있음
	public void m() { // 오버라이딩 (오버라이딩할 때는 해당 부모클래스의 메서드의 접근제한자를 같거나 그 이상으로 넓힐 수 있다)
		super.m(); // 부모 메서드를 호출
	}
}
