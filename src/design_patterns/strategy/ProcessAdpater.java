package design_patterns.strategy;

/**
 * 适配器
 * @author Administrator
 *
 */
public class ProcessAdpater implements BeanProductProcess {
	private NewSystem processer;

	public ProcessAdpater(NewSystem processer) {
		this.processer = processer;
	}

	@Override
	public void doProcess() {
		this.processer.doProcess();

	}
}
