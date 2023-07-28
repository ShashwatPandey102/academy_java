package _230728;

import lombok.AllArgsConstructor;

public class EqualsEx {
	public static void main(String[] args) {
		// 지금 이 소스는 equals 메서드를 오버라이딩해서 써보는 예제이다. (기본적으로 equals 메서드는 문자열을 제외하면 그냥 주소를
		// 비교한다)

		Obj obj1 = new Obj(100);
		Obj obj2 = new Obj(100);

		System.out.println("obj1 객체와 obj2 객체는 " + (obj1.equals(obj2) ? "같음" : "다름"));

		Obj obj3 = obj1;

		System.out.println("obj1 객체와 obj3 객체는 " + (obj1.equals(obj3) ? "같음" : "다름"));

		// obj1과 obj3는 같다고 나올 것이고, obj1과 obj2는 다르다고 나올 것이다.

		ObjOverride objo1 = new ObjOverride(100);
		ObjOverride objo2 = new ObjOverride(100);

		System.out.println("objo1 객체와 objo2 객체는 " + (objo1.equals(objo2) ? "같음" : "다름"));
		// objo1과 objo2는 같다고 나올 것이다 (equals 메서드를 오버라이딩 했기 때문)

	}
}

@AllArgsConstructor
class Obj {
	private int objVar;

//	public Obj(int objVar) {
//		this.objVar = objVar;
//	}
}

@AllArgsConstructor
class ObjOverride {
	private int objVar;

//	public ObjOverride(int objVar) {
//		this.objVar = objVar;
//	}

	// equals() 메서드 오버라이드
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof ObjOverride) ? true : false;
	}
}


