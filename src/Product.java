public class Product {

	private String productType;

	private String name;

	/**
	 *  
	 */
	public Product(String name, String productType) {
		// @Begin
		this.name = name;
		this.productType = productType;
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
