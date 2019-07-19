package interpreter;
/**
 *
 * @author david
 */
public class IntToBinaryExpression extends Expression{
    	private int i;
	
	public IntToBinaryExpression(int c){
		this.i=c;
	}
	@Override
	public String interpret(InterpreterContext ic) {
		return ic.getBinaryFormat(this.i);
        }
}