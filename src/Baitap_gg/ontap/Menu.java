package Baitap_gg.ontap;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Quanlisinhvien qlsv = new Quanlisinhvien();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Nhập sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. Sắp xếp theo GPA");
            System.out.println("4. Tìm kiếm theo tên");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên sinh viên: ");
                    String ten = sc.nextLine();

                    System.out.print("Nhập lớp: ");
                    String lop = sc.nextLine();

                    System.out.print("Nhập GPA: ");
                    double gpa = Double.parseDouble(sc.nextLine());

                    System.out.print("Nhập địa chỉ: ");
                    String diachi = sc.nextLine();

                    Sinhvien sv = new Sinhvien(ten, lop, gpa, diachi);
                    qlsv.nhapsv(sv);
                    System.out.println("✅ Thêm sinh viên thành công!");
                    break;

                case 2:
                    System.out.println("=== Danh sách sinh viên ===");
                    qlsv.xuatsv();
                    break;

                case 3:
                    System.out.println("=== Danh sách sau khi sắp xếp theo GPA ===");
                    qlsv.sapxeptheogpa();
                    break;

                case 4:
                    System.out.print("Nhập tên cần tìm: ");
                    String timTen = sc.nextLine();
                    qlsv.timkiemtheoten(timTen);
                    break;

                case 0:
                    System.out.println("👋 Thoát chương trình!");
                    break;

                default:
                    System.out.println("❌ Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }
}
