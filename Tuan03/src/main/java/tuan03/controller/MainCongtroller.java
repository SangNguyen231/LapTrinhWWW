package tuan03.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tuan03.entities.Manufacturer;
import tuan03.entities.Product;
import tuan03.services.ManufacturerService;
import tuan03.services.ProductService;


@WebServlet(urlPatterns = "/controller")
public class MainCongtroller extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		ProductService productService = new ProductService();
		ManufacturerService manufacturerService = new ManufacturerService();
		HttpSession session = request.getSession(true);
		
		switch (action) {
		case "list_products": 
			List<Product> lst = productService.findAll();
			session.setAttribute("products", lst);
			response.sendRedirect("list_products.jsp");
			break;
		case "add_new_product":
            response.sendRedirect("add-product-form.jsp");
            break;
		case "add_product":
            String prodcutName = request.getParameter("productname");
            String description = request.getParameter("description");
            String manufactuerid = request.getParameter("manufactuerid");
            Manufacturer manufacturer = new Manufacturer();
            manufacturer = manufacturerService.findById(manufacturer, Long.parseLong(manufactuerid));
            Product product = new Product(prodcutName, description, manufacturer);
            productService.save(product);
            response.sendRedirect("controller?action=list_products");
            break;
		case "update_product_view":
            String productid = request.getParameter("id");
            Product selProduct = productService.findById(new Product(), Long.parseLong(productid));
            session.setAttribute("selProduct",selProduct);
            response.sendRedirect("update_products.jsp");
            break;
		case "update_product":
			productid = request.getParameter("productid");
			prodcutName = request.getParameter("productname");
			description = request.getParameter("description");
			manufactuerid = request.getParameter("manufactuerid");
            manufacturer = new Manufacturer();
            manufacturer = manufacturerService.findById(manufacturer, Long.parseLong(manufactuerid));
			Product product1 = new Product(prodcutName, description, manufacturer);
			product1.setProductId( Long.parseLong(productid));
			productService.updateProduct(product1);
            response.sendRedirect("controller?action=list_products");
            break;
        case "delete_product":
        	productid = request.getParameter("id");
        	Product delProduct = new Product();
        	delProduct.setProductId( Long.parseLong(productid));
        	productService.deleteProduct(delProduct, Long.parseLong(productid));
        	response.sendRedirect("controller?action=list_products");
            break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + action);
		}
	}
}
