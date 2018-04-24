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
public class MethodDeclaration1 implements MethodDeclaration{
    Type type;
    Identifier identifier;
    VarDeclaration varDeclaration;
    Statement statement;
    Expression expression;

    public MethodDeclaration1(Type type, Identifier identifier, VarDeclaration varDeclaration, Statement statement, Expression expression) {
        this.type = type;
        this.identifier = identifier;
        this.varDeclaration = varDeclaration;
        this.statement = statement;
        this.expression = expression;
    }

    
    
    @Override
    public String getValue() {
        return "( public | private | protected ) " + type.getValue() + " " + identifier.getValue() +
               " ( ( " + type.getValue() + " " + identifier.getValue() + " ( , " + type.getValue() + " " + identifier.getValue() + ")* )? ) " +
                "{ ( " + varDeclaration.getValue() + " )* ( " + statement.getValue() + " )* return " + expression.getValue() + " ; } ";
    }
}
