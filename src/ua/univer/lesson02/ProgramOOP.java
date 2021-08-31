package ua.univer.lesson02;

public class ProgramOOP {
    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        int value = -3;
        p1.setX(value);
     //   System.out.println(p1);
        ColorPoint cp1 = new ColorPoint(2,2,"red");
     //   System.out.println(cp1);
        Point p2 = new Point(3,3);
        Point p3 = new Point(4,4);
        Line l1 = new Line(p2,p3);
        Line l2 = new Line(5,5,6,6);
        Line l3 = new Line(new Point(7,7), new Point(8,8));
        ColorLine cl1 = new ColorLine(p2, p3, "blue");
        ColorLine cl2 = new ColorLine(l1, "green");
        Triangle triangle1 = new Triangle(p1, p2, p3);
        triangle1.getLengthAB();

        Figure[] masObj = new Figure[6];
        masObj[0] = p1;
        masObj[1] = cp1;
        masObj[2] =l1;
        masObj[3] =cl1;
        masObj[4] =triangle1;
      //  masObj[5] = new Object();
        for (var obj: masObj) {
            System.out.println(obj);
            if (obj instanceof Triangle){
                Triangle tr = (Triangle) obj;
                System.out.println(tr.getLengthAB());
            }
        }
    }
}
