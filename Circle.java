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
public class Circle extends Shape{
    private final double Pi=3.14;
    private double R;
    Point O ;
    public void setR(double r){
        this.R = r;
    }
    public double getR(){
        return R;
    }
    public Point getO() {
        return O;
    }
    public void setO(Point a) {
        this.O = a;
    }
    public Circle(){
    }
    public Circle(Point o,double r, String color ){
        O = o;
        R = r;
        this.setColor(color);
    }
    public double getArea() {
        return Pi*R*R;
    }
    public double getPerimeter(){
        return 2*R*Pi;
    }
    public void moveCircle(double x, double y){
            O.move(x, y);
    }
    public String toString(){
            return "hinh tron" + "\n" + "màu : " + getColor() + "\n"+ "Dtich: "+getArea()+"\n"+"Cvi: "+getPerimeter();
        }
    
}
