package org.springframework.samples.petclinic.product;

import java.util.List;

public class ProductService {

    ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return null;
    }

    public List<Product> getProductsCheaperThan(double price) {
        return null;
    }

    public ProductType getProductType(String typeName) {
        return null;
    }

    public Product save(Product p){
        return null;       
    }

    public List<ProductType> findAllProductTypes(){
        return productRepository.findAllProductTypes();
    }
    
}
