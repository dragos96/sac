package ro.sac.laptops.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.sac.laptops.config.IConstants;
import ro.sac.laptops.dao.DaoLaptop;
import ro.sac.laptops.model.Laptop;
import ro.sac.laptops.service.ContentService;


@RestController
@RequestMapping("/rest/laptops")
public class RestControllerLaptop {
	
	@Autowired
	private DaoLaptop daoLaptop;
	
	@Autowired 
	private ContentService contentService;
	
	
	
	
	@GetMapping("/all")
	public Iterable<Laptop> getAllLaptops() {
		return daoLaptop.findAll();
	}
	
	@GetMapping("/byid/{id}")
	public ResponseEntity<Laptop> findById(@PathVariable("id") int id){
		Optional<Laptop> laptopOp = daoLaptop.findById(id);
		if(laptopOp.isPresent()){
			Laptop laptop = laptopOp.get();
			return ResponseEntity.ok(laptop);
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/recommendation/{id}")
	public ResponseEntity<List<Laptop>> findRecommendations(@PathVariable("id") int id){
		List<Laptop> recommendations = new ArrayList<>();
		Optional<Laptop> laptopOp = daoLaptop.findById(id);
		if(laptopOp.isPresent()){
			Laptop laptop = laptopOp.get();
			recommendations = this.contentService.getRecommendations(laptop, IConstants.BENCHMARK_CPU_RANGE, IConstants.BENCHMARK_GPU_RANGE, IConstants.BENCHMARK_RESOLUTION_RANGE);
			return ResponseEntity.ok(recommendations);
			
		}
		return ResponseEntity.notFound().build();
		
		
	}
	
	@GetMapping("/recommendation2/{id}")
	public ResponseEntity<List<Laptop>> findRecommendations2(@PathVariable("id") int id){
		List<Laptop> recommendations = new ArrayList<>();
		Optional<Laptop> laptopOp = daoLaptop.findById(id);
		if(laptopOp.isPresent()){
			Laptop laptop = laptopOp.get();
			recommendations = this.contentService.getRecommendations2(laptop, IConstants.PRICE_RANGE);
			return ResponseEntity.ok(recommendations);
			
		}
		return ResponseEntity.notFound().build();
		
		
	}
	
	@GetMapping("/recommendation3/{id}")
	public ResponseEntity<List<Laptop>> findRecommendations3(@PathVariable("id") int id){
		List<Laptop> recommendations = new ArrayList<>();
		Optional<Laptop> laptopOp = daoLaptop.findById(id);
		if(laptopOp.isPresent()){
			Laptop laptop = laptopOp.get();
			recommendations = this.contentService.getRecommendations3(laptop, IConstants.BENCHMARK_CPU_RANGE, IConstants.BENCHMARK_GPU_RANGE, IConstants.BENCHMARK_RESOLUTION_RANGE, IConstants.PRICE_RANGE);
			return ResponseEntity.ok(recommendations);
			
		}
		return ResponseEntity.notFound().build();
		
		
	}
	
	@GetMapping("/recommendation4/{id}")
	public ResponseEntity<List<Laptop>> findRecommendations4(@PathVariable("id") int id){
		List<Laptop> recommendations = new ArrayList<>();
		Optional<Laptop> laptopOp = daoLaptop.findById(id);
		if(laptopOp.isPresent()){
			Laptop laptop = laptopOp.get();
			recommendations = this.contentService.getRecommendations4(laptop, IConstants.PRICE_RANGE);
			return ResponseEntity.ok(recommendations);
			
		}
		return ResponseEntity.notFound().build();
		
		
	}
	
	@GetMapping("/recommendation5/{id}")
	public ResponseEntity<List<Laptop>> findRecommendations5(@PathVariable("id") int id){
		List<Laptop> recommendations = new ArrayList<>();
		Optional<Laptop> laptopOp = daoLaptop.findById(id);
		if(laptopOp.isPresent()){
			Laptop laptop = laptopOp.get();
			recommendations = this.contentService.getRecommendations5(laptop, IConstants.PRICE_RANGE);
			return ResponseEntity.ok(recommendations);
			
		}
		return ResponseEntity.notFound().build();
		
		
	}
	

}
