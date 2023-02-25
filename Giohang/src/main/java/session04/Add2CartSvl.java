package session04;


import session04.db.ConnectDB;
import session04.objs.CartItem;
import session04.objs.ItemList;
import session04.objs.ProductItem;
import session04.objs.ShoppingCart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Add2CartSvl
 */

public class Add2CartSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ShoppingCart cart=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add2CartSvl() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id").toString();
		
		//get cart from session
		HttpSession session = request.getSession(true);
		Object obj = session.getAttribute("giohang");
		if(obj ==null) {
			cart = new ShoppingCart();
			session.setAttribute("giohang", cart);
		}else{
			cart =(ShoppingCart)obj;
		}
		//add selected item to cart
		/*
		 * ConnectDB db=new ConnectDB(); ItemList lst = db.getAllProducts();
		 */
		ItemList lstP =(ItemList)session.getAttribute("allProducts");
		ProductItem pItem = lstP.getProductItem(id);
		
		CartItem cartItem =new CartItem();
		cartItem.setItem(pItem);
		cartItem.setSoluong(1);
		boolean kq = cart.add2Cart(cartItem);
		if(kq)
			System.out.println("Add new Item to cart");
		else
			System.out.println("Update quantity");
		
		session.setAttribute("giohang", cart);
		response.sendRedirect("index.jsp");
		
	}

}
