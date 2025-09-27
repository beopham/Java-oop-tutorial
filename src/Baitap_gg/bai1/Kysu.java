package Baitap_gg.bai1;

public class Kysu extends Canbo {
    private String nganhdaotao;

    public Kysu()
    {

    }

    public Kysu(String nganhdaotao) {
        this.nganhdaotao = nganhdaotao;
    }

    public Kysu(String ten, int tuoi, String gioitinh, String diachi, String nganhdaotao) {
        super(ten, tuoi, gioitinh, diachi);
        this.nganhdaotao = nganhdaotao;
    }

    public String getNganhdaotao() {
        return nganhdaotao;
    }

    public void setNganhdaotao(String nganhdaotao) {
        this.nganhdaotao = nganhdaotao;
    }

    @Override
    public void hienthithongtincanbo() {
        super.hienthithongtincanbo();
        System.out.println("Ngành đào tạo"+nganhdaotao);
    }

    @Override
    public String toString() {
        return "Kysu{" +
                "nganhdaotao='" + nganhdaotao + '\'' +
                '}';
    }
}
