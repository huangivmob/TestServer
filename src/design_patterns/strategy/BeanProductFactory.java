package design_patterns.strategy;

/**
 * 生产工厂
 * @author Administrator
 *
 */
public class BeanProductFactory {
  
	public static void main(String[] args) {
//		process(new SoyBeanMilkProcess());
//		process(new TofuProcess());
//		process(new DriedBeanCurdProcess());
		//process(new NewTofuProcess());
		process(new ProcessAdpater(new NewTofuProcess()));
	}
	
	public static void process(BeanProductProcess processer){
		processer.doProcess();
	}
}
