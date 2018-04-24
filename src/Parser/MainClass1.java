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
public class MainClass1 implements MainClass {

    Identifier identifier;
    Statement statement;

    public MainClass1(Identifier identifier, Statement statement) {
        this.identifier = identifier;
        this.statement = statement;
    }

    @Override
    public String getValue() {

        return "class" + identifier.getValue() + "{ public static void main ( String[] " + identifier.getValue() + "){" + statement.getValue() + "}}";

    }

}
