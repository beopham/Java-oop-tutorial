package Chapter1_Exercises_on_Classes;


public class MenuTime {
    public static void main(String[] args) {
        Time t = new Time(23, 59, 59);
        System.out.println(t);              // 23:59:59
        System.out.println(t.nextSecond()); // 00:00:00
        System.out.println(t.previousSecond().previousSecond()); // 23:59:58
    }
}
