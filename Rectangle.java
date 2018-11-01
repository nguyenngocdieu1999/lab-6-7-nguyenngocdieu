/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Objects;

/**
 *
 * @author admin
 */
public class Rectangle extends Shape{
    private double weight,length;
    Point A,B,C,D; 
    public void setWeight(double w){
        this.weight = w;
    }
    public void setLength(double l){
        this.length = l;
    }
    public double getWeight(){
        return weight;
    }
    public double getLength(){
        return length;
    }
    public Point getA() {
        return A;
    }
    public void setA(Point a) {
        this.A = a;
    }
    Rectangle(){}
    
    Rectangle(double w,double l,Point a,String color){
        weight = w;
        length = l;
        A = a;
        B = new Point(A.getX(),(A.getY()+ weight));
        C = new Point(A.getX() + weight,A.getY() + length);
        D = new Point(A.getX()+ length,A.getY() );
        this.setColor(color);
    }
    public Point getB() {
        return A;
    }
    public Point getC() {
        return C;
    }
    public Point getD() {
        return D;
    }
    public double getArea() {
        return weight*length ;
    }
    public double getPerimeter(){
        return 2*(weight+length);
    }
       
    public void moveRe(double x, double y){
        A.move(A.getX()+x, A.getY()+y);
        B.move(B.getX()+x, B.getY()+y);
        C.move(C.getX()+x, C.getY()+y);
        D.move(D.getX()+x, D.getY()+y);
        
    }
    public String toString(){
            return "hinh chu nhat" + "\n" + "màu : " + getColor() + "\n"+ "Dtich: "+getArea()+"\n"+"Cvi: "+getPerimeter();
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.weight, weight) == 0 &&
                Double.compare(rectangle.length, length) == 0 &&
                Objects.equals(A.getX(), rectangle.A.getX()) && Objects.equals(A.getY(), rectangle.A.getY()) &&
                Objects.equals(B.getX(),rectangle.B.getX()) && Objects.equals(B.getY(), rectangle.B.getY()) &&
                Objects.equals(C.getX(),rectangle.C.getX()) && Objects.equals(C.getY(), rectangle.C.getY())  &&
        Objects.equals(D.getX(),rectangle.D.getX()) && Objects.equals(D.getY(), rectangle.D.getY()) ;
    }
}
