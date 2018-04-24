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
public class Bracket1 implements Bracket{

     final String bracket= "[ ]";
     final String non="";
     String value;
    public Bracket1(String value) {
        if ("".equals(value)){
        this.value=non;
        }
        else if ("[ ]".equals(value)){
        this.value=bracket;
        }
    }
     
    @Override
    public String getValue() {
        return value;
    }
    
}
