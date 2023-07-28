package _230728;

public class Outer {
	
	int i;
	static int si;
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		
		Outer.Inner inner = outer.new Inner(); // Outer 인스턴스 내에 있는 내부 클래스를 생성
		Outer.Inner inner2 = new Outer().new Inner(); // Outer 인스턴스를 먼저 생성 후 그 안의 Inner 인스턴스를 생성
		
		inner.m();
		inner2.m();
		
		Outer.SInner sInner = new Outer.SInner(); // 스태틱 내부 클래스는 외부 클래스의 생성 없이 할 수 있다.
		sInner.sm();
		
		int li = 0;
		
		// 로컬 내부 클래스
		class Local{
			void lm() {
				System.out.println("Local.lm() 실행");
			}
		}
		
		Local local = new Local();
		local.lm();
	}
	
	// 인스턴스 내부 클래스
	class Inner{
		void m() {
			System.out.println("Inner.m() 실행");
		}
	}
	
	// 스태틱 내부 클래스 (원래는 class에 static 못 붙임. 내부 클래스에만 가능)
	static class SInner{
		void sm() {
			System.out.println("SInner.sm() 실행");
		}
	}
}






