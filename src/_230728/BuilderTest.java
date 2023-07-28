package _230728;

public class BuilderTest {
	public static void main(String[] args) {

		// 이런 생성자만을 사용하는 경우의 단점 : 원하는 필드만 몇 개 초기화하고 싶을 때 안 됨
		BuilderVO vo = new BuilderVO();
		BuilderVO vo2 = new BuilderVO(1, "가", 10d);
		
		// 이런 식으로 builder 패턴을 통해 만들면 원하는 필드만 초기화할 수 있다. 즉, 초기화할 필드를 선택해서 객체를 생성할 수 있다.
		BuilderVO vo3 = BuilderVO.builder().i(1).s("가").d(10d).build();
		BuilderVO vo4 = BuilderVO.builder().i(1).build();

		System.out.println(vo2);
		System.out.println(vo3);
		
		// BuilderVO.builder().i(1)를 하게 되면 Builder 내부 클래스의 i가 설정된 채로 반환된다..
		// 그리고 Builder.build()로 BuilderVO 객체로 변환하여 반환하는 것이다.
		System.out.println(vo4);
				
	}
}
