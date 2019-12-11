package controler;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class ButtonHandler implements EventHandler<MouseEvent> {

	private Button buttonUsed;
	
	private Label result;
	
	public ButtonHandler(Button btn, Label lb){
		
		buttonUsed = btn;
		result = lb;
	}
	
	@Override
	public void handle(MouseEvent event) {

		if(event.getSource() == this.buttonUsed) {
			
			result.setText(result.getText() + buttonUsed.getText()); // A refactorer	
		}
		
	}

}
