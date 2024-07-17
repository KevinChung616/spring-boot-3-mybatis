package com.jtsp.springboot3mybatis.controller;

import com.jtsp.springboot3mybatis.entity.Product;
import com.jtsp.springboot3mybatis.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductMapper productMapper;

    @Autowired
    public ProductController(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @PostMapping
    public ResponseEntity<Long> createProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productMapper.insertProduct(product));
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAllProduct() {
        return ResponseEntity.ok(productMapper.findAllProductsWithLimit());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findProductById(@PathVariable Long id) {
        return ResponseEntity.ok(productMapper.findProductById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        productMapper.updateProduct(product, id);
        return ResponseEntity.ok("update product success");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProductById(@PathVariable Long id) {
        productMapper.deleteProduct(id);
        return ResponseEntity.ok("delete success");
    }
}
