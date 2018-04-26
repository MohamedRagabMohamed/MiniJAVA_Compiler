package Parser;

public class Expression3 implements Parser.Expression{

Beta beta;
	
	public Expression3(Beta beta) {
		this.beta = beta;
	}
	
	@Override
	public String getValue() {
		
		return "true" + beta.getValue() ;
	}

}
