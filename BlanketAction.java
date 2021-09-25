
public class BlanketAction {
	
	Command useBlanket;
	public BlanketAction() {
	}
	
	public void setCommand(Command command) {
		useBlanket=command;
	}
	public void usingBlanket() {
		useBlanket.execute();
	}	

}

