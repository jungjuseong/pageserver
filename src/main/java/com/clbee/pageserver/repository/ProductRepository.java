package com.clbee.pageserver.repository;

import com.clbee.pageserver.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}