package com.example.Spring.service;

import com.example.Spring.model.Product;
import com.example.Spring.repositroy.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> listAll()
    {
        return productRepository.findAll();
    }


    public void save(Product product)
    {
        productRepository.save(product);
    }

    public Product get(Integer id)
    {
       return productRepository.findById(id).get();
    }

    public void delete(Integer id)
    {
        productRepository.deleteById(id);
    }


}
