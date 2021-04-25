package com.bezkoder.spring.jwt.mongodb;

import com.bezkoder.spring.jwt.mongodb.models.Brand;
import com.bezkoder.spring.jwt.mongodb.models.Category;
import com.bezkoder.spring.jwt.mongodb.models.ERole;
import com.bezkoder.spring.jwt.mongodb.models.Role;
import com.bezkoder.spring.jwt.mongodb.repository.BrandRepository;
import com.bezkoder.spring.jwt.mongodb.repository.CategoryRepository;
import com.bezkoder.spring.jwt.mongodb.repository.ProductRepository;
import com.bezkoder.spring.jwt.mongodb.repository.RoleRepository;
import com.bezkoder.spring.jwt.mongodb.service.BrandService;
import com.bezkoder.spring.jwt.mongodb.service.CategoryService;
import com.bezkoder.spring.jwt.mongodb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSecurityJwtMongodbApplication  implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJwtMongodbApplication.class, args);
	}

	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private BrandService brandService;
	@Autowired
	private ProductService productService;

	@Override
	public void run(ApplicationArguments args) throws Exception {



		Role admin = new Role();
		admin.setId("ADMIN");
		admin.setName(ERole.ROLE_ADMIN);
		roleRepository.save(admin);

		Role user = new Role();
		user.setId("USER");
		user.setName(ERole.ROLE_USER);
		roleRepository.save(user);

		Role moderator = new Role();
		moderator.setId("MODERATOR");
		moderator.setName(ERole.ROLE_MODERATOR);
		roleRepository.save(moderator);

		Category smartphone = new Category();
		smartphone.setId("SMARTPHONE");
		smartphone.setCode("SMARTPHONE");
		smartphone.setName("Smartphone");
		categoryService.save(smartphone);

		Category computer = new Category();
		computer.setId("COMPUTER");
		computer.setCode("COMPUTER");
		computer.setName("Computer");
		categoryService.save(computer);

		Category TV = new Category();
		TV.setId("TV");
		TV.setCode("TV");
		TV.setName("TV");
		categoryService.save(TV);

		Category watch = new Category();
		watch.setId("WATCH");
		watch.setCode("WATCH");
		watch.setName("Watch");
		categoryService.save(watch);

		Brand brand = new Brand();
		brand.setId("SAMSUNG");
		brand.setCode("SAMSUNG");
		brand.setName("Samsung");
		brandService.save(brand);

		Brand apple = new Brand();
		apple.setId("APPLE");
		apple.setCode("APPLE");
		apple.setName("Apple");
		brandService.save(apple);

		Brand HP = new Brand();
		HP.setId("HP");
		HP.setCode("HP");
		HP.setName("HP");
		brandService.save(HP);

		Brand MSI = new Brand();
		MSI.setId("MSI");
		MSI.setCode("MSI");
		MSI.setName("MSI");
		brandService.save(MSI);

		Brand swatch = new Brand();
		swatch.setId("SWATCH");
		swatch.setCode("SWATCH");
		swatch.setName("Swatch");
		brandService.save(swatch);

	}
}
