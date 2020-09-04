package refactoring.after.large_class;

public class Manager extends Person{

	/**
	 * 订单审批同意，只有管理员才可以进行此操作
	 *
	 * @param order
	 */
	public void approve(Order order) {

	    //...
	}

	/**
	 * 订单审批拒绝，只有管理员才可以进行此操作
	 *
	 * @param order
	 */
	public void decline(Order order) {

	    //...
	}

}
