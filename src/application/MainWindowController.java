package application;
import java.text.DecimalFormat;

import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.ListView.EditEvent;
import javafx.fxml.FXML;
public class MainWindowController {
	@FXML private Label display;
	@FXML private Button ac ,  conversion;
	private Boolean [] operator = new Boolean [4];
	private double [] temporary = {0,0};
private Main main ;
DecimalFormat df = new DecimalFormat("###.######");

public void setMain (Main main) {
	this.main=main;
	for(int i = 0 ; i<4 ; i++) {
		operator[i]=false ;
	}
}
@FXML
public void operatorPressed(Event event) {
	Button btn = (Button) event.getSource();
	
	temporary [0] = Double.parseDouble(display.getText());
	
	switch (btn.getId()) {
	case "plus":
		operator[1]=true;
		break;
		case "minus":
			operator[2]=true;
			break;
			case "times":
				operator[3]=true;
				break;
				case "divided":
					operator[4]=true;
					break;
}
	display.setText("");
	}

public void buttonPressed(Event event) {
	   Button btn = (Button) event.getSource();
	   if(display.getText().equals("0")) {
		   
		ac.setText("C");
		display.setText("");
	   }
	 

	switch (btn.getId()) {
	case "one":
		display.setText(display.getText()+"1");
		break;
		case "two":
			display.setText(display.getText()+"2");
			break;
			case "three":
				display.setText(display.getText()+"3");
				break;
				case "four":
					display.setText(display.getText()+"4");
					break;
					case "five":
						display.setText(display.getText()+"5");
						break;
						case "six":
							display.setText(display.getText()+"6");
							break;
							case "seven":
								display.setText(display.getText()+"7");
								break;
								case "eight":
									display.setText(display.getText()+"8");
									break;
									case "nine":
										display.setText(display.getText()+"9");
										break;
									     case "zero":
										     display.setText(display.getText()+"0");
										     break;
									          case "comma":
									     	     display.setText(display.getText()+".");
										          break;
									        
										          
	}
}

public void delete() {
	ac.setText("AC");
	display.setText("0");
	for(int i = 0 ; i<2 ; i++) {
		temporary[i]=0 ;
	}
	for(int i = 0 ; i<4 ; i++) {
		operator[i]=false ;
	}

}

public void result() {
	double result = 0 ;
	temporary [1] = Double.parseDouble(display.getText());
	if(operator[1]) {
		result = temporary[0] + temporary[1];
	}
	else if(operator[2]) {
		result = temporary[0] - temporary[1];
	}
	else if(operator[3]) {
		result = temporary[0] * temporary[1];
	}
	else if(operator[4]) {
		result = temporary[0] / temporary[1];
	}
	 
	display.setText(df.format(result));

	
}
public void conversion() {
	if(!display.getText().equals("0")) {
	double value = Double.parseDouble(display.getText());
	value *= -1 ;
	display.setText(df.format(value));
	}
	
}
public void percent() {
	double value = Double.parseDouble(display.getText());
	value *= 0.01 ;
	display.setText(df.format(value));
	
	
	
	
}


}
