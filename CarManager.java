/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.test1.tx2java;

import java.util.List;

/**
 *
 * @author Nguyen Quoc Trung
 */
public interface CarManager {
    public boolean addCar(Car c);
    public boolean editCar(Car c);
    public boolean delCar(Car c);
    public List<Car> searchCar(String name);
    public List<Car> sortedCar(double price);
}
