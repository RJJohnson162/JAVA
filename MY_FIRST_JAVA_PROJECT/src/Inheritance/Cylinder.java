package Inheritance;

public class Cylinder extends circle{
    private double length;
    void setLength(double l) {
        length = l;
    }
    public double getLength() {
        return length;
    }
    public double findVolume (){
        return findArea()*length;
    }
}
