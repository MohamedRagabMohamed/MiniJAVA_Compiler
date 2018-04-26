package Parser;

public class Expression6 implements Parser.Expression{

Beta beta;
	
	public Expression6(Beta beta) {
		this.beta = beta;
	}
	
	@Override
	public String getValue() {
		
		return "this" + beta.getValue() ;
	}

}
