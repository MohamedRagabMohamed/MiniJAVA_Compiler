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
public class Kind1 implements Kind {

    final String INT = "int";
    final String BOOLEAN = "boolean";
    final String FLOAT = "float";
    final String STRING = "String";
    final String CHAR = "char";
    String value;

    public Kind1(String value) {
        if (value.equals(INT)) {
            this.value = INT;
        } else if (value.equals(BOOLEAN)) {
            this.value = BOOLEAN;
        } else if (value.equals(STRING)) {
            this.value = STRING;
        } else if (value.equals(FLOAT)) {
            this.value = FLOAT;
        } else if (value.equals(CHAR)) {
            this.value = CHAR;
        } else {
            this.value = "error";
        }

    }

    @Override
    public String getValue() {
        return value;

    }

}
