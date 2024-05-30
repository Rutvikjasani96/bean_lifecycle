package com.bean_lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private int price;

//    Getters
    public int getPrice() {
        return price;
    }

//    Setters
    public void setPrice(int price) {
        this.price = price;
    }

//    Constructor
    public Pepsi() {
    }

//    toString
    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Pepsi init Called...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Pepsi Destroy Called...");
    }
}
