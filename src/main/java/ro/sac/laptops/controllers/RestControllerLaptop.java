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

import ro.sac.laptops.dao.DaoLaptop;
import ro.sac.laptops.model.Laptop;
import ro.sac.laptops.service.ContentService;
import ro.sac.laptops.service.WekaService;

@RestController
@RequestMapping("/rest/laptops")
public class RestControllerLaptop {
	
	@Autowired
	private DaoLaptop daoLaptop;
	
	@Autowired 
	private ContentService contentService;
	
	@Autowired
	private WekaService wekaService;
	
	
	@GetMapping("/all")
	public Iterable<Laptop> getAllLaptops() {
		System.out.println("LAPTOPS");
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
			recommendations = this.contentService.getRecommendations(laptop);
			return ResponseEntity.ok(recommendations);
			
		}
		return ResponseEntity.notFound().build();
		
		
	}

}
