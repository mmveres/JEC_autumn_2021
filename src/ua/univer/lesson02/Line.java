package ua.univer.lesson02;

public class Line implements Figure{
   private Point beg;
   private Point end;

    public Line(Point beg, Point end) {
        this.beg = beg;
        this.end = end;
    }
    public Line(int x1, int y1, int x2, int y2){
        beg = new Point(x1,y1);
        end = new Point(x2,y2);
    }

    public Point getBeg() {
        return beg;
    }

    public void setBeg(Point beg) {
        this.beg = beg;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    public double getLength(){
        return Math.sqrt(Math.pow(beg.getX()-end.getX(),2)+
                         Math.pow(beg.getY()-end.getY(),2));
    }
    @Override
    public String toString() {
        return "Line{" +
                "beg=" + beg +
                ", end=" + end +
                '}';
    }
}
