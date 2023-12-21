/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test1.tx2java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nguyen Quoc Trung
 */
public class Car extends Product implements CarManager {

    private String car_base;
    private int car_size;

    public Car() {
    }

    public Car(String car_base, int car_size, int product_id, String product_name, int product_price, int product_total) {
        super(product_id, product_name, product_price, product_total);
        this.car_base = car_base;
        this.car_size = car_size;
    }

    public String getCar_base() {
        return car_base;
    }

    public void setCar_base(String car_base) {
        this.car_base = car_base;
    }

    public int getCar_size() {
        return car_size;
    }

    public void setCar_size(int car_size) {
        this.car_size = car_size;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() + "car_base :" + car_base + ", car_size :" + car_size + '}';
    }

    // nhap doi tuong 
    public static Car inputCar(Car car) {

        Scanner sc = new Scanner(System.in);
        System.out.print("nhap id xe :");
        car.setProduct_id(Integer.parseInt(sc.nextLine()));
        System.out.print("nhap ten xe :");
        car.setProduct_name(sc.nextLine());
        System.out.print("nhap gia");
        car.setProduct_price(Integer.parseInt(sc.nextLine()));
        System.out.print("nhap so luong");
        car.setProduct_total(Integer.parseInt(sc.nextLine()));
        System.out.print("nhap hang san xuat :");
        car.setCar_base(sc.nextLine());
        System.out.println("nhao size :");
        car.setCar_size(Integer.parseInt(sc.nextLine()));
        return car;

    }

    // add car
    public boolean addCar(Car car) {
        listcar.listc.add(car);
        return true;
    }
    //sua

    public boolean editCar(Car car) {
        if (listcar.listc.contains(car)) {
            inputCar(car);
            return true;
        } else {
            return false;
        }
    }

    public boolean delCar(Car c) {
        if (listcar.listc.contains(c)) {
            listcar.listc.remove(c);

            return true;
        } else {
            return false;
        }
    }

    public List<Car> searchCar(String name) {
        List<Car> list = new ArrayList<>();

        for (int i = 0; i < listcar.listc.size(); i++) {
            if (listcar.listc.get(i).getProduct_name().equalsIgnoreCase(name)) {
                list.add(listcar.listc.get(i));
            }
        }
        return list;
    }

    public List<Car> sortedCar(double price) {

        int i, j;

        boolean swapped = false;

        // lap qua tat ca cac so
        for (i = 0; i < listcar.listc.size() - 1; i++) {
            swapped = false;

            // vong lap thu hai
            for (j = 0; j < listcar.listc.size() - 1 - i; j++) {

                if (price * listcar.listc.get(i).getProduct_price() > listcar.listc.get(i).getProduct_price() * price) {
                    Car car = listcar.listc.get(i);
                    listcar.listc.set(i, listcar.listc.get(j));
                    listcar.listc.set(j, car);

                    swapped = true;

                }
            }

            // neu khong can trao doi nua, tuc la
            // mang da duoc sap xep va thoat khoi vong lap.
            if (!swapped) {
                break;
            }
        }
        List<Car> listCars = listcar.listc;
        return listCars;
    }

}
