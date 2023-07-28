package _230728;

public class LombokTest {
	public static void main(String[] args) {
		
		LombokVO vo = new LombokVO();
		
		System.out.println(vo);
		
		vo.getI();
		
		LombokVO vo2 = LombokVO.builder().d(10).s("가").build(); // 이런 빌더 패턴을 활용할 수 있음
		
		System.out.println(vo2);
	}
}
