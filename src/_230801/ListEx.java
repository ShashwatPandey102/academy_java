package _230801;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			list.add(i * 3 + 1);
		}
		
		System.out.println(list); // 바로 toString으로 편하게 볼 수 있음
		
		System.out.println(list.get(2)); // 인덱스로 접근해서 반환함
		System.out.println(list.size()); // 리스트의 개수 반환
		System.out.println(list.remove(1));
		System.out.println(list);
		
		System.out.println(list.remove(new Integer(1))); // 이렇게 하면 Integer 1을 삭제함
		System.out.println(list);
		
		list.add(2, "홍길동"); // 2번째 인덱스에 넣고 나머지를 밀어넣는다 (다만 사이즈보다 작게 넣어야 함)
		System.out.println(list);
		
		list.clear();
		
		System.out.println(list.isEmpty());
		System.out.println(list.size() == 0);
		
		list.add("가");
		list.add("나");
		list.add("다");
		
		System.out.println(list);
		
		list.remove("나");
		
		System.out.println(list);
	}
}




















