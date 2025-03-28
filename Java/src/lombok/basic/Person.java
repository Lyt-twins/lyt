package lombok.basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 롬복
// : 롬복은 어노테이션을 이용하여 코드를 자동 생성해준다.

// @NoArgsConstructor   : 기본 생성
// @AllArgsConstructor   : 모든 매개변수 생성자
// @RequriedArgsConstructor : 필수 생성자
// @NonNull               : null 이 들어오지 못하도록 지정
//                         * 필수 생성자의 매개변수로 지정
// @Getter                 : getter 메소드 자동 생성
// @Setter                 : setter 메소드 자동 생성
// @ToString			: toString 메소드 자동 생성
// @Data				 : @Getter, @Setter, @ToString
//                         @RequiredArgsConstructor
// 					       @EqualsHashCode
@Data 
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor
//@ToString

public class Person {
  // null 은 기본타입형은 가질 수 없다.
	@NonNull private String name;
	@NonNull private int age;
	private double height;
	private double weight;
}
