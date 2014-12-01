package design_patterns.strategy;


/**
 * 新的豆腐加工机器
 * 
 * @author Administrator
 * 
 */
public class NewTofuProcess extends NewSystem {
	@Override
	public void doProcess() {
		System.out.println("新的豆腐机开始工作：将豆子加工成豆腐，而且我的工作效率更高了!");
	}
}