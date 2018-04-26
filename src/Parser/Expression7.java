package Parser;

public class Expression7 implements Parser.Expression{

	Beta beta;
	new_term  newterm;
	
	public Expression7(Beta beta , new_term newterm) {
		this.beta = beta;
		this.newterm = newterm;
	}
	
	@Override
	public String getValue() {
		
		return "new" + newterm.getValue() + beta.getValue() ;
	}

}
