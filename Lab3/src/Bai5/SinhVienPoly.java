/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
 abstract public  class SinhVienPoly {
   
    private String hoTen;
    private String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public SinhVienPoly() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
//    public abstract void hienthi();

     abstract Double getdiem();

    public String gethocluc() {
        String hocLuc = "";
        if (this.getdiem() < 5) {
            hocLuc = "Yếu";
        } else if (this.getdiem() < 6.5) {
            hocLuc = "Trung bình";
        } else if (this.getdiem() < 8) {
            hocLuc = "Kha";
        } else if (this.getdiem() < 9) {
            hocLuc = "Giỏi";
        } else if (this.getdiem() <= 10) {
            hocLuc = "Xuất sắc";
        }
        return hocLuc;
    }

//    public void nhap() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap ho ten: ");
//        hoTen = sc.nextLine();
//        while (true) {
//            System.out.print("Nhap nganh (IT/Biz): ");
//            nganh = sc.nextLine();
//            if(nganh.equalsIgnoreCase("IT")||nganh.equalsIgnoreCase("Biz")){
//              break;  
//            }
//        }
//        getdiem();
//    }
   

    public void Xuat() {

        System.out.println("\tHo ten: " + this.hoTen);
        System.out.println("\tNganh: " + this.nganh);
        System.out.println("\tDiem Trung binh: " + this.getdiem());
        System.out.println("\tHọc luc: " + this.gethocluc());
        System.out.println("\t-----------------------");
    }

}
