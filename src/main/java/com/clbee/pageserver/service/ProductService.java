package com.clbee.pageserver.service;

import java.util.List;

import com.clbee.pageserver.model.Product;
import com.clbee.pageserver.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> listAllProduct() {
        return repository.findAll();
    }

    public void saveProduct(Product product) {
        repository.save(product);
    }

    public Product getOneProduct(long id) {
        return repository.findById(id).get();
    }

    public void deleteProduct(long id) {
        repository.deleteById(id);
    }
}