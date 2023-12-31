package by.flameksandr.spring.controllers;

import by.flameksandr.spring.entities.Product;
import by.flameksandr.spring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/add")
    public void addProduct(@RequestBody Product p) {
        productRepository.save(p);
    }

    @GetMapping("/get/{name}")
    public Product getProduct(@PathVariable String name) {
        return productRepository.findProductByName(name);
    }
}
