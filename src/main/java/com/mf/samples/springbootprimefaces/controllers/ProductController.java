package com.mf.samples.springbootprimefaces.controllers;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mf.samples.springbootprimefaces.entities.Product;
import com.mf.samples.springbootprimefaces.repositories.ProductRepository;

@Scope(value = "session")
@Component(value = "productController")
@ELBeanName(value = "productController")
@Join(path = "/product", to = "/views/product-form.jsf")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    private Product product = new Product();

    public String save() {
        productRepository.save(product);
        product = new Product();
        return "/views/product-list.xhtml?faces-redirect=true";
    }

    public Product getProduct() {
        return product;
    }
}