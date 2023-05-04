package io.playdata.springboot04.service;

import io.playdata.springboot04.model.Product;
import io.playdata.springboot04.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor // 의존성 주입이 될 클래스를 받아줄 생성자 생성
public class ProductService {
    @Autowired
    private final ProductRepository productRepository;

    // Create
    public void createProduct(Product product) {
        productRepository.save(product); // Repository에는 save! -> create
    }

    // Read
    public Product readProduct(Long id) {
        return productRepository.findById(id).orElse(null); // findById -> read
    }

    // Read All
    public List<Product> readAllProducts() {
        return productRepository.findAll(); // findAll -> readAll
    }

    // Update
    public void updateProduct(Long id, Product product) {
        product.setId(id);
        productRepository.save(product); // save -> update
    }

    // Delete
    public void deleteProduct(Long id) {
        productRepository.deleteById(id); // deleteById -> delete
    }
}
