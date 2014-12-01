package design_patterns.strategy;

/**
 * 豆浆加工
 * 
 * @author Administrator
 * 
 */
public class SoyBeanMilkProcess implements BeanProductProcess {
	
	@Override
	public void doProcess() {
		System.out.println("豆浆机开始工作：将豆子加工成豆浆！");
	}
}
