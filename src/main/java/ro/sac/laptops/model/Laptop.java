package ro.sac.laptops.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptops")
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String company;
	private String product;
	private String typename;
	private Double inches;

	@Column(name = "screen_resolution")
	private String screenResolution;
	private String ram;
	private String memory;
	private String gpu;
	private String opsys;
	private String weight;
	private Double price;
	
	
	public Laptop() {
	}

	

	public Laptop(Integer id, String company, String product, String typename, Double inches, String screenResolution,
			String ram, String memory, String gpu, String opsys, String weight, Double price) {
		this.id = id;
		this.company = company;
		this.product = product;
		this.typename = typename;
		this.inches = inches;
		this.screenResolution = screenResolution;
		this.ram = ram;
		this.memory = memory;
		this.gpu = gpu;
		this.opsys = opsys;
		this.weight = weight;
		this.price = price;
	}
	
	



	public Laptop(String company, String product, String typename, Double inches, String screenResolution, String ram,
			String memory, String gpu, String opsys, String weight, Double price) {
		this.company = company;
		this.product = product;
		this.typename = typename;
		this.inches = inches;
		this.screenResolution = screenResolution;
		this.ram = ram;
		this.memory = memory;
		this.gpu = gpu;
		this.opsys = opsys;
		this.weight = weight;
		this.price = price;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getOpsys() {
		return opsys;
	}

	public void setOpsys(String opsys) {
		this.opsys = opsys;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	


	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public String getProduct() {
		return product;
	}



	public void setProduct(String product) {
		this.product = product;
	}



	public String getTypename() {
		return typename;
	}



	public void setTypename(String typename) {
		this.typename = typename;
	}



	public Double getInches() {
		return inches;
	}



	public void setInches(Double inches) {
		this.inches = inches;
	}



	public String getScreenResolution() {
		return screenResolution;
	}



	public void setScreenResolution(String screenResolution) {
		this.screenResolution = screenResolution;
	}



	@Override
	public String toString() {
		return "Laptop [id=" + id + ", company=" + company + ", product=" + product + ", typename=" + typename
				+ ", inches=" + inches + ", screenResolution=" + screenResolution + ", ram=" + ram + ", memory="
				+ memory + ", gpu=" + gpu + ", opsys=" + opsys + ", weight=" + weight + ", price=" + price + "]";
	}

	
	
}
