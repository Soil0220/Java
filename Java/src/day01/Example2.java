package day01;

public class Example2 {
	public static void main(String[] args) {
		//a는 10이라는 값만 저장
		int a = 10;
		
		//b는 값외에 에러 메소드를 가진 객체
		Integer b = new Integer(10);
		
		System.out.println(a);
		System.out.println(b.MAX_VALUE);
		
		//웹에서 사용자가 값을 입력하지 않으면 서버는 NULL을 가지게 된다.
		//나이를 입력받는다면
		//int x = null;
		//에러메세지가 뜬다.
		Integer y = null;
		//자바에서 null의 정의는 참조변수가 아직 가리키는 객체가  없다는 뜻
		//따라서 참조로써  받아들이기 위해 Integer를 쓴다.
	}
}
