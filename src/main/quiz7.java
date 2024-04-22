package main;

import java.util.ArrayList;

public class quiz7 {

	public static void main(String[] args) {
		
		ArrayList<Animal> list = new ArrayList<>();
		list.add(new Human());
		list.add(new Tiger());
		
		

	}

}
class Animal {
	
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
	}
	
	public void move() {
}
}
class Human extends Animal {

	@Override
	public void sleep() {
		super.sleep();
	}

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
}

class Tiger extends Animal {

	@Override
	public void sleep() {
		super.sleep();
	}

	@Override
	public void move() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}