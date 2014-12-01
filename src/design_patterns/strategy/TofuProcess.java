package design_patterns.strategy;

/**
 * 豆腐加工
 * @author Administrator
 *
 */
public class TofuProcess implements BeanProductProcess{
	
	@Override
	public
	void doProcess() {
		System.out.println("豆腐机开始工作：将豆子加工成豆腐！");
	}
}
