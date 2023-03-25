package tuan03.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "Manufacturer")
public class Manufacturer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long manId;
	@Column(nullable = false, unique = true, length = 150)
	private String manName;
	@Column(nullable = false, unique = true, length = 150)
	private String manContactName;
	@Column(nullable = false, unique = true, length = 150)
	private String manContactEmail;
	@Column(nullable = false, unique = true, length = 150)
	private String manContactPhone;
	@Column(nullable = false, unique = true, length = 150)
	private String manWebsite;
	
	@OneToMany(mappedBy="manufactuer")
	private List<Product> products;

	public Manufacturer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manufacturer(String manName, String manContactName, String manContactEmail,
			String manContactPhone, String manWebsite) {
		super();
		this.manName = manName;
		this.manContactName = manContactName;
		this.manContactEmail = manContactEmail;
		this.manContactPhone = manContactPhone;
		this.manWebsite = manWebsite;
	}

	public long getManId() {
		return manId;
	}

	public void setManId(long manId) {
		this.manId = manId;
	}

	public String getManName() {
		return manName;
	}

	public void setManName(String manName) {
		this.manName = manName;
	}

	public String getManContactName() {
		return manContactName;
	}

	public void setManContactName(String manContactName) {
		this.manContactName = manContactName;
	}

	public String getManContactEmail() {
		return manContactEmail;
	}

	public void setManContactEmail(String manContactEmail) {
		this.manContactEmail = manContactEmail;
	}

	public String getManContactPhone() {
		return manContactPhone;
	}

	public void setManContactPhone(String manContactPhone) {
		this.manContactPhone = manContactPhone;
	}

	public String getManWebsite() {
		return manWebsite;
	}

	public void setManWebsite(String manWebsite) {
		this.manWebsite = manWebsite;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public int hashCode() {
		return Objects.hash(manId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manufacturer other = (Manufacturer) obj;
		return manId == other.manId;
	}

	@Override
	public String toString() {
		return "Manufacturer [manId=" + manId + ", manName=" + manName + ", manContactName=" + manContactName
				+ ", manContactEmail=" + manContactEmail + ", manContactPhone=" + manContactPhone + ", manWebsite="
				+ manWebsite + ", products=" + products + "]";
	}

}
