/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test1.tx2java;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Nguyen Quoc Trung
 */
public class Test11tx2java {

    public static void main(String[] args) {
        
        
        
        
        Scanner sc = new Scanner(System.in);
        String chon = "";
            
        while(!chon.equals("7")){
             System.out.println("1.in danh sach");
             System.out.println("2.thêm sản phẩm ô tô trong kho");
             System.out.println("3.sửa sản phẩm ô tô trong kho ");
             System.out.println("4. xóa sản phẩm ô tô trong kho");
             System.out.println("5. tìm kiếm ô tô theo ten");
             System.out.println("6. sap xep theo gia");
             System.out.println("7. thoat ");
              
             listcar.listC();
             int id ;
             Car car = new Car();
                     
             chon = sc.nextLine();
             switch (chon) {
                 
                case "1":
                    outputcar(listcar.listc);
                    break;
                    case "2":
                    
                    Car.inputCar(car);
                    if(car.addCar(car))
                            System.out.println("them thanh cong ");
                    else System.out.println("them that bai");
                    break;
                    case "3":
                        System.out.print("nhap id san pham can sua thong tin :");
                         id = Integer.parseInt(sc.nextLine());
                        car = searchCarid(id);
                        if(car.editCar(car))
                            System.out.println("sua thanh cong ");
                    else System.out.println("sua that bai");
                    

                    break;
                    case "4":
                        System.out.print("nhap id san pham can sua thong tin :");
                         id = Integer.parseInt(sc.nextLine());
                        car = searchCarid(id);
                        if(car.editCar(car))
                            System.out.println("xoa thanh cong ");
                    else System.out.println("xoa that bai");
                    break;
                    case "5":
                        System.out.print("nhap ten xe can tim : ");
                        String name ;
                        name = sc.nextLine();
                        if (car.searchCar(name).size() > 0) {
                            outputcar(car.searchCar(name));
                        } else {
                            System.out.println("khong co xe lao thoa man");
                        }
                    break;
                    case "6":
                        System.out.println("nhap chieu cua phep so sanh");
                        double casee ;
                        casee = Double.parseDouble(sc.nextLine());
                        outputcar(car.sortedCar(casee));
                    break;
                    case "7":
                    
                    break;
                default:
                    throw new AssertionError();
            }  
        }
        
        
    }
    public static Car searchCarid(int id){
         
         int dem = 0;
         for(int i = 0 ; i < listcar.listc.size() ; i ++){
             if(listcar.listc.get(i).getProduct_id() == id){
                 dem = i;
                 break;
             }
         }
         return listcar.listc.get(dem);
     }
    public  static void outputcar (List<Car> list){
        
        for (int i = 0; i < list.size(); i++) {
            
            System.out.println(list.get(i));
        }
    }
}
