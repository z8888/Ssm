package com.nbsp.controller;

import com.github.pagehelper.PageInfo;
import com.nbsp.Service.IOrderService;
import com.nbsp.domian.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("order")
public class OrdersController {

    @Autowired
    private IOrderService orderService;
    // 为分页查询所有订单
    /*@RequestMapping("findallorder")
    public ModelAndView FindAllOrders(){
        ModelAndView mv=new ModelAndView();
        List<Orders> orders = orderService.FindOrders();
        mv.addObject("ordersList",orders);
        mv.setViewName("orders-list");
        return mv;
    }*/

    @RequestMapping("findallorder")
    public ModelAndView FindAllOrders(@RequestParam(name = "page",required = true,defaultValue = "1") Integer page , @RequestParam(name = "size",required = true,defaultValue = "5") Integer size){
        ModelAndView mv=new ModelAndView();
        List<Orders> orders = orderService.FindOrders(page,size);
        PageInfo pageInfo=new PageInfo(orders);
        mv.addObject("ordersList",pageInfo);
        mv.setViewName("orders-list");
        return mv;
    }
}
