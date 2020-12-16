package ro.sac.laptops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"ro.sac.laptops.controllers", "ro.sac.laptops.config", "ro.sac.laptops.service"})
@EnableJpaRepositories(basePackages = {"ro.sac.laptops.dao"})
@EntityScan(basePackages={"ro.sac.laptops.model"})
public class LaptopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopsApplication.class, args);
	}

}
