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
public class ClassDeclaration1 implements ClassDeclaration{
    Identifier identifier;
    VarDeclaration varDeclaration;
    MethodDeclaration methodDeclaration;

    public ClassDeclaration1(Identifier identifier, VarDeclaration varDeclaration, MethodDeclaration methodDeclaration) {
        this.identifier = identifier;
        this.varDeclaration = varDeclaration;
        this.methodDeclaration = methodDeclaration;
    }
    
    
    @Override
    public String getValue() {
      
        return "class " + identifier.getValue() + " ( extends " + identifier.getValue() + " )? { ( " + varDeclaration.getValue() + " )* ( " + methodDeclaration.getValue() + " )* }";
    }
    
    
}
