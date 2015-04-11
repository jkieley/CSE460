public class Consumer implements Subscriber {

	private String name;

	/**
	 *  
	 */
	public Consumer(String name) {
		// @Begin
		this.name = name;
		// @End
	}

	public void setName(String name) {
		// @Begin
		this.name = name;
		// @End
	}

	public String getName() {
		// @Begin
		return name;
		// @End
		// return null;
	}

	public void subscribe(Broker broker, String productType) {
		// @Begin
		broker.proccessEvent(new SubscribeEvent(productType,this));
		// @End
	}

	public void unsubscribe(Broker broker, String productType) {
		// @Begin
		broker.proccessEvent(new UnsubscribeEvent(productType,this));
		// @End
	}

}
