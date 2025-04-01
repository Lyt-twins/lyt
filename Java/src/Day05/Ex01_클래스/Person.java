package Day05.Ex01_클래스;

// 클래스
// - 변수 : 이름, 나이
// - 메소드 : 밥먹기, 일하기
public class Person {

	  // 변수
	  String name;       // 이름
	  int age;           // 나이
	  
	  // 메소드
	  // 접근지정자 (static) 반환타입 메소드명 ( 매개변수 ) { }
	  // 반환타입 void 는 return 생략 가능
	  public void eat( String menu ) {  // eat 메소드 정의
		  System.out.println(menu + "(을/를) 먹었습니다."); 
	  }
	  
	  // 일하기
	  public int work( String name, int hour ) { // work 메소드 정의
		  int money = 10030;   // money 변수 선언 및 초기화
		  int salary = money * hour; // salary 변수 지정
		System.out.println(name + " 일을 하여 " );
		System.out.println(salary + " 원을 벌었습니다. ");
		return salary;  // salary 값 출력
	  }
	  
	  
	  
}
