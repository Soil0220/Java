package day02_04;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Sample{
	private  Long jumsu;
	
	//내부에서 주어진  점수로 합격 불합격
	public String 판정1() {
		return jumsu>=70? "합격" : "불합격";
	}
	
	//외부에서 주어진 score로 합격 불합격
	public static String 판정2(Long score) {
		return score>=70? "합격" : "불합격";
	}
}



public class StaticTest2 {
	public static void main(String[] args) {
		
		//객체를 new한다 -> 객체의 정보가 다르다.
		Sample s1 = new Sample(75L);
		Sample s2 = new Sample(65L);
		
		//판정1()메소드를 객체가 가진 필드로 계산 -> 객체마다 결과가 다르다.
		System.out.println(s1.판정1());
		System.out.println(s2.판정1());
		
		//판정()메소드를 외부입력값으로 계산 ->입력이 같으면 결과도 같다.
		System.out.println(Sample.판정2(75L));
		System.out.println(Sample.판정2(75L));
	}
}
