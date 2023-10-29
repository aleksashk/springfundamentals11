package by.flameksandr.spring.repositories;

import by.flameksandr.spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
