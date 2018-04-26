package Parser;

public class Beta1 implements Parser.Beta{

	exp_complement exp;
	Beta beta;
	
	public Beta1(exp_complement exp , Beta beta) {
		this.beta=beta;
		this.exp=exp;
	}
	
	@Override
	public String getValue() {
		return exp.getValue() + beta.getValue();
	}

}
