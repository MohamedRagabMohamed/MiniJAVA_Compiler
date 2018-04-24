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
public class Statement4 implements Statement{
    
    Expression expression;
    
    
    public Statement4(Expression expression)
    {
        this.expression = expression;
    }
    
    @Override
    public String getValue() {
        return " System.out.println ( " + expression.getValue() + " ) ; ";
    }
}
