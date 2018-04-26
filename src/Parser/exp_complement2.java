package Parser;

public class exp_complement2 implements Parser.exp_complement{

	Expression expression;
	
	public exp_complement2(Expression expression) {
		this.expression = expression;
	}
	
	
	@Override
	public String getValue() {
		return "[" + expression.getValue() + "]";
	}

}
