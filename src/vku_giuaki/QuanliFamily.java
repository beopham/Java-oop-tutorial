package vku_giuaki;

import vku_giuaki.Family;

import java.util.ArrayList;

public class QuanliFamily {
    private ArrayList <Family> quanligiadinh ;

    public QuanliFamily() {
        this.quanligiadinh = new ArrayList<>();
    }

    public QuanliFamily(ArrayList<Family> quanligiadinh) {
        this.quanligiadinh = quanligiadinh;
    }

    public void them(Family giadinh) {
        quanligiadinh.add(giadinh);
    }

    public void hienthi() {
        quanligiadinh.stream().forEach(kq -> System.out.println(kq.toString()));
    }

    public void sapxeptiendiengiam() {
        quanligiadinh.stream()
                .sorted((gd1, gd2) -> Integer.compare(gd2.tiendien(), gd1.tiendien()))
                .forEach(gd -> System.out.println(gd.toString()));
    }

    public void sapxepTienNuoctang() {
        quanligiadinh.stream()
                .sorted((gd1, gd2) -> Integer.compare(gd1.tiennuoc(), gd2.tiennuoc()))
                .forEach(gd -> System.out.println(gd.toString()));
    }

}
