package main;

public class quiz6 {

	public static void main(String[] args) {
		Pen 볼펜 = new 볼펜(2, "100%");
		Pen 만년필 = new 만년필(3, "80%");
		
	}

}

class Pen {
	int 펜의굵기;
	String 남은양;

	public Pen(int 펜의굵기, String 남은양) {
		super();
		this.펜의굵기 = 펜의굵기;
		this.남은양 = 남은양;
	}

}

class 볼펜 extends Pen {

	public 볼펜(int 펜의굵기, String 남은양) {
		super(펜의굵기, 남은양);
	}

}

class 만년필 extends Pen {
	String 브랜드;

	public 만년필(int 펜의굵기, String 남은양) {
		super(펜의굵기, 남은양);

	}

}
