package day02_04;

import lombok.Getter;

public class 예금 {
	//인스턴스 초기화 : 필드를 만들면서 바로 값을 준다
	//              모든 기본금리의 값은 같다.
	// 필드의 값으 줄 때
	// -인스턴스 초기화 : 모든 객체의 필드가 같은 값을 가진다.
	// -생성자 초기화 : 객체마다 값이 다르다.
	
	@Getter
	public static Double 기본금리 = 2.0;
	private Double 우대금리;
	private Double 실제금리;
	
	public  예금(Double 우대금리) {
		this.우대금리 = 우대금리;
		this.실제금리 = 예금.기본금리 + this.우대금리;
	}
}
