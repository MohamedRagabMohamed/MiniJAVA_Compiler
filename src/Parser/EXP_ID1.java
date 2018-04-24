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
public class EXP_ID1 implements EXP_ID{
    
    Expression expression;
    
    public EXP_ID1(Expression expression)
    {
        this.expression = expression;
    }
    
    @Override
    public String getValue() {
        return " = " + expression.getValue() + " ; ";
    }
    
}
