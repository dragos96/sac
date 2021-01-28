package ro.sac.laptops.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ro.sac.laptops.model.Laptop;

@Repository
public interface DaoLaptop extends CrudRepository<Laptop,Integer> {

	
	// content filtering methods
	public List<Laptop> findByCompanyContaining(String company);
	public List<Laptop> findByCompanyAndPriceBetween(String company, float startPrice, float endPrice);
	public List<Laptop> findByCompanyAndCpuAndRamAndOsAndPriceBetween(String company, String cpu, int ram, String os, float  startPrice, float endPrice);
	public List<Laptop> findByCpuAndRamAndOsAndPriceBetween(String cpu, int ram, String os, float  startPrice, float endPrice);
	public List<Laptop> findByCpuBenchmark(Integer cpuBenchmark);
	public List<Laptop> findByCpuBenchmarkBetween(int startBenchmarkValue, int endBenchmarkValue);
	public List<Laptop> findByCpuBenchmarkBetweenAndCompanyContaining(int startBenchmarkValue, int endBenchmarkValue, String company);
	public List<Laptop> findByCpuBenchmarkBetweenAndGpuBenchmarkBetweenAndCompanyContaining(int startCpu, int endCpu, int startGpu, int endGpu, String company);
	public List<Laptop> findByCpuBenchmarkBetweenAndGpuBenchmarkBetweenAndResolutionBenchmarkBetweenAndCompanyContaining(int startCpu, int endCpu, int startGpu, int endGpu, int startResolution, int endResolution, String company);
	public List<Laptop> findByCpuBenchmarkBetweenAndGpuBenchmarkBetweenAndResolutionBenchmarkBetweenAndPriceBetween(int startCpu, int endCpu, int startGpu, int endGpu, int startResolution, int endResolution, float startPrice, float endPrice);
}
