package day01_02;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GuestBook {
	private long bno;
	private String content;
	private LocalDate writeday;
	private String nickname;
}
