package day02_05;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*7.디자인 패턴
 * 개발중에 자주 만나는 문제와 그 해결책을 정의해 놓은 것
 * builder : 객체를 생성하는 것의 어려움을 덜어준다.
 * 	class  아이언맨{
 * 		private String 팔;
 * 		private String 다리;
 * 		private String 날개;
 * 		private String 두뇌;
 * }
 * 아이언맨 man = new 아이언맨("만능다리","만능두뇌","만능팔","만능날개");
 * 
 * 
 * 
 * */


//번호, 제목, 작성자, 작성시간

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GuestBook {
	private Long gno;
	@Setter
	private String content;
	private String writer;
	//LocalDate,LocalDateTime
	private LocalDateTime writeTime;
	
	
}
