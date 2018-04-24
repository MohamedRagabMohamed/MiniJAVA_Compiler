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
public class Type1 implements Type {

    Kind1 Kind;
    Bracket bracket;

    public Type1(Kind1 kind, Bracket bracket) {

        this.Kind = kind;
        this.bracket = bracket;

    }

    @Override

    public String getValue() {
        return Kind.getValue() + bracket.getValue();
    }

}
