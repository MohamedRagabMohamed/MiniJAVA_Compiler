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
public class Statement1 implements Statement{
    Statement statement;
    
    public Statement1(Statement statement)
    {
        this.statement = statement;
    }
    
    @Override
    public String getValue() {
        return "{ ( " + statement.getValue() + " )* } ";
    }
    
}
