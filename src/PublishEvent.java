public class PublishEvent extends Event {

	private Product product;

	private Vender vender;

	public PublishEvent(Product product, Vender vender) {
		// @Begin
		this.product = product;
		this.vender = vender;
		// @End
	}

	public void setVender(Vender vender) {
		// @Begin
		this.vender = vender;
		// @End
	}

	public Vender getVender() {
		// @Begin
		return vender;
		// @End
		// return null;
	}

	public void setProduct(Product product) {
		// @Begin
		this.product = product;
		// @End
	}

	public Product getProduct() {
		// @Begin
		return product;
		// @End
		// return null;
	}

}
