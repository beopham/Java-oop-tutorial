package Chapter1_Exercises_on_Classes;

public class MenuAccount {
    public static void main(String[] args) {
        Account taikhoan1=new Account("ID1","Nam",50000);
        System.out.println(taikhoan1.toString());
        System.out.println("Tiền của tài khoản 1");
        System.out.println(taikhoan1.getBalance());
        System.out.println("Cộng tiền vào tài khoản 1");
        System.out.println(taikhoan1.credit(20000));
        System.out.println("Trừ tiền vào tài khoản 1");
        System.out.println(taikhoan1.debit(10000));
        Account taikhoan2=new Account("ID2","Lan",90000);
        System.out.println("Tk1 chuyển cho tài khoản 2 30000");
        taikhoan1.tranfer(taikhoan2,30000);
        System.out.println("Tk1 ");
        System.out.println(taikhoan1.toString());
        System.out.println("Tk2 ");
        System.out.println(taikhoan2.toString());
    }
}
