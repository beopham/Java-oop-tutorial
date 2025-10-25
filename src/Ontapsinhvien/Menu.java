package Ontapsinhvien;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
         Quanlisinhvien qlsv=new Quanlisinhvien();

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
             if (luachon == 1) {
                 nhap.nextLine(); // 🟢 bỏ ký tự xuống dòng còn sót lại từ nextInt()

                 System.out.print("Nhập tên sinh viên: ");
                 String ten = nhap.nextLine();

                 System.out.print("Nhập tuổi sinh viên: ");
                 int tuoi = nhap.nextInt();
                 nhap.nextLine(); // 🟢 bỏ dòng trống sau nextInt()

                 System.out.print("Nhập địa chỉ sinh viên: ");
                 String diachi = nhap.nextLine();

                 SinhVien sv = new SinhVien(ten, tuoi, diachi);
                 qlsv.themsinhvien(sv);

                 System.out.println("✅ Đã thêm sinh viên thành công!\n");
             }
             if (luachon==2)
             {
                 qlsv.hienthidanhsach();
             }
             if (luachon==3)
             {
                 nhap.nextLine(); // thêm dòng này
                 System.out.println("nhập tên sinh viên cần xóa");
                 String ten= nhap.nextLine();
                 qlsv.xosasinhvientheoten(ten);
             }
             if (luachon == 4) {
                 nhap.nextLine(); // thêm dòng này
                 System.out.print("Nhập tên sinh viên cần cập nhật: ");
                 String ten = nhap.nextLine();

                 System.out.print("Nhập tuổi mới: ");
                 int tuoi = nhap.nextInt();
                 nhap.nextLine();

                 System.out.print("Nhập địa chỉ mới: ");
                 String diachi = nhap.nextLine();

                 qlsv.capnhaptheoten(ten, tuoi, diachi);
             }

             if (luachon==5)
             {
                 qlsv.sapxepsinhvientheotuoi();
             }
             if (luachon==6)
             {
                 qlsv.svlonhon20();
             }
             if (luachon==7)
             {
                 System.out.println("Bạn đã thoát chương trình");
                 break;
             }
         }

    }
}
