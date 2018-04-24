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
public class EXP_ID2 implements EXP_ID{
    
    Expression left_expression;
    Expression right_expression;
    
    public EXP_ID2(Expression left_expression, Expression right_expression)
    {
        this.left_expression = left_expression;
        this.right_expression = right_expression;
    }
    
    @Override
    public String getValue() {
        return " [ " + left_expression.getValue() + " ] = " + right_expression.getValue() + " ; ";
    }
    
}
