package net.yasite.api.params;

public class SameCatParams extends BaseHttpParam {
	private String Category;

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public SameCatParams() {
		super();
	}
	
}
