package day02_05;

import lombok.Builder;

@Builder
class 아이언맨{
	private String  두뇌;
	private String 팔;
	private String  다리;
	private String 날개;
}
public class BuilderTest {
	public static void main(String[] args) {
		아이언맨 man = 아이언맨.builder().날개("만능날개").팔("팔").build();
		//빌더를 사용시
		//1.생성자를 안만들어도 사용자는 원하는 값만 지정해 객체 생성ㅇ ㅣ가능
		//2.객체를 만들 때 필드의 순서가 헷갈리지 않는다.
		
	}
}
