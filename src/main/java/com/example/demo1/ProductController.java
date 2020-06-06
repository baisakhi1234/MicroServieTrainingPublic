package com.example.demo1;

import com.example.demo1.model.Product;
import com.example.demo1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        super();
        this.productService = productService;
    }
    @GetMapping ("/products")
    public ResponseEntity<List<Product>> getAllProduct(){
        return ResponseEntity.ok(productService.getAllProduct());
    }

    @PostMapping ("/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return ResponseEntity.ok(productService.createProduct(product));
    }
    @GetMapping ("/products/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable("productId") int id){
        return ResponseEntity.ok(productService.getProductById(id));
    }
    @DeleteMapping  ("/products/{productId}")
    public ResponseEntity<String> removeProduct(@PathVariable("productId") int id){
        productService.removeProduct(id);
        return ResponseEntity.ok("Product removed successfully with id ="+id);
    }
}
