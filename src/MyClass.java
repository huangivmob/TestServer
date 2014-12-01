import design_patterns.strategy.EnumTest;

class MyClass {
	int x;

	MyClass(int i) {
		x = i;
	}

	public static void main(String args[]) {

		int times = 0;

		int num = 1;
		while (num < 100) {
			if (num % 6 == 0) {
				times++;
			}
			num++;
		}
		System.out.println(times);
	}

}

class ClassA {
}

class ClassB extends ClassA {
}

class ClassC extends ClassA {
}
