package day02_01;
/*객체지향 프로그래밍 구성요소
 *객체의 설계도인 클래스를 작성하고 객체를 생성하고 프로그램ㅇ을 구성한다.
 *객체는 소프트웨어 부품 -> 자기일은 자기가 알아서 한다.
 * 자바스크립트는 클래스없이 객체를 바로만드네 -> 객체기반 프로그래밍
 * const todo = {tno:1. title:"java"~~}
 * 
 * 5.객체지향 프로그래밍 구성요소
 * 캡슐화 : 값(필드)과 기능(메소드)를 모아 클래스를 만들어라
 * 정보은닉 :private를 하는등 꼭 필요한 기능만 공개해라
 * 상속
 * 다형성 : 상황에따라 다르게 동작한다. overload
 * 
 * 4.overload
 * 함수 이름은 겹쳐도 된다.
 * 단 인자가 다르다면...
 * 자바는 함수이름으로 함수를 구별x
 * 인자와 함수의 이름으로 함수를 구별
 */


//이름은 중복 불가(식별기능)
//함수의 이름도 중복 불가능
public class CalcWithoutOverload {
	public int sumii(int a, int b) {
		return a+b;
	}
	
	public double sumdi(double a, int b) {
		return a+b;
	}

	public double sumid(int a, double b) {
		return a+b;
	}

	public double sumdd(double a, double b) {
		return a+b;
	}
}
