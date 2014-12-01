public class ObjectParamTransfer {
	Person person;
	public static void main(String[] args) {
		ObjectParamTransfer opt = new ObjectParamTransfer();
		opt.person = new Person();
		opt.person.name = "lisi";
		System.out.println("改变前的name为：" + opt.person.name);
		opt.changeObject(opt.person);
		System.out.println("改变后的name为：" + opt.person.name);

	}

	private void changeObject(Person p) {
		System.out.println("equals:"+p.equals(this.person));
		System.out.println("==:"+ (p == this.person));
		p.name = "李四";
	}
}

class Person {
	String name;
	private void test(){};
}
