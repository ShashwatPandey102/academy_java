package _230803;

import java.util.Comparator;

public class AgeDesc implements Comparator<Member2>{ // 여기에 제네릭을 입력하지 않으면 Object로 사용되므로 계속 Member2로 다운캐스팅 해줘야 함
	
	// Comparator 뜻이 '비교자, 비교할 때 쓰는 것'이라는 뜻이므로, 일종의 '비교할 기준'을 만드는 것이다
	@Override
	public int compare(Member2 o1, Member2 o2) {
		return o2.getAge() - o1.getAge(); // 나이로 내림차순으로 정렬. 뒤 - 앞 : 내림차순
	}
}
