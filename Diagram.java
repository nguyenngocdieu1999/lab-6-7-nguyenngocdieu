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
public class Diagram {
    public ArrayList<Layer> layer = new ArrayList<>();
    public void addLayer(Layer x ){
        layer.add(x);
    }
    public void deleteCircle(){
        for(int i = 0; i < layer.size(); ++i){
            layer.get(i).deleteCircle();
        }
    }
     public void deleteTriangle(){
        for(int i = 0; i < layer.size(); ++i){
            layer.get(i).deleteTriangle();
        }
    }
    public void Show(){
        int i = 1;
        for(Layer x: layer){
            if( x.isVisible() ) {
                System.out.println(i);
                x.showShape();
            }
            i++;
        }
    }
    public void InsertToLayer(){
        Layer layerCircle = new Layer();
        Layer layerRectangle = new Layer();
        Layer layerSquare = new Layer();
        Layer layerTriangle = new Layer();
        Layer layerHexagon = new Layer();
        for(Layer x: layer){
           for(Shape y: x.getShape()){
               if(y instanceof Circle ) layerCircle.addShape(y);
               else if( y instanceof Square) layerSquare.addShape(y);
               else if( y instanceof  Rectangle ) layerRectangle.addShape(y);
               else if ( y instanceof Triangle) layerTriangle.addShape(y);
               else if ( y instanceof Hexagon ) layerHexagon.addShape(y);
           }
        }
        layer.clear();
        if( !layerCircle.getShape().isEmpty()) layer.add(layerCircle);
        if( !layerRectangle.getShape().isEmpty()) layer.add(layerRectangle);
        if( !layerSquare.getShape().isEmpty()) layer.add(layerSquare);
        if( !layerTriangle.getShape().isEmpty()) layer.add(layerTriangle);
        if( !layerHexagon.getShape().isEmpty()) layer.add(layerHexagon);
    }
}
