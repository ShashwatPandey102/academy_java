package _230721;

import java.util.Arrays;

public class ArrEx12 {
	public static void main(String[] args) {
		
		// 배열 복사에 앞서서 참조자료형을 먼저 알아야 한다
		int[] arr = {1, 2, 3};
		
		// 이렇게 쓰면 엄밀히 말하면 배열 복사는 아니고 그냥 같은 주소를 갖는 것이다.
//		int[] arr2 = arr; // arr2는 arr의 주소를 갖는다. 그러므로 arr2와 arr은 같은 주소를 갖는다.
//		arr[0] = 5;

		// 좀 원시적인 for문을 이용하면
		int[] arr2 = new int[arr.length]; // new 키워드로 만들게 되면 힙 영역 중 남은 공간에 자동으로 배정이 된다.
		// 즉 새로운 공간에 따로 만드는 것이므로 arr의 값을 변경해도 arr2의 값이 변경되지 않는다
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		arr[0] = 5;
		
		System.out.println(arr2[0]);
		
		// arr과 arr2를 출력하면 주소가 출력되므로 같은 값이 나온다.
		System.out.println(arr);
		System.out.println(arr2);
		
		System.out.println(Arrays.toString(arr2));
		
		int a = 10;
		int b = a;
		a = 5;
		System.out.println(b);
		
		// 복사로 하면 copy, clone으로 나뉜다고 볼 수 있는데,
		// 같은 주소로 복사하면 copy고, new로 새로 만들면 clone이다
		
		int[] arr3 = arr;
		int[] arr4 = arr3;
		
		// arr, arr3, arr4는 같은 주소를 가짐
		
		System.out.println(arr2);
		arr2 = null; // 이렇게 arr2만이 바라보고 있는 주소를 끊게 되면 해당 주소에 있는 값은 쓰레기가 된다. (garbage)
		// 그래서 JVM이 이를 가비지 콜렉터 (Garbage Collector)를 이용해서 메모리 정리를 하게 된다.
		System.out.println(arr2);
		
		System.out.println(arr3);
		arr3 = null;
		
		System.out.println(arr3);
		arr = null;
		
		
	}
}







