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
import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.util.Scanner;

public class Bai5 {

    int n;

    public int getN() {
        return n;
    }

    void nhap() {
        boolean ktra = false;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Nhap vao N");
                n = Integer.parseInt(sc.nextLine());
                ktra = true;
            } catch (Exception e) {
                System.out.println("Nhập đúng kiểu dữ liệu:" + e.toString());
                ktra = false;
            }
        } while (ktra == false);
    }

    float tinhtong1(int a) {
        float t1 = 0;
        for (int i = 1; i <= a; i++) {
            t1 += (1.0 / i);
        }

        return t1;
    }

    float tinhtong2(int a) {
        float t2 = 0;
        int gt = 1;
        for (int i = 1; i <= a; i++) {
            gt = gt * i;
            t2 += 1 / gt;
        }
        return t2;
    }

    void menu() {
        System.out.println("1 Nhap vao so nguyen duong n");
        System.out.println("2 Tinh tong :1+....+1/n");
        System.out.println("3 Tinh tong :1+....+1/n!");
        System.out.println("Thoát");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bai5 b5 = new Bai5();
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            boolean ktra = false;
            do {
                b5.menu();
                try {
                    System.out.println("Nhập số vừa chọn: ");
                    n = Integer.parseInt(sc.nextLine());
                    ktra = true;
                } catch (Exception e) {
                    System.out.println("Nhập đúng dữ liệu : " + e.toString());
                    ktra = false;
                }
            } while (ktra == false);
            switch (n) {
                case 1: {
                    b5.nhap();
                    break;
                }
                case 2: {
                    if (b5.getN() == 0) {
                        System.out.println("ban chua nhap n!hoac ban de n =0");
                    } else {
                        System.out.println("Tong 1+...1/" + n + " la:" + b5.tinhtong1(b5.getN()));
                    }
                    break;

                }
                case 3:
                    if (b5.getN() == 0) {
                        System.out.println("ban chua nhap n!hoac ban de n =0");
                    } else {
                        System.out.println("Tong 1+...1/" + n + "! la:" + b5.tinhtong2(b5.getN()));
                    }
                    break;
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Khong co lua chon cua ban ");
                    break;
                }

            }

        } while (n != 0);
    }

}
