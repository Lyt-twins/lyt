package Day05.Ex03_메소드;

import java.util.Scanner;

/**
 * 계산기
 * - 피연산자를 2개로 하는 계산기
 * - 기능
 *    1. 덧셈  : 정수 2개를 덧셈
 *    2. 뺄셈  : 정수 인자1 - 인자2 연산을 하는 뺄셈
 *    3. 곱셈  : 실수 2개를 곱셈
 *    4.나눗셈 : 실수 인자1 / 인자2 연산을 하는 나눗셈
 *    5. 나머지 : 정수 인자1 % 인자2 연산을 하는 나눗셈
 *    6. 합계  : 배열로 매개변수를 전달받아, 모든 요소의 합계를 구함
 *    7. 합계  : 배열로 매개변수를 전달받아, 모든 요소의 평균을 구함
 *    
 *    * 메소드명
 *    : plus, minus, multiple, divide, remain, sum, avg
 */


public class Calculator {         
	Scanner sc = new Scanner(System.in);  

	// 덧셈 
//	접근지정자 반환타입 메소드명(매개변수1, 매개변수2)
	public int plus(int a, int b) { // 덧셈 메소드 지정
		int result = a + b;     // 변수 result 지정
		return result;     //출력값 반환
	}
    
	// 뺄셈
	public int minus(int a, int b) {
		int result = a - b;
		return result;
	}	
	// 곱셈
	public double multiple(double a, double b) {	
		double result =  a * b;
		return result;
	}	
		
	// 나눗셈	
	public double divide(double a, double b) {	
		double result = a / b;
		return result;
	}
	
	// 나머지
	public int remain(int a, int b) {
		int result = a % b;
		return result;
	}
	
	// 합계
	public int sum(int[] arr) {
		int sum = 0; // sum 변수 선언 및 초기화
		for (int i = 0; i < arr.length; i++) { // 배열 arr 반복문   
			sum += arr[i];    // arr[i]를 sum과 더해서 sum에 대입
		}
		return sum;
		}
	   
	//평균
	public double avg(int[] arr) {
		int sum = sum(arr); 
	  double avg =(double) sum / arr.length;
		return avg;
	
	}
	
	
	
	
}
