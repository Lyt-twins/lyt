package Day06.Ex01_추상클래스;

public class Circle extends Shape { // 상속

	double radius;  //  반지름
	
	public Circle() {  // 기본 생성자
		this(0);
	}

	public Circle(double radius) { // 매개변수 생성자
		this.radius = radius;
	}

	// 추상클래스의 추상메소드를 자식 클래스에서 구현을 해야 한다.
	@Override
	double area() { // area 메소드 지정
		// 원의 넓이 = (원주율) x (반지름) x (반지름)
		return Math.PI * Math.pow(radius, 2);  
	}

	@Override
	double round() { // round 메소드 지정
		// 원의 둘레 = 2 x (원주율) x (반지름)
		return 2 * Math.PI * radius;
	}
       //getter, setter 
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
       // toString 
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
     
}
