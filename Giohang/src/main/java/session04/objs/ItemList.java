package session04.objs;

import java.util.ArrayList;

public class ItemList {
	private ArrayList<ProductItem> lst;//Generic
	
	public ItemList() {
		lst =new ArrayList<ProductItem>();
	}

	public void addProductItem(ProductItem item) {
		lst.add(item);
	}
	
	public ProductItem getProductItem(String id) {
		ProductItem item = new ProductItem(id,"","");
		if(lst.contains(item))
			return lst.get(lst.indexOf(item));
		return null;
	}

	public ArrayList<ProductItem> getAllItems() {
		return lst;
	}
	
	
}
