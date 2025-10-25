package vku_giuaki;

public class Menu {
    public static void main(String[] args) {
        QuanliFamily quanli=new QuanliFamily();

        quanli.them(new Family("GD001", 100, 30,  new Energy("D1",1200), new Water("N1",1500)));
        quanli.them(new Family("GD002", 80, 50,   new Energy("D2",1350), new Water("N1",1500)));
        quanli.them(new Family("GD003", 120,100,  new Energy("D2",1350), new Water("N2",2000)));
        quanli.them(new Family("GD004", 100,100,  new Energy("D3",1500), new Water("N1",1500)));
        quanli.them(new Family("GD005", 50, 50,   new Energy("D4",2000), new Water("N3",2100)));
        System.out.println("danh sách ");
        quanli.hienthi();
        System.out.println("==================");
        System.out.println("sắp xếp tăng theo số tiền điện");
       quanli.sapxeptiendiengiam();
        System.out.println("=====================");
        System.out.println("sắp xếp giảm theo số tiền nước");
       quanli.sapxepTienNuoctang();
    }
}
