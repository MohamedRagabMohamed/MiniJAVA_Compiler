/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser;

/**
 *
 * @author abdulaziz
 */
public class Goal1 implements parser.Goal{
    
    MainClass mainClass;
    ClassDeclaration classDeclaration;
  

    public Goal1(MainClass mainClass, ClassDeclaration classDeclaration) {
        this.mainClass = mainClass;
        this.classDeclaration = classDeclaration;
        
    }
    
    
    @Override
    public String getValue() {
        
        return mainClass.getValue()+"("+classDeclaration.getValue()+") * <EOF>";
    }
            
    
}
