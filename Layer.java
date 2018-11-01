/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Layer {
    public ArrayList<Shape> shape = new ArrayList<>();
     public ArrayList<Shape> getShape() {
        return shape;
    }

    public void setShape(ArrayList<Shape> s) {
        this.shape = s;
    }
    public void  addShape (Shape x) {
        this.shape.add(x);
    }
    public void showShape(){
        for (int i = 0; i < shape.size(); ++i){
            System.out.println(shape.get(i).toString());
        }
    }
    public void deleteTriangle(){
        for(int i = 0; i < shape.size(); i++){
            if(shape.get(i) instanceof Triangle){
                shape.remove(i);
                --i;
            }
        }
    }
    public void deleteCircle(){
        for(int i = 0; i < shape.size(); i++){
            if(shape.get(i) instanceof Circle){
                shape.remove(i);
                --i;
            }
        }
    }
    private boolean visible = true;
    
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    public boolean isVisible() {
        return this.visible;
    }
   
    public static  boolean checkCircle(Circle c1, Circle c2)
    {
        if(c1.getR()==c2.getR()&&c1.getO().getX()==c2.getO().getX()&&c1.getO().getY()==c2.getO().getY())
        {
            return true;
        }
        else
        return false;
    }
     public static boolean checkSquare(Square c1, Square c2)
    {
        if(c1.getA().getX()==c2.getA().getX()&&c1.getSide()==c2.getSide())
        {
            return true;
        }
        else
        return false;
    }
    public static  boolean checkRectangle(Rectangle c1, Rectangle c2)
    {
        if(c1.getA().getX()==c2.getA().getX()&&c1.getLength()==c2.getLength()&&c1.getWeight()==c2.getWeight())
        {
            return true;
        }
        else
        return false;
    }
    public static boolean checkTriangle(Triangle c1, Triangle c2)
    {
        if(c1.getA().getX()==c2.getA().getX()&&c1.getA().getY()==c2.getA().getY()&&
           c1.getB().getX()==c2.getB().getX()&&c1.getB().getY()==c2.getB().getY()&&
           c1.getC().getX()==c2.getC().getX()&&c1.getC().getY()==c2.getC().getY())
        {
            return true;
        }
        else
        return false;
    }
    public static void deleteSameShape(Shape s1, Shape s2){
        for(int i=0;i<s1.circle.size();i++){
            for (int j = 0; j < s2.circle.size(); j++){
               if(checkCircle(s1.circle.get(i),s2.circle.get(j))){
                   s1.circle.remove(i);
               }
            }
        }
        for(int i=0;i<s1.triangle.size();i++){
            for (int j = 0; j < s2.triangle.size(); j++){
               if(checkTriangle(s1.triangle.get(i),s2.triangle.get(j))){
                   s1.triangle.remove(i);
               }
            }
        }
        for(int i=0;i<s1.square.size();i++){
            for (int j = 0; j < s2.square.size(); j++){
               if(checkSquare(s1.square.get(i),s2.square.get(j))){
                   s1.square.remove(i);
               }
            }
        }
        for(int i=0;i<s1.rectangle.size();i++){
            for (int j = 0; j < s2.rectangle.size(); j++){
               if(checkRectangle(s1.rectangle.get(i),s2.rectangle.get(j))){
                   s1.rectangle.remove(i);
               }
            }
        }
    }
}

