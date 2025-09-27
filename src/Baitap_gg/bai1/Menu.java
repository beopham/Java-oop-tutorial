package Baitap_gg.bai1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Quanlicanbo qlcb=new Quanlicanbo();
        Scanner nhapso=new Scanner(System.in);
        Scanner nhapchu=new Scanner(System.in);
        while (true)
        {
            System.out.println("===== QUẢN LÝ CÁN BỘ =====");
            System.out.println("1. Thêm cán bộ");
            System.out.println("2. Hiển thị danh sách cán bộ");
            System.out.println("3. Tìm kiếm theo họ tên");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            int chon=nhapso.nextInt();
            if(chon==1)
            {
                System.out.println("Chọn loại cán bộ:");
                System.out.println("1. Công nhân");
                System.out.println("2. Kỹ sư");
                System.out.println("3. Nhân viên");
                int choncanbo=nhapso.nextInt();
                switch (choncanbo)
                {
                    case 1:
                        System.out.print("Nhập họ tên: ");
                        String hoTen = nhapchu.nextLine();
                        System.out.print("Nhập tuổi: ");
                        int tuoi = nhapso.nextInt();
                        System.out.print("Nhập giới tính: ");
                        String gioiTinh = nhapchu.nextLine();
                        System.out.print("Nhập địa chỉ: ");
                        String diaChi = nhapchu.nextLine();
                        System.out.print("Nhập bậc công nhân(1-10): ");
                        int bac=nhapso.nextInt();
                        CongNhan cn=new CongNhan(hoTen,tuoi,gioiTinh,diaChi,bac);
                        qlcb.themcanbo(cn);
                        break;
                    case 2:
                        System.out.print("Nhập họ tên: ");
                        String hoTenks = nhapchu.nextLine();
                        System.out.print("Nhập tuổi: ");
                        int tuoiks = nhapso.nextInt();
                        System.out.print("Nhập giới tính: ");
                        String gioiTinhks = nhapchu.nextLine();
                        System.out.print("Nhập địa chỉ: ");
                        String diaChiks = nhapchu.nextLine();
                        System.out.print("Nhập ngành đào tạo ");
                        String nganhdaotao=nhapchu.nextLine();
                        Kysu ks=new Kysu(hoTenks,tuoiks,gioiTinhks,diaChiks,nganhdaotao);
                        qlcb.themcanbo(ks);
                        break;
                    case 3:
                        System.out.print("Nhập họ tên: ");
                        String hoTenNV = nhapchu.nextLine();
                        System.out.print("Nhập tuổi: ");
                        int tuoiNV = nhapso.nextInt();
                        System.out.print("Nhập giới tính: ");
                        String gioiTinhNV = nhapchu.nextLine();
                        System.out.print("Nhập địa chỉ: ");
                        String diaChiNV = nhapchu.nextLine();
                        System.out.print("Nhập công việc ");
                        String congviec=nhapchu.nextLine();
                        Nhanvien nv=new Nhanvien(hoTenNV,tuoiNV,gioiTinhNV,diaChiNV,congviec);
                        qlcb.themcanbo(nv);
                        break;
                }
            }
            else if (chon==2)
            {
                qlcb.hienthiThongtin();
            }
            else if (chon==3)
            {
                System.out.println("Nhập vào thông tin cần tìm kiếm");
                String ten=nhapchu.nextLine();
                qlcb.timkiemthongtin(ten);
            }
            else if (chon==4)
            {
                System.out.println("Bạn đã thoát chương trình");
                break;
            }


        }
    }
}
