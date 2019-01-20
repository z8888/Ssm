package com.nbsp.controller;


import com.nbsp.Service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.nbsp.domian.Product;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
   private ProductService ps;

    @RequestMapping("/findall")
    public ModelAndView FindAllProduct(){
        ModelAndView mv=new ModelAndView();
        List<Product> products = ps.FindProducts();
        mv.addObject("productList",products);
        mv.setViewName("product-list");
        return  mv;
    }

    @RequestMapping("/save")
    public String save(Product product){
        ps.InsertProduct(product);
        return "redirect:findall";
    }
}
