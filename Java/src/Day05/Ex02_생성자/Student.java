package Day05.Ex02_생성자;

// 학생
// - 메소드 : 공부하기, 성적 평균 구하기
public class Student {

	// 변수
	String name; //  이름
	int age;  //  나이
	String stdNo; //  학번
	String major; // 전공
	
	// 생성자
	// TODO : 기본생성자
	 public Student() {
		 this("이름없음", 0); 	// this로 객체의 name, age만 값 지정
	//	 name = "이름없음";
	//	 age = 0;
		// stdNo = "00000000"; 
	//	 major = "전공없음";
		}
	
	public Student(String name, int age) {  // 매개변수가 있는 생성자
		this( name, age, "00000000", "전공없음"); 
	//	this.name = name;
	//	this.age = age;
	//	stdNo = "00000000"; 
	//	 major = "전공없음";
	}

	// TODO : 매개변수가 있는 생성자
	 public Student(String name, int age, String stdNo, String major) {
		 this.name = name;
		 this.age = age;
		 this.stdNo = stdNo;
		 this.major = major;
	 }
	// 메소드
	// * 접근지정자 반환타입 메소드명(매개변수) { }
	// - 공부하기
	// * void : 반환타입 없음 (return 생략가능)
	// - void 로 지정해도 return 을 메소드를 종료시키는 용도로 사용할 수 있다.
	 public void study(String subject) {  // study 메소드 지정
		 System.out.println( subject + "(을/를) 공부합니다.");
	 }
	

	
	// -성적 평균 구하기        // getAverage 메소드 정의
	 public double getAverage(int score1, int score2) { // 매개변수 2개
		   double average = 0.0;  //변수 average 값 초기화
          average = (double) (score1 + score2) / 2;	 // average 변수 지정   
		 return average;  // average 값 반환
	 }
	 public double getAverage(int score1, int score2, int score3) { // 매개변수 3개
		   double average = 0.0;
        average = (double) (score1 + score2 + score3) / 3;		   
		 return average;
	 }

	 public double getAverage(int[] scores) { // 매개변수가 배열인 메소드
		   double average = 0.0;
		   int sum = 0;  // 변수  sum 선언 및 초기화
	  //for (int score : scores) {
		//	sum += score;
	//	}
     //  average = (double) (score1 + score2 + score3 ) / 3;		   
		 return average; // average 값 반환
	 }
}
