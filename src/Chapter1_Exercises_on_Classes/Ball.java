package Chapter1_Exercises_on_Classes;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    // Constructor
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    // Getter và Setter
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    // Di chuyển bóng 1 bước
    public void move() {
        this.x += xDelta;
        this.y += yDelta;
    }

    // Đổi chiều di chuyển theo trục ngang (phản xạ ngang)
    public void reflectHorizontal() {
        this.xDelta = -this.xDelta;
    }

    // Đổi chiều di chuyển theo trục dọc (phản xạ dọc)
    public void reflectVertical() {
        this.yDelta = -this.yDelta;
    }

    // Hiển thị thông tin bóng
    @Override
    public String toString() {
        return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }
}

