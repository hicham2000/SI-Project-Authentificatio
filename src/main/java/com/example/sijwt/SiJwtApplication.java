package com.example.sijwt;

import com.example.sijwt.Entities.Product;
import com.example.sijwt.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SiJwtApplication implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {

        SpringApplication.run(SiJwtApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i <= 50; i++) {
            Product product = new Product();
            product.setName("Product " + i);
            product.setPrice(19.99); // Set price as needed

            // Save the product using the repository
            productRepository.save(product);
        }
    }
}
