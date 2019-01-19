package com.nbsp.Service;

import com.nbsp.domian.Orders;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IOrderService {
    // 查询所有订单
    List<Orders> FindOrders(Integer page,Integer size);
}
