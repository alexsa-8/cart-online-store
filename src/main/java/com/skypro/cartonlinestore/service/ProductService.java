package com.skypro.cartonlinestore.service;

import com.skypro.cartonlinestore.repository.CartRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ProductService {
    private final CartRepository cartRepository;

    public ProductService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public void addToCart(List<Integer> ids){
        this.cartRepository.addToCart(ids);
    }
    public List<Integer> getCartContent(){

        return this.cartRepository.getCartContent();
    }
}
