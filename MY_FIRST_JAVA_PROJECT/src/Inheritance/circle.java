package Inheritance;
public class circle {
    protected double radius;
    void setRadius(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public double findArea (){
        return Math.PI*Math.pow(radius,2);
}
}
