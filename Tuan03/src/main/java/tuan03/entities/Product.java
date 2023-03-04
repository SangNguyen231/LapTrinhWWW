package tuan03.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	@Column(nullable = false, unique = true, length = 150)
	private String productName;
	@Column(nullable = false, unique = true, length = 150)
	private String description;
	@ManyToOne
	@JoinTable(name = "Manufacturer")
	private Manufacturer manId;

	public Product(int productId, String productName, String description, Manufacturer manId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.manId = manId;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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

	public Manufacturer getManId() {
		return manId;
	}

	public void setManId(Manufacturer manId) {
		this.manId = manId;
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
				+ ", manId=" + manId + "]";
	}

}
