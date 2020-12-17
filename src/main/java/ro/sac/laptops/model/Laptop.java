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

	@Column(name = "brand")
	private String company;
	@Column(name = "model")
	private String product;
	@Column(name = "type")
	private String typename;
	private Float inches;

	@Column(name = "resolution")
	private String screenResolution;
	@Column(name = "resolution_benchmark")
	private Integer resolutionBenchmark;
	private String cpu;
	@Column(name = "cpu_benchmark")
	private Integer cpuBenchmark;
	private Integer ram;
	@Column(name = "memory_capacity")
	private Integer memoryCapacity;
	@Column(name = "memory_type")
	private String memoryType;
	private String gpu;
	@Column(name = "gpu_benchmark")
	private Integer gpuBenchmark;
	private String os;
	private Float weight;
	@Column(name = "price_euro")
	private Float price;
	
	
	public Laptop() {
	}

	

	public Laptop(Integer id, String company, String product, String typename, Float inches, String screenResolution, Integer resolutionBenchmark,
			String cpu, Integer cpuBenchmark, Integer ram, Integer memoryCapacity, String memoryType, String gpu, Integer gpuBenchmark, String os, Float weight, Float price) {
		this.id = id;
		this.company = company;
		this.product = product;
		this.typename = typename;
		this.inches = inches;
		this.screenResolution = screenResolution;
		this.resolutionBenchmark = resolutionBenchmark;
		this.cpu = cpu;
		this.cpuBenchmark = cpuBenchmark;
		this.ram = ram;
		this.memoryCapacity = memoryCapacity;
		this.memoryType = memoryType;
		this.gpu = gpu;
		this.gpuBenchmark = gpuBenchmark;
		this.os = os;
		this.weight = weight;
		this.price = price;
	}
	
	



	public Laptop( String company, String product, String typename, Float inches, String screenResolution, Integer resolutionBenchmark,
			String cpu, Integer cpuBenchmark, Integer ram, Integer memoryCapacity, String memoryType, String gpu, Integer gpuBenchmark, String os, Float weight, Float price) {
		this.company = company;
		this.product = product;
		this.typename = typename;
		this.inches = inches;
		this.screenResolution = screenResolution;
		this.resolutionBenchmark = resolutionBenchmark;
		this.cpu = cpu;
		this.cpuBenchmark = cpuBenchmark;
		this.ram = ram;
		this.memoryCapacity = memoryCapacity;
		this.memoryType = memoryType;
		this.gpu = gpu;
		this.gpuBenchmark = gpuBenchmark;
		this.os = os;
		this.weight = weight;
		this.price = price;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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



	public Float getInches() {
		return inches;
	}



	public void setInches(Float inches) {
		this.inches = inches;
	}



	public String getScreenResolution() {
		return screenResolution;
	}



	public void setScreenResolution(String screenResolution) {
		this.screenResolution = screenResolution;
	}



	public Integer getResolutionBenchmark() {
		return resolutionBenchmark;
	}



	public void setResolutionBenchmark(Integer resolutionBenchmark) {
		this.resolutionBenchmark = resolutionBenchmark;
	}



	public String getCpu() {
		return cpu;
	}



	public void setCpu(String cpu) {
		this.cpu = cpu;
	}



	public Integer getCpuBenchmark() {
		return cpuBenchmark;
	}



	public void setCpuBenchmark(Integer cpuBenchmark) {
		this.cpuBenchmark = cpuBenchmark;
	}



	public Integer getRam() {
		return ram;
	}



	public void setRam(Integer ram) {
		this.ram = ram;
	}



	public Integer getMemoryCapacity() {
		return memoryCapacity;
	}



	public void setMemoryCapacity(Integer memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
	}



	public String getMemoryType() {
		return memoryType;
	}



	public void setMemoryType(String memoryType) {
		this.memoryType = memoryType;
	}



	public String getGpu() {
		return gpu;
	}



	public void setGpu(String gpu) {
		this.gpu = gpu;
	}



	public Integer getGpuBenchmark() {
		return gpuBenchmark;
	}



	public void setGpuBenchmark(Integer gpuBenchmark) {
		this.gpuBenchmark = gpuBenchmark;
	}



	public String getOs() {
		return os;
	}



	public void setOs(String os) {
		this.os = os;
	}



	public Float getWeight() {
		return weight;
	}



	public void setWeight(Float weight) {
		this.weight = weight;
	}



	public Float getPrice() {
		return price;
	}



	public void setPrice(Float price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Laptop [id=" + id + ", company=" + company + ", product=" + product + ", typename=" + typename
				+ ", inches=" + inches + ", screenResolution=" + screenResolution + ", resolutionBenchmark="
				+ resolutionBenchmark + ", cpu=" + cpu + ", cpuBenchmark=" + cpuBenchmark + ", ram=" + ram
				+ ", memoryCapacity=" + memoryCapacity + ", memoryType=" + memoryType + ", gpu=" + gpu
				+ ", gpuBenchmark=" + gpuBenchmark + ", os=" + os + ", weight=" + weight + ", price=" + price + "]";
	}



	
	
}
