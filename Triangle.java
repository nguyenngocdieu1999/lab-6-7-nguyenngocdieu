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
public class Triangle extends Shape{
    Point A,B,C;
   
    public Point getA() {
        return A;
    }
    public void setA(Point a) {
        this.A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        this.B = b;
    }

    public Point getC() {
        return C;
    }
    
    public void setC(Point c) {
        this.C = c;
    }
    
    public Triangle(){
    }
    public Triangle(Point a,Point b,Point c,String color){
        A = a;
        B = b;
        C = c;
        this.setColor(color);
    }
    
    public void moveTriangle(double x, double y){
        A.move(A.getX()+x, A.getY()+y);
        B.move(B.getX()+x, B.getY()+y);
        C.move(C.getX()+x, C.getY()+y);
        }
    public String toString(){
            return "hinh tam giac" + "\n" + "màu : " + getColor() + "\n";
        }
}
