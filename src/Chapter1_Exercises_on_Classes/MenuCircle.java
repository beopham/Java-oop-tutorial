package Chapter1_Exercises_on_Classes;

public class MenuCircle {
    public static void main(String[] args) {
        Circle hinhtron=new Circle(3,"Vang");
        hinhtron.hienthi();
        System.out.println(hinhtron.toString());
        System.out.println("Dien tich");
        System.out.println(hinhtron.dientich());
        System.out.println("Chu vi");
        System.out.println(hinhtron.chuvihtr());
    }

}
