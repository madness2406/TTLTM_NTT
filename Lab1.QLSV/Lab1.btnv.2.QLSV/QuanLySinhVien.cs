using System;
using System.Collections.Generic;
using System.Text;

namespace Lab1.btnv._2.QLSV
{
    class QuanLySinhVien
    {
        private List<SinhVien> ListSinhVien = null;

        public QuanLySinhVien()
        {
            ListSinhVien = new List<SinhVien>();
        }

        public void NhapSV()
        {
            SinhVien sv = new SinhVien();
            Console.Write("Nhap ho va ten sinh vien: ");
            sv.hoTen=Convert.ToString(Console.ReadLine());

            Console.Write("Nhap que quan sinh vien: ");
            sv.queQuan = Convert.ToString(Console.ReadLine());

            Console.Write("Nhap nam sinh: ");
            sv.namSinh = int.Parse(Console.ReadLine());

            Console.Write("Nhap diem tong ket: ");
            sv.diemTongKet = int.Parse(Console.ReadLine());
            ListSinhVien.Add(sv);
        }

        public SinhVien FindByName(string hoten)
        {
            SinhVien searchResult = null;
            if (ListSinhVien != null && ListSinhVien.Count > 0)
            {
                foreach (SinhVien sv in ListSinhVien)
                {
                    if (sv.hoTen == hoten)
                    {
                        searchResult = sv;
                    }
                }
            }
            return searchResult;
        }
        public bool DeleteByName(string hoten)
        {
            bool IsDeleted = false;
            // tìm kiếm sinh viên theo ID
            SinhVien sv = FindByName(hoten);
            if (sv != null)
            {
                IsDeleted = ListSinhVien.Remove(sv);
            }
            return IsDeleted;
        }

        public List<SinhVien> FindByQueQuan(String keyword)
        {
            List<SinhVien> searchResult = new List<SinhVien>();
            if (ListSinhVien != null && ListSinhVien.Count > 0)
            {
                foreach (SinhVien sv in ListSinhVien)
                {
                    if (sv.queQuan.ToUpper().Contains(keyword.ToUpper()))
                    {
                        searchResult.Add(sv);
                    }
                }
            }
            return searchResult;
        }
        public void ShowSinhVien(List<SinhVien> listSV)
        {
            // hien thi tieu de cot
            Console.WriteLine("{0, -5} {1, -20} {2, -5} {3, 5}",
                  "Họ và tên ", "Quê quán", "Năm sinh", "Điểm trugn bình ");
            // hien thi danh sach sinh vien
            if (listSV != null && listSV.Count > 0)
            {
                foreach (SinhVien sv in listSV)
                {
                    Console.WriteLine("{0, -5} {1, -20} {2, -5} {3, 5} ",
                                      sv.hoTen, sv.queQuan, sv.namSinh, sv.diemTongKet);
                }
            }
            Console.WriteLine();
        }
        public List<SinhVien> getListSinhVien()
        {
            return ListSinhVien;
        }
    }

}
