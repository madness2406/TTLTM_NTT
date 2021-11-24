/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLy {

    static void menu() {
        System.out.println("-------Menu--------");
        System.out.println("1.Nhap sanh sach sinh vien.");
        System.out.println("2.Xuat thông tin sinh vien");
        System.out.println("3.Xuat sanh sach sinh vien co học luc gioi");
        System.out.println("4.Sắp xếp danh sách sinh viên theo diem");
        System.out.println("5.Thoát");

    }
    static ArrayList<SinhVienIT> lsIT = new ArrayList<SinhVienIT>();
    static ArrayList<SinhVienBiz> lsBiz = new ArrayList<SinhVienBiz>();

    public static void main(String[] args) {
        int chon;
        int n;
        do {
            menu();
            Scanner sc = new Scanner(System.in);
            System.out.println("--------------------------");
            System.out.print("Nhap vao lụa chon cua ban-------: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1: {
                    nhap();
                    break;
                }
                case 2: {
                    xuat();
                    break;
                }
                case 3: {
                    XuatSinhVienGioi();
                    break;
                }
                case 4: {
                    sapxep();
                    xuat();
                    break;
                }
                case 5: {
                    System.exit(0);
                }

            }
        } while (chon != 5);
    }

    public static void nhap() {
        Scanner sc = new Scanner(System.in);
        String nganh;
        int n;
        
        System.out.print("\tNhap so sinh vien: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("\tNhap Thông tin sinh viên thu " + (i + 1) + ": ");
            System.out.print("\tNhap ho ten: ");
            String ten = sc.nextLine();
            while (true) {
                System.out.print("\tNganh (IT/Biz): ");
                nganh = sc.nextLine();
                if (nganh.equalsIgnoreCase("IT") || nganh.equalsIgnoreCase("Biz")) {
                    break;
                }
            }
            try {
                if (nganh.equalsIgnoreCase("IT")) {
                    System.out.print("\tNhap diem java: ");
                    Double java = sc.nextDouble();
                    System.out.print("\tNhap diem html: ");
                    Double html = sc.nextDouble();
                    System.out.print("\tNhap diem css: ");
                    Double css = sc.nextDouble();
                    SinhVienIT svIT = new SinhVienIT(java, html, css, ten, nganh);
                    lsIT.add(svIT);
                } else if (nganh.equalsIgnoreCase("Biz")) {
                    Double maketing, sales;
                    System.out.print("\tNhap diem maketing: ");
                    maketing = sc.nextDouble();
                    System.out.print("\tNhap diem sales: ");
                    sales = sc.nextDouble();
                    SinhVienBiz svBiz = new SinhVienBiz(maketing, sales, ten, nganh);
                    lsBiz.add(svBiz);
                }
            } catch (Exception e) {
                System.out.println("Ban nhap sai kieu du lieu,mơi ban nhap lai!");
            }
        }
    }

    public static void xuat() {
        System.out.println("\tThong tin sinh vien da nhap: ");
        for (SinhVienIT IT : lsIT) {
            IT.Xuat();
        }
        for (SinhVienBiz biz : lsBiz) {
            biz.Xuat();
        }
    }

    public static void XuatSinhVienGioi() {

        System.out.println("\tThong tin sinh vien gioi IT");
        for (SinhVienIT IT : lsIT) {
            if (IT.gethocluc().equals("Giỏi")) {
                IT.Xuat();
            }
        }
        System.out.println("\tThong tin sinh vien gioi Biz");
        for (SinhVienBiz biz : lsBiz) {
            if (biz.gethocluc().equals("Giỏi")) {
                biz.Xuat();
            }
        }

    }

    public static void sapxep() {
//        System.out.println("Sắp xếp: ");
//        Comparator<SinhVienIT> compITtang = new Comparator<SinhVienIT>() {
//            @Override
//            public int compare(SinhVienIT o1, SinhVienIT o2) {
//                return o1.getdiem().compareTo(o2.getdiem());
//            }
//        };
//        Comparator<SinhVienIT> compITgiam = new Comparator<SinhVienIT>() {
//            @Override
//            public int compare(SinhVienIT o1, SinhVienIT o2) {
//                return o2.getdiem().compareTo(o1.getdiem());
//            }
//        };
//        Comparator<SinhVienBiz> compBiztang = new Comparator<SinhVienBiz>() {
//            @Override
//            public int compare(SinhVienBiz o1, SinhVienBiz o2) {
//                return o1.getdiem().compareTo(o2.getdiem());
//            }
//        };
//        Comparator<SinhVienBiz> compBizgiam = new Comparator<SinhVienBiz>() {
//            @Override
//            public int compare(SinhVienBiz o1, SinhVienBiz o2) {
//                return o2.getdiem().compareTo(o1.getdiem());
//            }
//        };
//        Scanner sc = new Scanner(System.in);
//        String sx;
//        while (true) {
//            System.out.print("Bạn muon sap xep tang hay giam dan(t/g): ");
//            sx = sc.nextLine();
//            if (sx.equalsIgnoreCase("t") || sx.equalsIgnoreCase("g")) {
//                break;
//            }
//            if (sx.equalsIgnoreCase("t")) {
//                Collections.sort(lsIT, compITtang);
//                Collections.sort(lsBiz, compBiztang);
//            } else {
//                Collections.sort(lsIT, compITgiam);
//                Collections.sort(lsBiz, compBizgiam);
//            }
//        }

        Scanner sc = new Scanner(System.in);
        String sx;
        while (true) {
            System.out.print("\tBạn muon sap xep tang hay giam dan(t/g): ");
            sx = sc.nextLine();
            if (sx.equalsIgnoreCase("t") || sx.equalsIgnoreCase("g")) {
                break;
            }

        }
        if (sx.equalsIgnoreCase("t")) {

            Collections.sort(lsIT, new Comparator<SinhVienIT>() {
                @Override
                public int compare(SinhVienIT o1, SinhVienIT o2) {
                    System.out.println("\tBXH sinh vien It");
                    return o1.getdiem() > o2.getdiem() ? 1 : -1;
                }
            });

        } else {

            Collections.sort(lsIT, new Comparator<SinhVienIT>() {
                @Override
                public int compare(SinhVienIT o1, SinhVienIT o2) {
                    System.out.println("\tBXH sinh vien It");
                    return o1.getdiem() < o2.getdiem() ? 1 : -1;
                }
            });

        }
        if (sx.equalsIgnoreCase("t")) {

            Collections.sort(lsBiz, new Comparator<SinhVienBiz>() {
                @Override
                public int compare(SinhVienBiz o1, SinhVienBiz o2) {
                    System.out.println("\tBXH sinh vien Biz");
                    return o1.getdiem() > o2.getdiem() ? 1 : -1;
                }
            });

        } else {

            Collections.sort(lsBiz, new Comparator<SinhVienBiz>() {
                @Override
                public int compare(SinhVienBiz o1, SinhVienBiz o2) {
                    System.out.println("\tBXH sinh vien Biz");
                    return o1.getdiem() < o2.getdiem() ? 1 : -1;

                }
            });

        }
    }
}
