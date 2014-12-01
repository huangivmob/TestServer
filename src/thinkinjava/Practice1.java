package thinkinjava;

public class Practice1 {
    int intVar;
    char charVar;
    
    {
    	charVar = 'C';
    }
    public static void main(String[] args) {
    	Practice1 p = new Practice1();
		System.out.println("intVar's defalut value is:"+p.intVar);
		System.out.println("charVar's defalut value is:"+p.charVar);
	}
    static void did(String... args){
    	
    }
}
