/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test1.tx2java;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Quoc Trung
 */
public class listcar {
    public static ArrayList<Car> listc = new ArrayList<>();

   

    public listcar() {
    }

    public static ArrayList<Car> getListc() {
        return listc;
    }

    public static void setListc(ArrayList<Car> listc) {
        listcar.listc = listc;
    }
   
    
    
    
    // sinh tu dong list
    public static ArrayList<Car> listC(){
        
        String[] nameC = {"VinFast VF e34"," VF 5 Plus","VF 8"," VF 9"
                ,"VinFast Lux SA2.0","VinFast Lux A2.0","VinFast Fadil"
                ," VinFast President"," Ranger","Ranger Raptor","Transit"
                ,"Tesla Model X","BMW 2 Series","BMW 420i Coupe","BMW 328i"
                ,"BMW 330i","BMW 530i"};
        
        String[] nameBase = {"Vin","Toyota","BMW","Tesla","Honda"};
        
        int[] sizee = {2,5,14};
        
        
        int dem = 0 ;
        
        for(int i = 0 ; i < 15 ; i++){
            Car car = new Car();
            car.setProduct_id((int) (1000 + Math.random()*1000));
            dem = (int) (Math.random()*nameC.length);
            car.setProduct_name(nameC[dem]);
            dem = (int) (Math.random()*nameBase.length);
            car.setCar_base(nameBase[dem]);
            car.setProduct_price(100000 + (int) (100000 + Math.random()*100000));
            car.setProduct_total(1000 + (int) ( Math.random()*10));
            dem = (int) (Math.random()*sizee.length);
            car.setCar_size(2 + sizee[dem]);
            
            listc.add(car);
        }
        
        
        return listc;
    }
    
}
