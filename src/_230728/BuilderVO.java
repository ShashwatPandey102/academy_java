package _230728;

// 빌더 패턴을 사용한 예제
public class BuilderVO {
	private int i;
	private String s;
	private double d;
	
	// 기본 생성자
	public BuilderVO() {
	}

	public BuilderVO(int i, String s, double d) {
		this.i = i;
		this.s = s;
		this.d = d;
	}

	// getter, setter
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}
	
	// 내부 클래스 Builder를 매개변수로 갖는 BuilderVO 생성자
	public BuilderVO(Builder builder) {
		this.i = builder.i;
		this.s = builder.s;
		this.d = builder.d;
	}
	
	// 빌더 내부 클래스를 static으로 생성할 수 있게 함
	public static Builder builder() {
		return new Builder();
	}
	
	@Override
	public String toString() {
		return "BuilderVO [i=" + i + ", s=" + s + ", d=" + d + "]";
	}

	// 빌더 패턴을 직접 일일이 정의할 경우
	// 어차피 나중에는 @Builder를 어노테이션을 사용하면 내부적으로 이게 만들어진다.
	public static class Builder{
		private int i;
		private String s;
		private double d;
		
		// 내부 클래스 기본 생성자
		public Builder() {
		}

		// 내부 클래스 Builder 생성자
		public Builder(int i, String s, double d) {
			this.i = i;
			this.s = s;
			this.d = d;
		}

		public Builder i(int i) {
			this.i = i;
			return this; // 여기서의 this는 내부 클래스 Builder를 의미함
		}
		
		public Builder s(String s) {
			this.s = s;
			return this;
		}
		
		public Builder d(double d) {
			this.d = d;
			return this;
		}
		
		public BuilderVO build() {
			return new BuilderVO(this);
		}
	}
	
}












