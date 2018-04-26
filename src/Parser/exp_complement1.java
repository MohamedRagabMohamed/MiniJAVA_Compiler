package Parser;

public class exp_complement1 implements Parser.exp_complement{

	
	OP_binary op;
	Expression expression;
	
	public exp_complement1(OP_binary op ,Expression expression) {
		this.expression = expression;
		this.op=op;
	}
	
	
	@Override
	public String getValue() {
		return op.getValue() + expression.getValue();
	}

}
