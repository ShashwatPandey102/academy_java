package _230728;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@ToString
//@Getter
//@Setter
@Data
@AllArgsConstructor // 모든 필드 초기화에 대한 생성자를 만들어라
@NoArgsConstructor // 인자가 없는 생성자 (기본 생성자)를 만들어라
@Builder // 빌더 패턴을 위한 클래스 및 메서드를 생성해줌
public class LombokVO {
	private int i;
	private String s;
	private double d;
}

