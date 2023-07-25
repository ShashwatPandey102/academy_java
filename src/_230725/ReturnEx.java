package _230725;

public class ReturnEx {
	public static void main(String[] args) {
		
		Return r = new Return();
		
		String name = r.getName();
		int age = r.getAge();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(r.getName());
		System.out.println(r.getAge());
	}
}

class Return{
	
	String getName() {
		return "홍길동";
	}
	
	int getAge() {
		return 30;
	}
}
