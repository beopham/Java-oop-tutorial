package Chapter_2_Exercises_on_Composition.book;

public class Author {
    private String name;
    private String email;
    private char gioitinh;

    public Author()
    {

    }

    public Author(String name, String email, char gioitinh) {
        this.name = name;
        this.email = email;
        this.gioitinh = gioitinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(char gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gioitinh=" + gioitinh +
                '}';
    }
}
