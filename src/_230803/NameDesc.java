package _230803;

import java.util.Comparator;

public class NameDesc implements Comparator<Member2>{
	
	@Override
	public int compare(Member2 o1, Member2 o2) {
		return o1.compareTo(o2) * -1; // 이름으로 내림차순 정렬
	}
}
