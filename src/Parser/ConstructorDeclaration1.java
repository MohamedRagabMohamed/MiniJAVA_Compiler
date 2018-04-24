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
public class ConstructorDeclaration1 implements ConstructorDeclaration{
    
    Type type;
    Identifier identifier;
    VarDeclaration varDeclaration;
    Statement statement;
    
    public ConstructorDeclaration1(Type type, Identifier identifier, VarDeclaration varDeclaration, Statement statement) {
        this.type = type;
        this.identifier = identifier;
        this.varDeclaration = varDeclaration;
        this.statement = statement;
    }
    
    @Override
    public String getValue() {
        return identifier.getValue() + " ( ( " + type.getValue() + " " + identifier.getValue() +
                " ( , " + type.getValue() + " " + identifier.getValue() + " )* )? ) " +
                "{ ( " + varDeclaration.getValue() + " )* ( " + statement.getValue() + " )* } ";
    }
}
