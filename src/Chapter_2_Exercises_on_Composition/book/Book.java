package Chapter_2_Exercises_on_Composition.book;

import java.util.Arrays;

public class Book {
    private String name;
    private double price;
    private int qty=0;
    private Author[] authors;

   public Book()
   {

   }

    public Book(String name, double price, Author[] authors) {
        this.name = name;
        this.price = price;
        this.authors = authors;
    }

    public Book(String name, double price, int qty, Author[] authors) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}
