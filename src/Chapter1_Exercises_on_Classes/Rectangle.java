package Chapter1_Exercises_on_Classes;

public class Rectangle {
    private double height;
    private double width;
    public Rectangle()
    {

    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double chuvi()
    {
        double kqchuvi=2*(height+width);
        return kqchuvi;
    }
    public double dientich()
    {
        double kqdt=(height*width);
        return kqdt;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
