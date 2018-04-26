package Parser;

public class term2 implements Parser.term{

	Identifier identifier;
	Expression first;
	Expression second;
	@Override
	public String getValue() {
		return identifier.getValue() + "( ("+ first.getValue()+ "( ," + second.getValue()+" )* )? )";
	}

}
