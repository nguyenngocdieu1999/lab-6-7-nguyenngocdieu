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
public class Point {
     private double X,Y;
    public Point(){
    }
    public Point(double x,double y){
        this.X = x;
        this.Y = y;
    }
    public double getX(){
        return X;
    }
    public void setX(int x){
        this.X = x;
    }
    public double getY(){
        return Y;
    }
    public void setY(int y){
        this.Y = y;
    }
    
    public Point move(double x, double y){
        return new Point(x,y);
    }
}
