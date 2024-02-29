package day04_03;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//toString()을 변경
@Builder
class 상품{
	private String name;
	private int price;
}

public class ObjectTest2 {
	public static void main(String[] args) {
		상품 p = new 상품("노트",200);
		상품 m = new 상품("노트",200);
		System.out.println(p);
	}
}
