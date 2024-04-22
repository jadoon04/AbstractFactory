/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author hp
 */
public class DoubleBorderShapeFactory extends AbstractFactory {
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new DoubleBorderRectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new DoubleBorderdSquare();
      }else if(shapeType.equalsIgnoreCase("TRIANGLE")){
         return new DoubleBorderdTriangle();
      }	 
      return null;
   }
}