package session04.objs;

import java.util.Objects;

public class ProductItem {
	private String itemID;
	private String name;
	private String description;
	public ProductItem() {
	}
	public ProductItem(String itemID, String name, String description) {
		setItemID(itemID);
		setName(name);
		setDescription(description);
	}
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		if(itemID.trim().isBlank())
			throw new RuntimeException("Enter a correct id");
		this.itemID = itemID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//...
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		//....
		this.description = description;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(itemID.toLowerCase());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductItem other = (ProductItem) obj;
		return itemID.equalsIgnoreCase(other.getItemID());
//		return Objects.equals(itemID, other.itemID);
	}
	@Override
	public String toString() {
		return "ProductItem [itemID=" + itemID + ", name=" + name + ", description=" + description + "]";
	}
	
	//........
}
