package CRUD_KhachHang.Model;
import java.sql.Date;


public class KhachHang {
    private String id_kh;
    private String Hoten;
    private Date Ngaysinh;
    private String diachi;

    public KhachHang()
    {

    }

    public KhachHang(String id_kh, String hoten, Date ngaysinh, String diachi) {
        this.id_kh = id_kh;
        this.Hoten = hoten;
        this.Ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    public KhachHang(String id_kh) {
        this.id_kh = id_kh;
    }

    public String getId_kh() {
        return id_kh;
    }

    public void setId_kh(String id_kh) {
        this.id_kh = id_kh;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        Ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "id_kh='" + id_kh + '\'' +
                ", Hoten='" + Hoten + '\'' +
                ", Ngaysinh=" + Ngaysinh +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
