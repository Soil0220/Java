package day02_03;

import day02_02.MyDate2;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//도시락 : 제품명, 가격, 날짜
//도시락 클래스는 String, Long , MyDate2객체를 사용한다.
//-> 도시락은 String, Long, MyDate2에 의존한다 or dependency가 있다.

//객체와 객체의 관계
//A와 B를 사용한다 -> HAS_A관계, 의존관계
//A가 B를 상속한다. -> IS_A관계

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Dosirak2 {
	 String name;
	 @Setter
	 Long price;
	 MyDate2 productDay;
}

/*7.static
 * 	꼭 필요한 경우에만 객체를 만들자
 * 	new 연산의 비용이 비싸다.
 * 	객체가 많으면 관리부담이 커진다.
 *	홍길동 학생이 있다. 그 학생의 객체는 몇개? 1개
 *
 *	static : 객체를 만들지 않고 사용가능한 필드나 메소드
 *	객체가 아닌 크래스 이름으로 사용한다.
 *	ex)클래스이름.전체체력
 *	꼭 필요한 경우에만 객체를 만들자
 *	new 연산의 비용이 비싸고 객체가 많으면 관리부담이 커진다.
 *
 *-static
 *	객체를 만들지 않고 공유하는 필드나 메소드를 지정
 *	static은 객체없이도 사용이 가능하다(new 하기전에사용이가능하다)
 *	static은 this를 사용불가
 *	엔티티 클래스 : 값을 저장하는 클래스
 *	작업 클래스 : 전부 static
 *	static은 static끼리만 접근 가능하다.
 *
 */