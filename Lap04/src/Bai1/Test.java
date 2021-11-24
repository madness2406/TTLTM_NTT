/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DSSinhVien qlsv = new DSSinhVien();
        SinhVien teo = new SinhVien();
        teo.setMasv("113");
        teo.setTensv("Nguyễn Văn Tèo");
        qlsv.addSinhvien(teo);
        SinhVien ty = new SinhVien();
        ty.setMasv("114");
        ty.setTensv("Nguyễn Thị tý");
        qlsv.addSinhvien(ty);
        System.out.println(qlsv);
    }

}
