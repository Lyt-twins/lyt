package Day05.Ex06_접근지정자.B;

import Day05.Ex06_접근지정자.A.Person;

public class Student extends Person {

	public Student() { // 기본 생성자
		super();
	}

	public Student(String name, int age, int height, int weight) { //매개변수 생성자
		super(name, age, height, weight);
	}
	
	// 메소드
	
	public void defaultSetting() {
		name = "이름없음";          // public,    모든 곳에서 접근 가능
		age = 20;                // protected,  다른패키지이지만 person 상속받아서 접근 가능
	 //	height = 170;            // default,    같은 패키지가 아니라서 접근 불가
 	//	weight = 60;              // private    해당 클래스에서만 접근 가능
		setHeight(170);   //setter메소드로 값 초기화
		setWeight(60);	
	}
	

}
