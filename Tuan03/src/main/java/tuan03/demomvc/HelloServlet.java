package tuan03.demomvc;

import java.io.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tuan03.entities.Manufacturer;
import tuan03.entities.Product;
import tuan03.services.ManufacturerService;
import tuan03.services.ProductService;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();

//        Product pd1= new Product();
//        Product pd2= new Product("det","det@gmail.com","123","disable");
//        Product pd3= new Product("men","men@gmail.com","123","disable");
//
//        UserService userService = new UserService();
//        userService.save(pd1);
//        userService.save(pd2);
//        userService.save(pd3);
        
//        Manufacturer manufacturer1 = new Manufacturer("demo1", "demo1", "demo1", "demo1", "demo1", null);
//        Manufacturer manufacturer2 = new Manufacturer("demo2", "demo2", "demo2", "demo2", "demo2", null);
//        Manufacturer manufacturer3 = new Manufacturer("demo3", "demo3", "demo3", "demo3", "demo3", null);
//        Manufacturer manufacturer4 = new Manufacturer("demo4", "demo4", "demo4", "demo4", "demo4", null);
//        
//        ManufacturerService service = new ManufacturerService();;
//        service.save(manufacturer1);
//        service.save(manufacturer2);
//        service.save(manufacturer3);
//        service.save(manufacturer4);

          Product product = new Product("Product", "Demo");
          ProductService productService = new ProductService();
          productService.save(product);
        
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}