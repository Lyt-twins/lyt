package Day06.Ex01_추상클래스;

// 추상 클래스 : 대상으로부터 공통된 특징을 뽑아내는 것
public abstract class Shape {

	Point point; // 클래스를 변수로 지정
	
	// 넓이와 둘레를 구하는 추상 메소드를 정의하시오.
	// * 추상 메소드 : abstract 접근지정자 반환타입 메소드명( 매개변수 );
	abstract double area();           //넓이      (중괄호 생략 가능)
	abstract double round();          // 둘레
	// getter, setter 메소드를 정의하시오.
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	
}
