package _230801;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); // 이번엔 List 인터페이스 선언 시 제네릭 타입을 지정해줬다.
		
//		list.add(1234); // 프로그램 소스에 대한 안정성을 보장한다. (String 타입 이외의 타입은 넣을 수 없음)
		list.add(1234 + "");
		list.add("가나다라");
		
		list.add(new GenericEx().toString());
		
		System.out.println(list);
		
		String s = list.get(2); // 반대로 List에서 값을 가져올 때도 타입이 고정이다
		System.out.println(s);
		
		// 이번엔 제네릭을 사용하지 않았을 때를 비교해보자
//		List list2 = new ArrayList(); // 제네릭을 적지 않으면 내부적으로 <Object>로 설정함
		List<Integer> list2 = new ArrayList<>(); // 제네릭을 적지 않으면 내부적으로 <Object>로 설정함
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		int sum = 0;
		
		for (int i = 0; i < list2.size(); i++) {
//			sum += (int)list2.get(i); // 그냥 get을 해버리면 Object로 가져오기 때문에 사용할 때마다 일일이 강제 형변환을 해줘야 함
			sum += list2.get(i);
		}
		
		System.out.println(sum);
	}
}













