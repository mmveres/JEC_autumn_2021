package ua.univer.lesson02;

public class Triangle implements Figure {
    private Point apexA;
    private Point apexB;
    private Point apexC;
    private Line sideAB;

    public Triangle(Point apexA, Point apexB, Point apexC) {
        this.apexA = apexA;
        this.apexB = apexB;
        this.apexC = apexC;
        //this.sideAB = new Line(this.apexA, this.apexB);
    }

    public Point getApexA() {
        return apexA;
    }

    public void setApexA(Point apexA) {
        this.apexA = apexA;
        sideAB = null;
    }

    public Point getApexB() {
        return apexB;
    }

    public void setApexB(Point apexB) {
        this.apexB = apexB;
        sideAB = null;
    }

    public Point getApexC() {
        return apexC;
    }

    public void setApexC(Point apexC) {
        this.apexC = apexC;
    }

    public Line getGetSideAB(){
        if (sideAB == null ) sideAB = new Line(this.apexA, this.apexB);
        return sideAB;
    }
    public double getLengthAB(){
        return getGetSideAB().getLength();
    }
}
