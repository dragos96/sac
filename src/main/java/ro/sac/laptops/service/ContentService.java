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
	
	public List<Laptop> getRecommendations(Laptop laptop){
		List<Laptop> laptops = dao.findByCompanyContaining(laptop.getCompany());
		return laptops;
	}
	
}
