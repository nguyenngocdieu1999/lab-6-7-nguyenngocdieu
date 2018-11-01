/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author admin
 */
public class Hexagon extends Shape{
    Point A,B,C,I;
    private  double r,R;
    
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public Point getI() {
        return I;
    }

    public void setI(Point i) {
        this.I= i;
    }
    public Hexagon() {
        this.r = 1.0;
        this.R = 1.2;
    }
    public Hexagon(String color, Point i, double r ,double R) {
        I=i;
        this.r=r;
        this.R=R;
        this.setColor(color);
        A=new Point(I.getX()+R,I.getY());
        B= new Point(I.getX()+Math.sqrt(R*R-r*r),I.getY()+r );
        C= new Point(I.getX(),I.getY()+r);
    }
    private  double getArea ()
    {
        return  3.464 *r*r;
    }
    public String toString(){
            return "hinh luc giac" + "\n" + "màu : " + getColor() + "\n"+ "Dtich: "+getArea()+"\n";

    }
}
