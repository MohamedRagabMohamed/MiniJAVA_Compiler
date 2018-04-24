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
public class Statement3 implements Statement{
    
    Expression expression;
    Statement statement;
    
    
    public Statement3(Expression expression, Statement statement)
    {
        this.expression = expression;
        this.statement = statement;
    }
    
    @Override
    public String getValue() {
        return "while ( " + expression.getValue() + " ) " + statement.getValue();
    }
}
