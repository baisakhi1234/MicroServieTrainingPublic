package com.example.demo1;

import com.example.demo1.exception.ProductNotFoundException;
import com.example.demo1.model.Product;
import com.example.demo1.service.ProductService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductService productService;
    Logger logger=Logger.getLogger("ProductController");
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
        Product product=null;
        try{
             product =productService.getProductById(id);
        }catch(ProductNotFoundException ex){
             logger.log(Logger.Level.ERROR,ex.getCustomMessage());
             ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(product);
    }
    @DeleteMapping  ("/products/{productId}")
    public ResponseEntity<String> removeProduct(@PathVariable("productId") int id){
        productService.removeProduct(id);
        return ResponseEntity.ok("Product removed successfully with id ="+id);
    }

    @PutMapping ("/products")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
        return ResponseEntity.ok(productService.updateProduct(product));
    }
}
