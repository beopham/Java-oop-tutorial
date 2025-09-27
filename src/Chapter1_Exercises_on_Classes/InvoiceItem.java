package Chapter1_Exercises_on_Classes;

public class InvoiceItem {
    private int id;
    private String desc;
    private double qty;
    private double  unitprice;

    public InvoiceItem()
    {

    }

    public InvoiceItem(int id, String desc, double qty, double unitprice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitprice = unitprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }
    public  double  total()
    {
        return unitprice*qty;
    }
    @Override
    public String toString() {
        return "InvoiceItem{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitprice=" + unitprice +
                '}';
    }
}
