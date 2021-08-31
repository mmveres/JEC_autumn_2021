package ua.univer.lesson02;

public class ColorLine extends Line{
    private String color;

    public ColorLine(Point beg, Point end, String color) {
        super(beg, end);
        this.color = color;
    }

    public ColorLine(Line l1, String green) {
        super(l1.getBeg(), l1.getEnd());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
