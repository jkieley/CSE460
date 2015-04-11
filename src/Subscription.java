import java.util.Collection;

public class Subscription {

	private String productType;

	private Collection<Consumer> consumers;

	/**
	 *  
	 */
	public Subscription(String productType) {
		// @Begin
		this.productType = productType;
		// @End
	}

	public void setProductType(String productType) {
		// @Begin
		this.productType = productType;
		// @End
	}

	public String getProductType() {
		// @Begin
		return productType;
		// @End
		// return null;
	}

	public Collection<Consumer> getConsumers() {
		// @Begin
		return consumers;
		// @End
		// return null;
	}

	public void addConsumer(Consumer consumer) {
		// @Begin
		consumers.add(consumer);
		// @End
	}

	public void removeConsumer(Consumer consumer) {
		// @Begin
		consumers.remove(consumer);
		// @End
	}

}
