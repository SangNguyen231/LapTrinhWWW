package session04.objs;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<CartItem> cart;
	
	public ShoppingCart() {
		cart =new ArrayList<CartItem>();
	}
	
	/**
	 * Thêm 1 món hàng vào giỏ hàng. Nếu trong giỏ hảng đã tồn tại món hàng
	 * thì cập nhật số lượng
	 * @param item là món hàng cần thêm
	 * @return true nếu món hàng đã từng tồn tại trong giỏ hàng
	 * <br/>
	 * Fale nếu ngược lại
	 */
	public boolean add2Cart(CartItem item) {
		if(cart.contains(item)) {
			CartItem selItem = cart.get(cart.indexOf(item));
			selItem.setSoluong(selItem.getSoluong()+1);
			return false;
		}
		else
			cart.add(item);
		return true;
	}
	/**
	 * 
	 * @param item
	 * @return
	 */
	public boolean removeItem(CartItem item) {
		if(cart.contains(item)) {
			cart.remove(item);
		}
		return true;
	}

	public ArrayList<CartItem> getCart() {
		return cart;
	}
	
}
