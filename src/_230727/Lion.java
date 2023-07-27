package _230727;

public class Lion extends Animal{
	
	public Lion(String type, String name) {
		super(type, name);
	}
	
	@Override
	public void sleep() {
		System.out.println(this.getName() + "은(는) 숲속에서 잠을 잔다.");
	}
	
}
