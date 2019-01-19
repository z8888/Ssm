package com.nbsp.Service.Impl;

import com.github.pagehelper.PageHelper;
import com.nbsp.Dao.IProductDao;
import com.nbsp.Service.ProductService;
import com.nbsp.domian.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Transactional
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private IProductDao iProductDao;

    @Override
    public List<Product> FindProducts() {
        PageHelper.startPage(1,5);
        return iProductDao.FindProducts();
    }

    @Override
    public void InsertProduct(Product product) {
        iProductDao.InsertProduct(product);
    }
}
