import java.util.Collection;

public class Subscription {

	private String productType;

	private Collection<Consumer> consumer;

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

}
