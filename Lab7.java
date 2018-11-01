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
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point A = new Point(0,0);
        Point B = new Point(0,2);
        Point C = new Point(4,0);
        Point O = new Point(0,0);
        Shape c = new Circle(O,1,"red");
        Shape s = new Square(2,A,"yellow");
        Shape t = new Triangle(A,B,C,"blue");
        Shape r = new Rectangle(1,2,A,"black");
        Shape h = new Hexagon("blue" ,O,1.0,1.2);
        Shape c1 = new Circle(O,2,"red");
        Shape s1 = new Square(2,A,"yellow");
        Shape t1 = new Triangle(A,B,C,"blue");
        Shape r1 = new Rectangle(1,2,A,"black");
        Shape h1 = new Hexagon("blue" ,O,1.0,1.2);
        Diagram d = new Diagram();
        
        Layer layer1 = new Layer();
        layer1.addShape(t);
        layer1.addShape(c);
        layer1.addShape(r);
        layer1.addShape(s);
        layer1.addShape(h);
       
        Diagram diagram = new Diagram();
        diagram.addLayer(layer1);
        
        diagram.Show();
        layer1.setVisible(false);
        diagram.Show();
       
        //test xoa trung trong layer
        
        layer1.showShape();
        layer1.deleteSameShape(c, c1);
        
        //test gop layer
       
        layer1.setVisible(true);
        diagram.Show();
        diagram.InsertToLayer();
        diagram.Show();
     
    } 
    
    
}
