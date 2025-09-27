package Chapter_2_Exercises_on_Composition.book;

public class Menu {
    public static void main(String[] args) {
        Author tacgia[]=new Author[2];

         tacgia[0]=new Author("Nam","abc@gmail.com",'M');
         tacgia[1]  =new Author("Lan","xyz@gmail.com",'F');
         Book Book1=new Book("Conan",300,50,tacgia);

        System.out.println("Tac gia 1");
        System.out.println(tacgia[0].toString());
        System.out.println("Tac gia 2");
        System.out.println(tacgia[1].toString());
        System.out.println("Sach");
        System.out.println(Book1.toString());
    }
}
