package ro.sac.laptops.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ro.sac.laptops.model.Laptop;

@Repository
public interface DaoLaptop extends CrudRepository<Laptop,Integer> {

	
	// content filtering methods
	public List<Laptop> findByCompanyContaining(String company);
}
