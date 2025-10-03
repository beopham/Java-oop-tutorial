package Baitap_gg.ontap2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QuanLiSinhVien qlsv = new QuanLiSinhVien();
        Scanner sc = new Scanner(System.in);
        int choose;

        do {
            System.out.println("\n===== MENU QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. Sắp xếp theo GPA (cao -> thấp)");
            System.out.println("4. Tìm kiếm theo tên");
            System.out.println("5. Tìm kiếm theo lớp");
            System.out.println("6. Xóa sinh viên theo tên");
            System.out.println("7. Cập nhật sinh viên theo tên");
            System.out.println("8. Sinh viên GPA cao nhất");
            System.out.println("9. Sinh viên GPA thấp nhất");
            System.out.println("10. Đếm số lượng sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choose = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choose) {
                case 1:
                    System.out.print("Nhập tên: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhập lớp: ");
                    String lop = sc.nextLine();
                    System.out.print("Nhập GPA: ");
                    double gpa = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String diachi = sc.nextLine();

                    Sinhvien sv = new Sinhvien(ten, lop, gpa, diachi);
                    qlsv.themsinhvien(sv);
                    System.out.println("✅ Thêm thành công!");
                    break;

                case 2:
                    qlsv.xuatsv();
                    break;

                case 3:
                    qlsv.sapxeptheogpa();
                    break;

                case 4:
                    System.out.print("Nhập tên cần tìm: ");
                    String t = sc.nextLine();
                    qlsv.timiiemtheoten(t);
                    break;

                case 5:
                    System.out.print("Nhập lớp cần tìm: ");
                    String l = sc.nextLine();
                    qlsv.tiemkiemsinhhvientheolop(l);
                    break;

                case 6:
                    System.out.print("Nhập tên cần xóa: ");
                    String nameDel = sc.nextLine();
                    qlsv.xoasvtheoten(nameDel);
                    break;

                case 7:
                    System.out.print("Nhập tên sinh viên cần cập nhật: ");
                    String tenUpdate = sc.nextLine();
                    System.out.print("Nhập GPA mới: ");
                    double gpaMoi = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhập lớp mới: ");
                    String lopMoi = sc.nextLine();
                    System.out.print("Nhập địa chỉ mới: ");
                    String diachiMoi = sc.nextLine();
                    qlsv.capnhapssinhvien(tenUpdate, gpaMoi, lopMoi, diachiMoi);
                    break;

                case 8:
                    System.out.println("Sinh viên có GPA cao nhất:");
                    qlsv.maxGpa();
                    break;

                case 9:
                    System.out.println("Sinh viên có GPA thấp nhất:");
                    qlsv.minGpa();
                    break;

                case 10:
                    System.out.println("Số lượng sinh viên: " + qlsv.demsv());
                    break;

                case 0:
                    System.out.println("✅ Thoát chương trình!");
                    break;

                default:
                    System.out.println("❌ Chức năng không hợp lệ, nhập lại!");
            }
        } while (choose != 0);

        sc.close();
    }
}
