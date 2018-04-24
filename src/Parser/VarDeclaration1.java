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
public class VarDeclaration1 implements VarDeclaration {

    Type type;
    Identifier identifier;

    public VarDeclaration1(Type type, Identifier identifier) {
        this.type = type;
        this.identifier = identifier;
    }

    @Override
    public String getValue() {
        return type.getValue() + " " + identifier.getValue() + ";";
    }
}
