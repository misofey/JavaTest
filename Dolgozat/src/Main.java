
public class Main {

	public static void main(String[] args) {

		Controller ctr = new Controller();
		
		ctr.addButton(new Button("A", true));
		ctr.addButton(new Button("B", false));
		ctr.addButton(new Button("C", false));
		ctr.addButton(new Button("D", true));
		
		System.out.println("Number of pressed buttons: " + ctr.getNumOfPressedBtns());
		
		ctr.pressAll();
		
		System.out.println("Number of pressed buttons: " + ctr.getNumOfPressedBtns());
		
		ctr.releaseAll();
		
		System.out.println("Number of pressed buttons: " + ctr.getNumOfPressedBtns());	
	}

}
