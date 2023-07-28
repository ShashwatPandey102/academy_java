package _230728;

import java.lang.reflect.Method;

// 이 코드는 자바에서 어노테이션(Annotation)과 리플렉션(Reflection)을 함께 사용하는 예제이다
// 실행 시점에 UserClass의 메서드들의 어노테이션 정보를 확인하고 실행하는 예제를 보여준다.
public class AnnotationEx {
	
	public static void main(String[] args) throws Exception { // 예외 처리
		
		Method method[] = UserClass.class.getDeclaredMethods(); // UserClass의 모든 선언된 메서드를 얻어온다.
		// Method 클래스에 대해 : 
		
		Class c = UserClass.class;
		
		// 반복문을 통해 각 메서드에 대한 정보를 확인한다.
		for (int i = 0; i < method.length; i++) {
			String methodName = method[i].getName(); // Method.getName() 메서드로 메서드의 이름 가져온다.
			
			UserAnnot annot = method[i].getAnnotation(UserAnnot.class); // 해당 메서드에 적용된 UserAnnot 어노테이션의 정보를 가져온다.
			
			System.out.println(methodName + "의 어노테이션 정보");
			System.out.print("value : " + annot.value() + ", ");
			System.out.print("number : " + annot.number() + " ");
			System.out.println();
			
			// 원래 메서드를 호출하려면 해당 클래스를 인스턴스화해서 메서드를 호출해야 한다.
			// 근데 아래의 코드는 해당 클래스를 통한 것이 아닌, 해당 메서드의 클래스의 설계도를 통해 간접 호출하는 것이다.
			
			method[i].invoke(new UserClass(), null); // Method.invoke() 메서드를 통해 해당 메서드를 실행함.
		}
	}
}
