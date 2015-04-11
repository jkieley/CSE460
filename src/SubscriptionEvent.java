public abstract class SubscriptionEvent extends Event {

	private String productType;

	private Consumer consumer;

	public SubscriptionEvent(String productType, Consumer consumer) {
		// @Begin
		this.productType = productType;
		this.consumer = consumer;
		// @End
	}

	public void setConsumer(Consumer consumer) {
		// @Begin
		this.consumer = consumer;
		// @End
	}

	public Consumer getConsumer() {
		// @Begin
		return consumer;
		// @End
		// return null;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductType() {
		// @Begin
		return productType;
		// @End
		// return null;
	}

}
