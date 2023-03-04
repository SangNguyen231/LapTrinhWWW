package tuan03.services;

import java.util.List;

import tuan03.entities.Product;
import tuan03.repositories.GeneralRepository;

public class ProductService {
	
	private GeneralRepository<Product, Long> gRepository;
	
	public ProductService() {
		gRepository = new GeneralRepository<>("Product");
	}
	
	public Product save(Product Product) {
        return gRepository.save(Product);
    }

    public List<Product> findAll() {
        return gRepository.findAll();
    }

//    public Product findById(long Productid) {
//        return gRepository.findById(Productid);
//    }

    public Product findById(Product Product, long Productid) {
        return gRepository.findByEntity(Product, Productid);
    }

    public Product updateProduct(Product Product) {
        return gRepository.update(Product);
    }

    public Product deleteProduct(Product Product, long id) {
        return gRepository.delete(Product, id);
    }
	
}
