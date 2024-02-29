package day04_03;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
class 제품{
	private String name;
	private int price;
	
	@Override
	public boolean equals(Object obj) {
		//핸드폰 ob = new 갤럭시();
		//참조변수 ob가 가리키는 대상이 갤럭시인지 확인하는 연산자
		//ob instanceof 갤럭시
		
		//어떤경우에 두 객체가 같은거니?...프로그래머가 아니라 업무규정이 정함
		//제품과 제품이 아닌것을 비교하면 무조건 false
		if(obj instanceof 제품 == false) {
			return false;
		}
		
		//제품인걸 확인했으니 형변환을 진행
		제품 target = (제품)obj;
		return this.name.equals(target.getName()) &&
				this.price==target.getPrice();
	}
}

public class ObjectTest3 {
	public static void main(String[] args) {
		제품 p1 = new 제품("신라면", 1500);
		제품 p2 = new 제품("컵누들", 1500);
		제품 p3 = new 제품("신라면", 1500);
		// ==로 비교시 해쉬코드를 비교
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		//Object의 equals는 hash코드를 비교한다.
		//따라서 오버라이드필요
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p2));
	

	}
}
