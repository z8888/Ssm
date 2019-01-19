package com.nbsp.Service;

import com.nbsp.domian.Product;

import java.util.List;

public interface ProductService {

    // 查询所有路线
    List<Product> FindProducts();

    // 添加路线
    void InsertProduct(Product product);
}
