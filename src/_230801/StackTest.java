package _230801;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		// stack
		
		// 자료를 넣는 것 push
		// 자료를 빼는 것 pop
		
		Stack<String> stack = new Stack<>();
		
		// 아래 세 메소드 모두 동일한 작업을 한다
		stack.push("가");
		stack.add("나");
		stack.addElement("다");
		stack.addElement("라");
		
		System.out.println(stack);
		
//		System.out.println(stack.pop()); // "다" 부터 나온다 (LIFO 자료구조이기 때문이다)
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		System.out.println(stack.remove(1)); // 이렇게 중간 요소를 제거하면 스택의 LIFO 원칙에 어긋남
		
		System.out.println(stack);
	}
}
