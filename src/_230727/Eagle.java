package _230727;

public class Eagle extends Animal{
	
	public Eagle(String type, String name) {
		super(type, name);
	}
	
	@Override
	public void sleep() {
		// 필드에 대한 직접 접근은 위험하므로 캡슐화, 은닉화를 해서 메서드를 통해 접근한 것이다.
		System.out.println(this.getName() + "은(는) 하늘에서 잠을 잔다.");
	}
	
}
