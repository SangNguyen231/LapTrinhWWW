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

@WebServlet(urlPatterns = "/manufacture")
public class ManufactureController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		ManufacturerService manufacturerService = new ManufacturerService();
		HttpSession session = request.getSession(true);

		switch (action) {
		case "list-manufactures":
			List<Manufacturer> list = manufacturerService.findAll();
			session.setAttribute("manufacture", list);
			response.sendRedirect("list-manufacture.jsp");
			break;
		case "add-new-manufacture":
			response.sendRedirect("add-manufacture-form.jsp");
			break;
		case "add-manufacture":
			String contactemail = request.getParameter("contactemail");
			String contactname = request.getParameter("contactname");
			String contactphone = request.getParameter("contactphone");
			String name = request.getParameter("name");
			String website = request.getParameter("website");
			Manufacturer manufacturer = new Manufacturer();
			Manufacturer manufacture = new Manufacturer(name, contactname, contactemail, contactphone, website);
			manufacturerService.save(manufacture);
			response.sendRedirect("manufacture?action=list-manufactures");
			break;
		case "update-manufacture-form":
			String manufactureId = request.getParameter("id");
			Manufacturer selManufacturer = manufacturerService.findById(new Manufacturer(),
					Long.parseLong(manufactureId));
			session.setAttribute("selManufacture", selManufacturer);
			response.sendRedirect("update-manufacture-form.jsp");
			break;
		case "update-manufacture":
			manufactureId = request.getParameter("manufactureid");
			contactemail = request.getParameter("contactemail");
			contactname = request.getParameter("contactname");
			contactphone = request.getParameter("contactphone");
			name = request.getParameter("name");
			website = request.getParameter("website");
			Manufacturer manufacturer2 = new Manufacturer(name, contactname, contactemail, contactphone, website);
			manufacturer2.setManId(Long.parseLong(manufactureId));
			manufacturerService.updateManufacturer(manufacturer2);
			response.sendRedirect("manufacture?action=list-manufactures");
			break;
		case "delete-manufacture":
			String manufactureid = request.getParameter("id");
			Manufacturer delManufacturer = new Manufacturer();
			delManufacturer.setManId(Long.parseLong(manufactureid));
			manufacturerService.deleteManufacturer(delManufacturer, Long.parseLong(manufactureid));
			response.sendRedirect("manufacture?action=list-manufactures");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + action);
		}
	}
}
