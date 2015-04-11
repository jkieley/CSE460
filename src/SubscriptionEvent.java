public abstract class SubscriptionEvent extends Event {

	private String productType;

	private Consumer consumer;

	public SubscriptionEvent(String productType, Consumer consumer) {

	}

	public void setConsumer(Consumer consumer) {

	}

	public Consumer getConsumer() {
		return null;
	}

	public void setProductType(String productType) {

	}

	public String getProductType() {
		return null;
	}

}
