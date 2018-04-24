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
public class Statement2 implements Statement{
    
    Expression expression;
    Statement statement;
    ELSE_STAT else_stat;
    
    
    public Statement2(Expression expression, Statement statement, ELSE_STAT else_stat)
    {
        this.expression = expression;
        this.statement = statement;
        this.else_stat = else_stat;
    }
    
    @Override
    public String getValue() {
        return "if ( " + expression.getValue() + " ) " + statement.getValue() + " " + else_stat.getValue();
    }
}
