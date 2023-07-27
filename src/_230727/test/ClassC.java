package _230727.test;

import _230727.ClassA;
import _230727.ClassB;
import _230727.ClassD;

public class ClassC {
	public static void main(String[] args) {

		ClassA ca = new ClassA();
		ca.print();

		ClassB cb = new ClassB(); // 접근제한자 때문에 public이 아닌 클래스는 타 패키지에서 보이지 않음
		cb.print(); // 역시 해당 클래스의 접근제한자가 public이 아니기 때문에 외부에서 호출 불가능
		
//		ca.m(); // m() 메서드가 protected이기에 접근 안 됨
		
		new ClassD().m(); // 해당 메서드를 상속을 받아 public으로 바꿨기에 외부에서 접근 가능함
	}
}
