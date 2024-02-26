package day01;

public class Example3 {
	public static void main(String[] args) {
		int nai=35;
		if(nai>=65) {
			System.out.println("무료");
		}else if(nai>=25) {
			System.out.println("대인(3000원)");
		}else {
			//else는 조건을 적지 않는다.(Don't care)
			//else 조건이 쉽게 보일 때 사용
			System.out.println("무료");
		}
		int 교과=70, 매출액=8000, 수금액=7000;
		if(교과>=70) {
			
		}else if (매출액>=10000) {
			
		}else if (수금액>=10000) {
			
		}else {
			//????
			//논리상의 가독성이 너무안좋기에 이렇게 작성하면 안됨
		}
	}
}
