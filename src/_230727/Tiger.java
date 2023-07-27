package _230727;

public class Tiger extends Animal{
	
	public Tiger(String type, String name) {
		super(type, name);
	}
	
	@Override
	public void sleep() {
		System.out.println(this.getName() + "은(는) 산속에서 잠을 잔다.");
	}
	
}
