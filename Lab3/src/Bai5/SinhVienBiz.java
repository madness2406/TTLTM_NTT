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
public class SinhVienBiz extends SinhVienPoly{
    double diemmarketing,diemsales;
    public SinhVienBiz( double diemmarketing, double diemsales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemmarketing = diemmarketing;
        this.diemsales = diemsales;
    }
    public SinhVienBiz() {
        
    } 
//    @Override
//    public double getdiem() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap diem marketting: ");
//        marketing = sc.nextDouble();
//        System.out.print("Nhap diem sales: ");
//        sales = sc.nextDouble();
//        return (double)(2*marketing+sales)/3;
//    }
    @Override
     Double getdiem() {
        return (2*this.diemmarketing+this.diemsales)/3;
    }   

}

