
public class MainFunction {
	public static void main(String []args) {
	
	BlanketAction action=new BlanketAction();
	BlanketState state=new BlanketState();
	action.setCommand(state::fold);
	action.usingBlanket();
	action.setCommand(state::unfold);
	action.usingBlanket();
	
}
}

