package com.clbee.pageserver.repository;

import com.clbee.pageserver.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByMadein(String madein);
    public List<Product> findByNameAndMadein(String name, String madein);
}