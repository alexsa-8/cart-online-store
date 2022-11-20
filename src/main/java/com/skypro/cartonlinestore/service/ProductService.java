package com.skypro.cartonlinestore.service;

import com.skypro.cartonlinestore.model.Product;
import com.skypro.cartonlinestore.record.ProductRequest;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {
    private final Map<Integer, Product> product=new HashMap<>();

    public Collection<Product> getAllProducts() {
        return this.product.values();
    }

    public Product addProduct(ProductRequest productRequest)throws IllegalAccessException{
        if (productRequest.getNameProduct()==null || productRequest.getPrice()==0){
            throw new IllegalAccessException("Введите название и цену.");
        }
        Product product=new Product(productRequest.getNameProduct(),
                productRequest.getPrice());
        this.product.put(product.getId(), product);
        return product;
    }
}
