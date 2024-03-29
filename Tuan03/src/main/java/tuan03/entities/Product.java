package tuan03.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "Product")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	@Column(nullable = false, unique = true, length = 150)
	private String productName;
	@Column(nullable = false, unique = true, length = 150)
	private String description;
	@ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
    private Manufacturer manufactuer;
	
	
	
	public Product(String productName, String description, Manufacturer manufactuer) {
		super();
		this.productName = productName;
		this.description = description;
		this.manufactuer = manufactuer;
	}

	public Manufacturer getManufactuer() {
		return manufactuer;
	}

	public void setManufactuer(Manufacturer manufactuer) {
		this.manufactuer = manufactuer;
	}



	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long l) {
		this.productId = l;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public int hashCode() {
		return Objects.hash(productId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return productId == other.productId;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", description=" + description
				+ "]";
	}

}
