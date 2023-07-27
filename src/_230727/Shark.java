package _230727;

public class Shark extends Animal{
	
	public Shark(String type, String name) {
		super(type, name);
	}
	
	@Override
	public void sleep() {
		System.out.println(this.getName() + "은(는) 물속에서 잠을 잔다.");
	}
	
}
