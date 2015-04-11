import java.util.Collection;

public class Vender implements Publisher {

	private String name;

	private Collection<Product> products;

	/**
	 *  
	 */
	public Vender(String name) {
		// @Begin
		this.name = name;
		// @End
	}

	public void addProduct(Product product) {
		// @Begin
		products.add(product);
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

	public void setProducts(Collection<Product> products) {
		// @Begin
		this.products = products;
		// @End
	}

	public Collection<Product> getProducts() {
		// @Begin
		return products;
		// @End
		// return null;
	}

	public void publish(Broker broker, Product product) {
		// @Begin
		broker.proccessEvent(new PublishEvent(product, this));
		// @End
	}

}
