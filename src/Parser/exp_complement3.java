package Parser;

public class exp_complement3 implements Parser.exp_complement{

	term trm;
	
	public exp_complement3(term trm) {
		this.trm=trm;
	}
	
	@Override
	public String getValue() {
		return "." + trm.getValue();
	}

}
