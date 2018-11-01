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
public class Square extends Rectangle{
    private double side;
    public void set(Point a) {
        this.A = a;
    }
    public double getSide() {
        return side;
    }

    public void set(double s) {
        this.side = s;
    }
    public Square(){
        
    }
    public Square(double s,Point a,String color){
        this.setLength(s);
        this.setWeight(s);
        A = a;
        B = new Point(A.getX(),(A.getY()+ getWeight()));
        C = new Point(A.getX() + getWeight(),A.getY() + getLength());
        D = new Point(A.getX()+ getLength(),A.getY() );
        this.setColor(color);
    }
   
    public void moveSquare(double x, double y){
        A.move(x,y);
        B.move(B.getX()+x, B.getY()+y);
        C.move(C.getX()+x, C.getY()+y);
        D.move(D.getX()+x, D.getY()+y);
    }
    public String toString(){
            return "hinh vuong" + "\n" + "màu : " + getColor() + "\n";
        }
}
