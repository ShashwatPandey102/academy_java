package _230803;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx2 {
	public static void main(String[] args) {
	
		Member2 m1 = new Member2("홍길동", 30);
		Member2 m2 = new Member2("이순신", 40);
		Member2 m3 = new Member2("김유신", 50);
		
		TreeSet<Member2> set = new TreeSet<>();
		
		set.add(m1);
		set.add(m2);
		set.add(m3); // 넣을 때마다 Comparable을 구현한 클래스의 내부의 compareTo 메서드를 기반으로 정렬을 함
		
		System.out.println(set);
		
		TreeSet<Member2> set2 = new TreeSet<>(new AgeDesc());
		
		set2.add(m1);
		set2.add(m2);
		set2.add(m3);
		
		System.out.println(set2);
		
		TreeSet<Member2> set3 = new TreeSet<>(new NameDesc()); // 이렇게 TreeSet 객체를 만들 때 인자 내에 Comparator 인터페이스를 구현한 일종의 '비교 기준'을 주면서 TreeSet을 생성한다. 그렇게 되면
		
		set3.add(m1);
		set3.add(m2);
		set3.add(m3);
		
		System.out.println(set3);
		
		System.out.println("=========Member==========");
		
		// 이번엔 익명 클래스를 활용하여 TreeSet을 정렬해보자
		TreeSet<Member> set5 = new TreeSet<>(new MyComp()); // 당연히 그냥 MyComp가 아니고 new MyComp()로 생성해서 넣어야 함
		
		// 내부적으로 정렬 기준이 없기 때문에 TreeSet에 해당 객체를 삽입 시 Member cannot be cats to java.lang.Comparable 오류가 난다.
		set5.add(new Member("김유신", 50)); // Member cannot be cast to java.lang.Comparable at java.util.TreeMap.compare(Unknown Source)
		set5.add(new Member("이순신", 40));
		
		System.out.println(set5); 
		
		// 정렬 기준 객체를 Comparator 인터페이스를 익명 내부 클래스로 구현함과 동시에 객체를 만들 것이다
		Comparator<Member> comparator = new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				
				return o2.age - o1.age; // 내림차순
			}
		};
		
		TreeSet<Member> set6 = new TreeSet<>(comparator); // 아까 만들었던 내부 클래스 구현한 인터페이스 비교용 객체를 사용하여 TreeSet을 생성한다
		
		set6.add(new Member("김유신", 50));
		set6.add(new Member("이순신", 40));
		set6.add(new Member("홍길동", 60));
		
		System.out.println(set6);
		
		// 이번엔 아예 TreeSet 생성 시 인자로 바로 Comparator 객체를 구현과 동시에 생성하면서 해볼 것이다.
		TreeSet<Member2> set7 = new TreeSet<>(new Comparator<Member2>() {
			@Override
			public int compare(Member2 o1, Member2 o2) {
				return o1.getName().compareTo(o2.getName()); // 이름으로 오름차순
			}
		});
		
		
		
	}
}

// Member에 대한 정렬 기준 클래스인 MyComp를 만듦
class MyComp implements Comparator<Member>{
	
	// Comparator 인터페이스 구현 시 반드시 재정의 해야 하는 compare 메서드
	@Override
	public int compare(Member o1, Member o2) {
		return o1.age - o2.age; // 앞에서 뒤를 빼면 오름차순이다.
	}
}

















