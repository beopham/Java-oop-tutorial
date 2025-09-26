package Chapter1_Exercises_on_Classes;

public class Circle {
    private double radius;
    private String color;

    public Circle()
    {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void hienthi()
    {
        System.out.println("Radius" +radius);
        System.out.println("Color" +color);
    }
    public double dientich()
    {
       double dientichht=Math.PI*Math.pow(radius,2);
       return dientichht;
    }
    public double chuvihtr()
    {
        double chuvi=2*Math.PI*radius;
        return chuvi;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

}
