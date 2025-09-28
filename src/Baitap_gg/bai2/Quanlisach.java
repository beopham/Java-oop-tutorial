package Baitap_gg.bai2;
import java.util.ArrayList;

public class Quanlisach {
    private ArrayList<Sach> quyensach;
    public Quanlisach()
    {
      this.quyensach= new ArrayList<Sach> ();
    }

    public Quanlisach(ArrayList<Sach> quyensach) {
        this.quyensach = quyensach;
    }
    public void themsach(Sach sachmoi)
    {
        quyensach.add(sachmoi);
    }
    public void hienthi()
    {
        if(quyensach.isEmpty())
        {
            System.out.println("danh sách trống");
        }
        else
        {
            for (Sach sach : quyensach)
            {
                sach.hienthidanhsach();
            }
        }

    }
}
