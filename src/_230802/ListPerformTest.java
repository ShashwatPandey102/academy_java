package _230802;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ListPerformTest {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		List<Integer> arrayList2 = new ArrayList<>(linkedList); // 컬렉션 프레임워크 자료구조 사이의 변환
		List<Integer> linkedList2 = new LinkedList<>(arrayList);
		
		System.out.println("=========== arrayList 순차 추가 ===========");
		addSeq(arrayList);
		
		System.out.println("=========== linkedList 순차 추가 ===========");
		addSeq(linkedList);
		
		System.out.println("=========== arrayList 랜덤 추가 ===========");
		addRandom(arrayList);
		
		System.out.println("=========== linkedList 랜덤 추가 ===========");
		addRandom(linkedList);
		
		System.out.println("=========== arrayList 중간 삭제 ===========");
		removeRandom(arrayList);
		
		System.out.println("=========== linkedList 중간 삭제 ===========");
		removeRandom(linkedList);
		
		System.out.println("=========== arrayList 순차(전체) 삭제 ===========");
		removeSeq(arrayList);
		
		System.out.println("=========== linkedList 순차(전체) 삭제 ===========");
		removeSeq(linkedList);
		
	}
	
	// 순차 추가 (10만 번)
	public static void addSeq(List<Integer> list) {
		long start = new Date().getTime(); // 현재 시간을 밀리초로 가져옴
		
		for (int i = 0; i < 1_000_000; i++) {
			list.add(i);
		}
		
		System.out.println(System.currentTimeMillis() - start + "ms");
	}
	
	// 중간(랜덤) 추가
	public static void addRandom(List<Integer> list) {
		long start = new Date().getTime(); // 현재 시간을 밀리초로 가져옴
		
		for (int i = 0; i < 10_000; i++) {
			list.add(0, i); // 0번 인덱스에 추가
		}
		
		System.out.println(System.currentTimeMillis() - start + "ms");
	}
	
	// 중간(랜덤) 삭제
	public static void removeRandom(List<Integer> list) {
		long start = new Date().getTime(); // 현재 시간을 밀리초로 가져옴
		
		for (int i = 0; i < 10_000; i++) {
			list.remove(0); // 0번 인덱스 삭제
		}
		
		System.out.println(System.currentTimeMillis() - start + "ms");
	}
	
	// 전체 삭제
	public static void removeSeq(List<Integer> list) {
		long start = new Date().getTime(); // 현재 시간을 밀리초로 가져옴
		
		for (int i = 0; i < 10_000; i++) {
			list.remove(list.size() - 1); // 마지막 요소 삭제		
		}
		
		System.out.println(System.currentTimeMillis() - start + "ms");
	}
	
	
}







