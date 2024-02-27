package day02_06;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//아이디
//비번
//가입일
//이름

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Member2 {
	private String username;
	@Setter
	private String password;
	private LocalDateTime day;
	private String name;
	private String email;
}
