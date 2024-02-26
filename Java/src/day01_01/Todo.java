package day01_01;

import java.time.LocalDate;

//할일 객체 : 번호 할일작성일 완료여부
//js의 경우 : {tno:1, title:"자바공부", finish:true}
//자바의 경우에는 설계도인 클래스를 만든다음에 객체를 생성


//1.public
//2.private
//private : 허락된 사용자만 값을 읽고 쓸 수 있다.
public class Todo {
	private Integer tno;
	private String title;
	private LocalDate wirteday;
	private Boolean finish;
	
}
