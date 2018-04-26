package Parser;

public class Expression5 implements Parser.Expression{

	Beta beta;
	Identifier identifier;
	
	public Expression5(Beta beta ,Identifier identifier ) {
		this.beta = beta;
		this.identifier = identifier;
	}
	
	@Override
	public String getValue() {
		
		return identifier.getValue() + beta.getValue() ;
	}

}
