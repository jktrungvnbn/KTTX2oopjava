/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test1.tx2java;

/**
 *
 * @author Nguyen Quoc Trung
 */
public class Product {
    private int product_id;
    private String product_name ;
    private int product_price ;
    private int product_total ;

    public Product() {
    }

    public Product(int product_id, String product_name, int product_price, int product_total) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_total = product_total;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public int getProduct_total() {
        return product_total;
    }

    public void setProduct_total(int product_total) {
        this.product_total = product_total;
    }

    @Override
    public String toString() {
        return "id=" + product_id + ",name :" + product_name + ", price :" + product_price + ", total :" + product_total ;
    }
    
    
    
}
