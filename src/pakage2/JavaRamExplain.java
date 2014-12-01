package pakage2;

public class JavaRamExplain {
	public static void main(String[] args) {
		Person.whatCountry();
		Person sam = new Person("sam", 20);
		sam.introduceSelf();
	}

	void explain() {

	}
}

class Person {

	private String name;
	private int age;
	public static String country = "china";

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void introduceSelf() {
		System.out.println("My name's " + name + ",i'm " + age + " years old.");
	}

	public static void whatCountry() {
		System.out.println("This people come from " + country);
	}
}
