package net.yasite.api.params;

public class ProductParam extends BaseHttpParam {
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public ProductParam() {
		super();
	}
	
}
