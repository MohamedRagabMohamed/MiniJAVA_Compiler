package Parser;

public class Expression1 implements Parser.Expression{

	Beta beta;
	
	public Expression1(Beta beta) {
		this.beta = beta;
	}
	
	@Override
	public String getValue() {
		
		return "<INTEGER_LITERAL>" + beta.getValue() ;
	}

}
