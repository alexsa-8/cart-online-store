package com.skypro.cartonlinestore.controller;

import com.skypro.cartonlinestore.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("id") List<Integer> ids) {
        this.productService.addToCart(ids);
        return "Приняты идентификаторы - " + ids;
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return this.productService.getCartContent();
    }
}
