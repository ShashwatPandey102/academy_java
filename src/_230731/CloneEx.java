package _230731;

public class CloneEx {
	public static void main(String[] args) {

		String[] arr = { "홍길동", "이순신", "김유신", "안중근" };
		String[] arr2 = arr.clone(); // 이렇게 하면 주소값이 다르고 값은 완전히 똑같은 객체 생성

		System.out.println(arr == arr2); // 다르다고 나올 것 (주소 비교이므로)

		for (String v : arr2) {
			System.out.println(v);
		}

		String[] arr3 = new String[arr.length];
		System.arraycopy(arr, 0, arr3, 0, arr.length); // 이것도 clone이랑 하는 짓이 같음

		System.out.println(arr == arr3); // 다르다고 나올 것

		for (String v : arr3) {
			System.out.println(v);
		}

	}
}
