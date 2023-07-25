package _230725;

import java.util.stream.IntStream;

// 하나의 소스 파일에는 하나의 public 클래스가 있는 것이 보통이며, 

public class ParamEx { // main method는 public 클래스 내에 넣어야 함
	public static void main(String[] args) {

		// parameter : 선언부 (매개변수)
		// argument : 실행부 (인자)

		Param p = new Param();

		p.add('A', 'B'); // 자동 형변환 가능한 자료형은 상관 없음
		p.add2(10, 5); // argument
		p.add3(1, 2, 3, 4, 5);

		// 그리고 보낼 때 아예 배열로 보내도 된다
		p.add3(new int[] { 10, 20, 30 });

		System.out.printf("%d %d %d", new Object[] { 1, 2, 3 });
	}
}

class Param {
	void add(int x, int y) { // parameter
		int z = x + y;
		System.out.println(z);
	}

	void add2(double x, double y) {
		double z = x + y;
		System.out.println(z);
	}

	// 가변 인자 사용 시 해당 인자들이 내부적으로 지정한 자료형의 배열로 저장됨
	void add3(int... x) { // 아니면 아예 배열로 들어와도 됨
		int sum = 0;

		// x라는 배열 사용 가능
//		for (int i = 0; i < x.length; i++) {
//			sum += x[i];
//		}

		// 그래서 향상된 for문도 가능
//		for(int v : x) {
//			sum += v;
//		}

		// IntStream도 가능할 듯? (IntStream.of().sum()은 상당히 편함)
		sum = IntStream.of(x).sum();

		System.out.println(sum);
		
		return;
	}
}







