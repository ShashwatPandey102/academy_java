package _230720;

public class CharEx {
	public static void main(String[] args) {
		
		for (int i = '가'; i <= '가' + 50; i++) {
			System.out.print((char)i);
		}

		System.out.println();
		
		// 한글 유니코드는 각 자음별로 중성 종성의 순서가 같다
		for (int i = '나'; i <= '나' + 50; i++) {
			System.out.print((char)i);
		}

		System.out.println('까' - '가'); // 588개씩 있음
		
		// 자음 개수 19개 (쌍자음 포함)
		System.out.println(588 * 19);
		
		System.out.println('개' - '가'); // 하나당 28개인데, 28개 중 하나가 받침이 없음
		
		System.out.println(588 / 28); // 종성 없는 개수는 자음당 21개
		
		System.out.println(21 * 19); // 11172개 중 399개만이 받침이 없음

		for (int i = '가'; i < '까'; i++) {
			System.out.print((char)i);
		}
		
		// 빈도에 대한 연산 : 나머지 연산을 이용한다
		
		// 받침이 있으면 이/을, 없으면 가/를을 쓴다
		
		
		
		
//		for (int i = 'a'; i <= 'z'; i++) {
//			// 기본적으로 int형이라서 타입 캐스팅해야 함
//			System.out.print((char)i);
//		}
	}
}
