package Ontapsinhvien;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
         Quanlisinhvien qlsv=new Quanlisinhvien();
         SinhVien sv=new SinhVien();
         Scanner nhap =new Scanner(System.in);
         while (true)
         {
             System.out.println("========== MENU QUẢN LÝ SINH VIÊN ==========");
             System.out.println("1. Thêm sinh viên");
             System.out.println("2. Hiển thị danh sách sinh viên");
             System.out.println("3. Xóa sinh viên theo tên");
             System.out.println("4. Cập nhật sinh viên theo tên");
             System.out.println("5. Sắp xếp sinh viên theo tuổi (tăng dần)");
             System.out.println("6. Hiển thị sinh viên có tuổi >= 20");
             System.out.println("0. Thoát");
             System.out.println("============================================");
             System.out.print("Nhập lựa chọn của bạn: ");
             int luachon=nhap.nextInt();
             if(luachon==1)
             {
                 
             }
         }

    }
}
