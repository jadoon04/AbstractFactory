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
public class RoundedShapeFactory extends AbstractFactry {

    RoundedShapeFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new RoundedRectangle();         
      }	 else if(shapeType.equalsIgnoreCase("Triangle")){
         return new RoundedTriangle();
      }	
      return null;
   }
}
