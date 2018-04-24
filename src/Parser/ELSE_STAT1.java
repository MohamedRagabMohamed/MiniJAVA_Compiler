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
public class ELSE_STAT1 implements ELSE_STAT{
    
    Statement statement;
    
    public ELSE_STAT1(Statement statement)
    {
        this.statement = statement;
    }
     
    @Override
    public String getValue() {
        return "else " + statement.getValue();
    }
    
}
