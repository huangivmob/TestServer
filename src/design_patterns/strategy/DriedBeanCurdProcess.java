package design_patterns.strategy;

/**
 * 豆腐干加工
 * @author Administrator
 *
 */
public class DriedBeanCurdProcess implements BeanProductProcess{

	@Override
	public void doProcess() {
		System.out.println("豆腐干机开始工作：将豆子加工成豆腐干！");
	}
}
