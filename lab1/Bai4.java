/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author FPTShop
 */
import java.util.Scanner;

public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tt;
        float sodien;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số diện: ");
        sodien = sc.nextFloat();
        if (sodien < 50) {
            tt = sodien * 5000;
        } else {
            tt = 50 * 5000 + (sodien - 50) * 1200;
        }
        System.out.println("Tong tien dien la: " + tt);
    }

}
