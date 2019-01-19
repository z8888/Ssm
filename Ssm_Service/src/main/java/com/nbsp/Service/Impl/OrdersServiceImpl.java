package com.nbsp.Service.Impl;

import com.github.pagehelper.PageHelper;
import com.nbsp.Dao.IOrdersDao;
import com.nbsp.Service.IOrderService;
import com.nbsp.domian.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements IOrderService {

    @Autowired
    private IOrdersDao iOrdersDao;

    @Override
    public List<Orders> FindOrders(Integer page,Integer size) {
        PageHelper.startPage(page,size);
        return iOrdersDao.FindOrders();
    }
}
