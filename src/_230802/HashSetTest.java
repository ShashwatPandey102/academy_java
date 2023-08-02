package _230802;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		
		// Hash를 사용하는 Set이라 가장 빠름. 그리고 Map도 Hash를 사용하는 Map이 가장 빠름.
		// 해시란, 데이터를 다루는 기법 중 하나로 임의의 크기를 가진 데이터를 고정된 크기의 데이터로 변화시켜 저장하는 것을 말한다.
		// Set이라는 게 집합이라는 개념이라고 보면 됨
		
		Set<String> set = new HashSet<>();
		System.out.println(set);
		
		// 키값이 존재하지 않고 value값만 존재함
		set.add("사과");
		set.add("바나나");
		set.add("바나나"); // 똑같은 값을 넣으면 들어가지 않음
		
		System.out.println(set);
		Set<String> tmpSet = new HashSet<>(set);
		
		Set<String> set2 = new HashSet<>();
		set2.add("바나나");
		set2.add("딸기");
		
		System.out.println(set2);
		
		// 합집합 (중복되는 건 추가 안 됨)
		set.addAll(set2);
		System.out.println(set);
		
		// 교집합
		set = new HashSet<>(tmpSet);
		set.retainAll(set2); // retain : 유지하다라는 뜻
		
		System.out.println(set);
		
		// 차집합
		set = new HashSet<>(tmpSet);
		set.removeAll(set2);
		
		System.out.println(set);
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		while(lotto.size() < 6) {
			lotto.add(new Random().nextInt(45) + 1);
		}
		
		System.out.println(lotto);
		
	}
}









