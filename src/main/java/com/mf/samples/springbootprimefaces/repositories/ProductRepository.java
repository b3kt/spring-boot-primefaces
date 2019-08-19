package com.mf.samples.springbootprimefaces.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mf.samples.springbootprimefaces.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}