package com.thinlk.java;

/**
 * 自定义泛型类
 * @author Thinlk
 * @create 2020-07-08 20:42
 **/
public class Order<T> {

    String orderName;
    int orderId;

    //累的内部结构就可以使用累的泛型

    T orderT;

    public Order(){};

    public Order(String orderName, int orderId, T orderT){
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderT = orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }
}
