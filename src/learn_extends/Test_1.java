package learn_extends;

public class Test_1 {

	public static void main(String[] args) {
		new Son();
	}
}

class Son extends Farther {
	int b = 10;

	Son() {
		super();
		System.out.println("son class is initing...b=" + b);
	}

	@Override
	void show() {
		System.out.println("Son's show...b=" + b);
	}
}

class Farther {
	int a = 10;

	Farther() {
		System.out.println("Father class is initing...a=" + a);
		show();
	}

	void show() {
		System.out.println("Father's show!");
	}
}