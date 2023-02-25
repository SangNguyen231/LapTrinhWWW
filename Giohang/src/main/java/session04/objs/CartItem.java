package session04.objs;

import java.util.Objects;

public class CartItem {
	private ProductItem item;
	private int soluong;
	
	public CartItem() {
		soluong = 0;
	}

	public ProductItem getItem() {
		return item;
	}

	public void setItem(ProductItem item) {
		this.item = item;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		if(soluong<=0)
			throw new RuntimeException("Invalid number. Must be negative!");
		this.soluong = soluong;
	}

	@Override
	public int hashCode() {
		return Objects.hash(item);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartItem other = (CartItem) obj;
		return Objects.equals(item, other.item);
	}

	@Override
	public String toString() {
		return "CartItem [item=" + item + ", soluong=" + soluong + "]";
	}
	
	
}
