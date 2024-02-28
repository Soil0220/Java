package day03_05;


class Usb{}
class 플래시메모리 extends Usb{
}
class 키보드 extends Usb{
}
class 마우스 extends Usb{
}
class 노트북 {
	private Usb usb1;
}


public class 부모를사용하는이유3 {
	public static void main(String[] args) {
		Hospital h = new Hospital();
		h.예방접종(new 고양이());
		h.예방접종(new 강아지());
	}
}
