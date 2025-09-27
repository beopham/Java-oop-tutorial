package Chapter1_Exercises_on_Classes;

public class MenuEmployee {
    public static void main(String[] args) {
        Employee nv=new Employee("Nam",20,5000);
        System.out.println(nv.toString());
        System.out.println(nv.luonghangnam());
        System.out.println("luong mới");
        System.out.println(nv.luongmoi(50));
    }
}
