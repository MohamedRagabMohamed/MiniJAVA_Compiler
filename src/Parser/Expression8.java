package Parser;

public class Expression8 implements Parser.Expression{

	Beta beta;
	Expression expression;
	
	public Expression8(Beta beta , Expression expression) {
		this.beta = beta;
		this.expression = expression;
	}
	
	@Override
	public String getValue() {
		
		return "!" + expression.getValue() + beta.getValue() ;
	}

}
