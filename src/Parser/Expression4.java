package Parser;

public class Expression4 implements Parser.Expression{

Beta beta;
	
	public Expression4(Beta beta) {
		this.beta = beta;
	}
	
	@Override
	public String getValue() {
		
		return "false" + beta.getValue() ;
	}

}
