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
public class SinhVienIT extends SinhVienPoly{
    double diemJava;
    double diemCss;
    double diemHtml;
    

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    } 
    public SinhVienIT() {
        
    }
    
    @Override
    Double getdiem() {
        
        return (2*this.diemJava+this.diemHtml+this.diemCss)/4;
    }   
   
}
