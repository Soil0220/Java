package day01_01;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//할일 객체 : 번호 할일작성일 완료여부
//js의 경우 : {tno:1, title:"자바공부", finish:true}
//자바의 경우에는 설계도인 클래스를 만든다음에 객체를 생성


//1.public
//2.private
//private : 허락된 사용자만 값을 읽고 쓸 수 있다.
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Todo {
	private Long tno;
	private String title;
	private LocalDate writeday;
	private Boolean finish;
	
	//인자가 다르면 메소드의 이름이 같아도 된다. : method overload
	public Todo(Long tno, String title, LocalDate writeday, Boolean finish) {
		this.tno = tno;
		this.title = title;
		this.writeday = writeday;
		this.finish = finish;
	}
}