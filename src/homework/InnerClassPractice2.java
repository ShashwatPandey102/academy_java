package homework;

public class InnerClassPractice2 {
	public static void main(String[] args) {
		System.out.println(new Out().new In().name);
	}
}

class Out{
	class In{
		String name = "자바";
	}
}
