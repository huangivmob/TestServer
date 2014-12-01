public class SimpleParamTransfer {
	public static void main(String[] args) {
		int data = 50;
		System.out.println("改变前data的值：" + data);
		new SimpleParamTransfer().changeData(data);
		System.out.println("改变后data的值：" + data);
	}

	private void changeData(int data) {
		data = 100;
	}
}
