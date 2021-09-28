using System;

namespace Lab1.btnv._2.QLSV
{
    class Program
    {
        static void Main(string[] args)
        {
            QuanLySinhVien quanLySinhVien = new QuanLySinhVien();

            Boolean chaychuongtrinh = true;

            while (chaychuongtrinh == true)
            {
                Console.WriteLine("*************************MENU**************************");
                Console.WriteLine("**  1. Them sinh vien.                               **");
                Console.WriteLine("**  3. Xoa sinh vien boi ID.                         **");
                Console.WriteLine("**  5. Hien thi danh sach sinh vien.                 **");

                Console.Write("Nhap tuy chon: ");
                int choose = int.Parse(Console.ReadLine());

                switch (choose) {
                    case 1:
                        Console.WriteLine("\n1. Them sinh vien.");
                        quanLySinhVien.NhapSV();
                        Console.WriteLine("\nThem sinh vien thanh cong!");
                        break;

                   case 5:
                        Console.WriteLine("\n Danh sach sinh vien.");
                        quanLySinhVien.ShowSinhVien(quanLySinhVien.getListSinhVien());
                        break;
                }
            }

        }

    }
}
