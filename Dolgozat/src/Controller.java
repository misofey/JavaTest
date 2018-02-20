import java.util.ArrayList;

public class Controller {
	
	private ArrayList<Button> buttons;
	
	public Controller() {
		// TODO Auto-generated constructor stub
		buttons = new ArrayList<>();
	}
	
	public void addButton(Button b) {
		buttons.add(b);
	}
	
	public void pressAll() {
		for (Button button : buttons) {
			button.setState(true);
		}
	}
	
	public void releaseAll() {
		for (Button button : buttons) {
			button.setState(false);
		}
	}
	
	public int getNumOfPressedBtns() {
		int i =0;
		for (Button button : buttons) {
			if(button.getState()) {
				i++;
			}
		}
		return i;
	}
	
	
}
