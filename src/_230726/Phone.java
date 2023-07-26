package _230726;

public class Phone {
	String name;
	String color;
	String company;
	
	void call() {
		System.out.println("전화를 건다");
	}
	
	void receive() {
		System.out.println("전화를 받다");
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", color=" + color + ", company=" + company + "]";
	}
	
	
}
