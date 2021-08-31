package ua.univer.lesson02;

public class Point implements Figure{
    private int x;
    private int y;
    public Point(int x, int y){
        if (x<0 || y<0) throw new IllegalArgumentException();
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        if (x > 10)
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
