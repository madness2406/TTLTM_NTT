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

public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        float b;
        double c;
        long d;
        char e;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen:");
        a = sc.nextInt();
        System.out.println("Nhap mot so thuc:");
        b = sc.nextFloat();
        System.out.println("Nhap mot so double:");
        c = sc.nextDouble();
        System.out.println("Nhap mot so long:");
        d = sc.nextLong();
        System.out.println("Nhap mot ki tu:");
        sc.nextLine();
        e = sc.nextLine().charAt(0);
        System.out.println("Nhap mot chuoi:");
        str = sc.nextLine();
        System.out.println("Du lieu vua nhap:");
        System.out.println("a=" + a);
        System.out.println("l=" + b);
        System.out.println("f=" + c);
        System.out.println("ch=" + d);
        System.out.println("str=" + e);
        System.out.println("d=" + str);
        System.out.println("\nIn tren cung 1 dong:");
        System.out.println("a=" + a + ", f=" + b + ", l=" + c + ", d=" + d + ", ch=" + e + ",str=" + str);
    }
}
