package ro.sac.laptops.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.sac.laptops.dao.DaoLaptop;
import ro.sac.laptops.model.Laptop;

@Service
public class ContentService {

	@Autowired
	private DaoLaptop dao;
	
	public List<Laptop> getRecommendations(Laptop laptop, Integer benchmarkRangeCpu, Integer benchmarkRangeGpu, Integer benchmarkRangeResolution){
		// List<Laptop> laptops = dao.findByCompanyContaining(laptop.getCompany());
		List<Laptop> intervalBenchmark = getLaptops(laptop, benchmarkRangeCpu, benchmarkRangeGpu, benchmarkRangeResolution); 
		return intervalBenchmark;
	}
	
	private List<Laptop> getLaptops(Laptop laptop, Integer benchmarkRangeCpu, Integer benchmarkRangeGpu, Integer benchmarkRangeResolution){
		List<Laptop> laptops = dao.findByCpuBenchmarkBetweenAndGpuBenchmarkBetweenAndResolutionBenchmarkBetweenAndCompanyContaining(laptop.getCpuBenchmark() - benchmarkRangeCpu, laptop.getCpuBenchmark() + benchmarkRangeCpu, laptop.getGpuBenchmark() - benchmarkRangeGpu, laptop.getGpuBenchmark() + benchmarkRangeGpu, laptop.getResolutionBenchmark() - benchmarkRangeResolution, laptop.getResolutionBenchmark() + benchmarkRangeResolution, laptop.getCompany());
		return laptops;
	}
	
	/*private List<Laptop> getLaptops2(Laptop laptop, Integer benchmarkRangeCpu, Integer benchmarkRangeGpu, Integer benchmarkRangeResolution, Float priceRange){
		List<Laptop> laptops = dao.findByCpuBenchmarkBetweenAndGpuBenchmarkBetweenAndResolutionBenchmarkBetweenAndPriceBetween(laptop.getCpuBenchmark() - benchmarkRangeCpu, laptop.getCpuBenchmark() + benchmarkRangeCpu, laptop.getGpuBenchmark() - benchmarkRangeGpu, laptop.getGpuBenchmark() + benchmarkRangeGpu, laptop.getResolutionBenchmark() - benchmarkRangeResolution, laptop.getResolutionBenchmark() + benchmarkRangeResolution, laptop.getPrice() - priceRange, laptop.getPrice() + priceRange);
		return laptops;
	}*/
	
	public List<Laptop> getRecommendations2(Laptop laptop, float priceRange){
		List<Laptop> laptops = dao.findByCompanyAndCpuAndRamAndOsAndPriceBetween(laptop.getCompany(),laptop.getCpu(),laptop.getRam(), laptop.getOs(), laptop.getPrice() - priceRange, laptop.getPrice() + priceRange);
		return laptops;
	}
	
	public List<Laptop> getRecommendations3(Laptop laptop, Integer benchmarkRangeCpu, Integer benchmarkRangeGpu, Integer benchmarkRangeResolution, Float priceRange){
		//List<Laptop> sameBenchmark = getLaptops2(laptop, benchmarkRangeCpu, benchmarkRangeGpu, benchmarkRangeResolution, priceRange); 
		//return sameBenchmark;
		List<Laptop> laptops = dao.findByCpuBenchmarkBetweenAndGpuBenchmarkBetweenAndResolutionBenchmarkBetweenAndPriceBetween(laptop.getCpuBenchmark() - benchmarkRangeCpu, laptop.getCpuBenchmark() + benchmarkRangeCpu, laptop.getGpuBenchmark() - benchmarkRangeGpu, laptop.getGpuBenchmark() + benchmarkRangeGpu, laptop.getResolutionBenchmark() - benchmarkRangeResolution, laptop.getResolutionBenchmark() + benchmarkRangeResolution, laptop.getPrice() - priceRange, laptop.getPrice() + priceRange);
		return laptops;
	}
	
	public List<Laptop> getRecommendations4(Laptop laptop, Float priceRange){
		List<Laptop> laptops = dao.findByCompanyAndPriceBetween(laptop.getCompany(), laptop.getPrice() - priceRange, laptop.getPrice() + priceRange);
		return laptops;
	}
	
	public List<Laptop> getRecommendations5(Laptop laptop, float priceRange){
		List<Laptop> laptops = dao.findByCpuAndRamAndOsAndPriceBetween(laptop.getCpu(),laptop.getRam(), laptop.getOs(), laptop.getPrice() - priceRange, laptop.getPrice() + priceRange);
		return laptops;
	}
	
}
