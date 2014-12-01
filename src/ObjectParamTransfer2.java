
public class ObjectParamTransfer2 {
   Person p1;
   Person p2;
   
   public static void main(String[] args) {
	ObjectParamTransfer2 opt2 = new ObjectParamTransfer2();
	opt2.p1 = new Person();
	opt2.p1.name = "张三";
	opt2.p2 = new Person();
	opt2.p2.name = "李四";
	System.out.println("交换前p1.name="+opt2.p1.name);
	System.out.println("交换前p2.name="+opt2.p2.name);
	opt2.swapObject(opt2.p1, opt2.p2);
	System.out.println("交换后p1.name="+opt2.p1.name);
	System.out.println("交换后p2.name="+opt2.p2.name);
}
   private void swapObject(Person p_1,Person p_2){
	   Person temp;
	   temp = p_1;
	   p_1 = p_2;
	   p_2 = temp;
   }
   
}
