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
public class Statement5 implements Statement{
    
    Identifier identifier;
    EXP_ID exp_id;
    
    
    public Statement5(Identifier identifier, EXP_ID exp_id)
    {
        this.identifier = identifier;
        this.exp_id = exp_id;
    }
    
    @Override
    public String getValue() {
        return identifier.getValue() + " " + exp_id.getValue();
    }
}
