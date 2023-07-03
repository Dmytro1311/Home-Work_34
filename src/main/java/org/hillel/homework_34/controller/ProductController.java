package org.hillel.homework_34.controller;

import lombok.RequiredArgsConstructor;
import org.hillel.homework_34.dto.ProductDto;
import org.hillel.homework_34.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAllProducts(){
        return ResponseEntity.ok(service.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable("id") int id){
        return ResponseEntity.ok(service.getById(id));
    }
    @PostMapping
    public ResponseEntity<ProductDto> addProducts(@RequestBody ProductDto productDto){
        return ResponseEntity.ok(service.addProduct(productDto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}
