package com.nbsp.Dao;

import com.nbsp.domian.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {

    // 查询所有用户信息
    @Select("select * from product")
    List<Product> FindProducts();

    // 增加产品
    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void InsertProduct(Product product);

    // 根据id查询产品
    @Select("select * from product where id=#{id}")
    Product FindByid(String id);
}