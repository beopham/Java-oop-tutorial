package Chapter1_Exercises_on_Classes;

public class MenuInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem iv1=new InvoiceItem(1,"CEO",2000,3000);
        System.out.println(iv1.toString());
        System.out.println("Total =" +iv1.total());
        InvoiceItem inv1 = new InvoiceItem(2, "Pen Red", 888, 0.08);
        System.out.println(inv1);  // toString();

        // Test Setters and Getters
        inv1.setQty(999);
        inv1.setUnitprice(0.99);
        System.out.println(inv1);  // toString();
        System.out.println("id is: " + inv1.getId());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("qty is: " + inv1.getQty());
        System.out.println("unitPrice is: " + inv1.getUnitprice());

        // Test getTotal()
        System.out.println("The total is: " + inv1.total());
    }
}
