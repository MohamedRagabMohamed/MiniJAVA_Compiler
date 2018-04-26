package Parser;

public class Expression2 implements Parser.Expression{

	Beta beta;
	
	public Expression2(Beta beta) {
		this.beta = beta;
	}
	
	@Override
	public String getValue() {
		
		return "<FLOAT_LITERAL>" + beta.getValue() ;
	}
}
