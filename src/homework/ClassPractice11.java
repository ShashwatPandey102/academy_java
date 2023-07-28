package homework;

import java.util.stream.IntStream;

public class ClassPractice11 {
	public static void main(String[] args) {
		int[] arr = {9, 5, 24, 13, 3, 21};
		
		Math m = new Math();
		int max = m.max(arr);
		int min = m.min(arr);
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
}

class Math{
	int max(int[] arr){
		return IntStream.of(arr).max().getAsInt();
	}

	int min(int[] arr){
		return IntStream.of(arr).min().getAsInt();
	}
	
}