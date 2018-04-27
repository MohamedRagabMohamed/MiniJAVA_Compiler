package Parser;

public class OP_binary1 implements Parser.OP_binary {

	final String DOUBLE_AND = "&&";
	final String DOUBLE_OR = "||";
	final String DOUBLE_EQUAL = "==";
	final String NOT_EQUAL = "!=";
	final String GRATER_THAN = ">";
	final String LESS_THAN = "<";
	final String GRATER_THAN_OR_EQUAL = ">=";
	final String LESS_THAN_OR_EQUAL = "<=";
	final String PLUS = "+";
	final String MINUS = "-";
	final String MULTIPLY = "*";
	final String DIVISION = "/";
	String value;

	public OP_binary1() {
		if (value.equals(DOUBLE_AND)) {
			this.value = DOUBLE_AND;
		} else if (value.equals(DOUBLE_OR)) {
			this.value = DOUBLE_OR;
		} else if (value.equals(DOUBLE_EQUAL)) {
			this.value = DOUBLE_EQUAL;
		} else if (value.equals(NOT_EQUAL)) {
			this.value = NOT_EQUAL;
		} else if (value.equals(GRATER_THAN)) {
			this.value = GRATER_THAN;
		} else if (value.equals(LESS_THAN)) {
			this.value = LESS_THAN;
		} else if (value.equals(GRATER_THAN_OR_EQUAL)) {
			this.value = GRATER_THAN_OR_EQUAL;
		} else if (value.equals(LESS_THAN_OR_EQUAL)) {
			this.value = LESS_THAN_OR_EQUAL;
		} else if (value.equals(PLUS)) {
			this.value = PLUS;
		} else if (value.equals(MINUS)) {
			this.value = MINUS;
		} else if (value.equals(MULTIPLY)) {
			this.value = MULTIPLY;
		} else if (value.equals(DIVISION)) {
			this.value = DIVISION;
		}
	}

	@Override
	public String getValue() {
		return this.value;
	}

}
