package day02_02;

// 데이터를 저장하는 클래스 : Entity
//	필드 + 게터, 세터 + 생성자...
// 데이터를 처리하는 클래스 : 알아서 만들어야지

public class MyDate2 {
	//년월일 필드 추가
	//1.필드를 결정
	//2.정보은닉,정보은폐
	//3.Getter, Setter
	private Long y;
	private Long m;
	private Long d;
	
	public MyDate2() {
		//기본 생성자 : 인자없는 생성자
	}
	
	public MyDate2(Long year, Long month, Long day) {
		y = year;
		m = month;
		d = day;
	}
	
}
