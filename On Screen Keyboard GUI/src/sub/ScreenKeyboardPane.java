package sub;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 * 
 * @author Ravhudzulo Unarine Ernest
 * 
 * ScreenKeyboardPane is a Subclass of StackPane Class Layout
 * That make it a layout since it inherit from the StackPane
 *
 */
public class ScreenKeyboardPane extends StackPane {
	
	private BorderPane root;
	private FlowPane   flow;
	private VBox       vBox;
	private HBox       hBoxA;
	private HBox       hBoxB;
	private HBox       hBoxC;
	private HBox       hBoxD;
	private HBox       hBoxE;
	
	private Button[] numericButtons;
	private Button[] alphaNumericButtons;
	private Button[] lettersOfAlphaButtons1;
	private Button[] lettersOfAlphaButtons2;
	private Button[] lettersOfAlphaButtons3;
	private Button[] lettersOfAlphaButtons4;
	
	private TextArea displayArea;

	/*
	 * Default Constructor of ScreenKeyboardPane class
	 * Contain the BackEnd Development of the Application
	 */
	public ScreenKeyboardPane() {
		
		setUpGUI(); // Invoke setUpGUI method
		
		/*
		 * Make All the numeric Buttons Responsive when clicked
		 * Display the results in the TextArea
		 */
		for(int i = 1; i < numericButtons.length; i++) {
			
			int buttonText = i;
			
			// Numeric Button to respond when clicked
			numericButtons[i].setOnAction(e -> {
				
				displayArea.appendText(numericButtons[buttonText].getText());  //Print the number on text
				
			});
		}
		
		
		/*
		 * Make All the numeric and symbolic Buttons Responsive when clicked
		 * Display the results in the TextArea
		 */
		for(int i = 0; i < alphaNumericButtons.length - 1; i++) {
			
			int buttonText = i;
			alphaNumericButtons[i].setOnAction(e -> {            // Make Symbolic and numericic Buttons Responsive except BACKSPACE Button
				
				displayArea.appendText(alphaNumericButtons[buttonText].getText());    // Display the results on TextArea
				
			});
			
		}
		
		alphaNumericButtons[3].setOnAction(e -> {              // Make BACKSPACE Button Responsive
			
			displayArea.deletePreviousChar();	// Delete the previous Button	
			
		});
		
		alphaNumericButtons[1].setPadding(new Insets(20, 10, 20, 10));  // Adjust the size of the - Button
		alphaNumericButtons[2].setPadding(new Insets(20, 10, 20, 10));  // Adjust the size of the + Button
		
		
		/*
		 * Make All the Symbolic and Alphabetic Buttons Responsive when clicked
		 * Display the results in the TextArea
		 */
		for(int i = 0; i < lettersOfAlphaButtons1.length; i++) {
			
			int buttonText = i;
			lettersOfAlphaButtons1[i].setOnAction(e ->{             // Make Symbolic and Alphabetic Buttons Responsive except ENTER Button
				
				displayArea.appendText(lettersOfAlphaButtons1[buttonText].getText());    // Display the results on TextArea
				
			});
		}
		
		lettersOfAlphaButtons1[14].setPadding(new Insets(20, 15, 20, 15)); // Adjust the Size of the last Button
		
		
		/*
		 * Make All the Symbolic and Alphabetic Buttons Responsive when clicked
		 * Display the results in the TextArea
		 */
		for(int i = 0; i < lettersOfAlphaButtons2.length - 1; i++) {
			
			int buttonText = i;
			lettersOfAlphaButtons2[i].setOnAction(e ->{           // Make Symbolic and Alphabetic Buttons Responsive except ENTER Button
				
				displayArea.appendText(lettersOfAlphaButtons2[buttonText].getText());  
				
			});
		}
		
		lettersOfAlphaButtons2[11].setPadding(new Insets(20, 61, 20, 61));     // Adjust the size of the ENTER Button only
		
		lettersOfAlphaButtons2[11].setOnAction(e -> {            // Make CLEAR Button Responsive
			
			displayArea.appendText("\r\n");                   // Move to the next line in the textArea
			
		});
		
		
		/*
		 * Make All the Symbolic and Alphabetic Buttons Responsive when clicked
		 * Display the results in the TextArea
		 */
		for(int i = 1; i < lettersOfAlphaButtons3.length; i++) {
			
			int buttonText = i;
			lettersOfAlphaButtons3[i].setOnAction(e -> {      // Make Symbolic and Alphabetic Buttons Responsive except CLEAR Button
				
				displayArea.appendText(lettersOfAlphaButtons3[buttonText].getText());   // Display the results on TextArea
				
			});
		}
		
		lettersOfAlphaButtons3[0].setPadding(new Insets(20, 4, 20, 4)); // Adjust the size of the CLEAR Button only
		lettersOfAlphaButtons3[0].setOnAction(e ->{                     // Make CLEAR Button Responsive
			
			displayArea.setText("");    // Clear everything typed on the TextArea Scene
			
		});
		
		
		/*
		 * Make All the symbolic Buttons Responsive when clicked
		 * Display the results in the TextArea
		 */
		for(int i = 0; i < 8 || i < lettersOfAlphaButtons4.length; i++) {
			
			lettersOfAlphaButtons4[i].setPadding(new Insets(20, 10, 20, 10));   // Adjust the size of the Symbolic Buttons except Space Button
			
			int buttonText = i;
			lettersOfAlphaButtons4[i].setOnAction(e ->{                          // Make Symbolic Buttons Responsive except Space Button
				
				displayArea.appendText(lettersOfAlphaButtons4[buttonText].getText());   // Display the results on TextArea
				
			});
		}
		
		lettersOfAlphaButtons4[8].setPadding(new Insets(20, 20, 20, 20));    // Adjust the size of the SPACE Button
		lettersOfAlphaButtons4[8].setOnAction(e ->{                          // Make Space Button Responsive
			
			displayArea.appendText(" ");     // Provide the space between the current and the next Character
			
		});
		
	}
	
	/**
	 * SetUpGUI method is responsible for setting Interactive features for Users when invoked
	 * FRONT END DEVELOPMENT OF the Application
	 */
	private void setUpGUI() {
		
		// Instances of the layout
		root = new BorderPane();
		flow = new FlowPane();            flow.setAlignment(Pos.CENTER);         flow.setVgap(3);
		vBox = new VBox();                vBox.setAlignment(Pos.CENTER);         vBox.setPadding(new Insets(15, 15, 15, 15));  vBox.setStyle("-fx-background-color: GREY");
		hBoxA = new HBox(2);              hBoxA.setAlignment(Pos.TOP_CENTER);
		hBoxB = new HBox(2);              hBoxB.setAlignment(Pos.TOP_CENTER);
		hBoxC = new HBox(2);              hBoxC.setAlignment(Pos.TOP_CENTER);
		hBoxD = new HBox(2);              hBoxD.setAlignment(Pos.TOP_CENTER);
		hBoxE = new HBox(2);              hBoxE.setAlignment(Pos.TOP_CENTER);
		
		displayArea = new TextArea();  // Instance of TextArea
		
		// Instances of Arrays of Buttons
		numericButtons         = new Button[10];
		alphaNumericButtons    = new Button[4];
		lettersOfAlphaButtons1 = new Button[15];
		lettersOfAlphaButtons2 = new Button[12];
		lettersOfAlphaButtons3 = new Button[14];
		lettersOfAlphaButtons4 = new Button[18];
		Insets in = new Insets(20, 20, 20, 20);
		
		// Arrays of String Data Type for Naming Buttons
		String[] alphaNumericStr = {"0", "-", "+", "BACKSPACE"};
		String[] lettersOfAlpha1 = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "{", "}", "[", "]", "~"};
		String[] lettersOfAlpha2 = {"A", "S", "D", "F", "G", "H", "J", "K", "L", ":", ";", "ENTER"};
		String[] lettersOfAlpha3 = {"CLEAR", "Z", "X", "C", "V", "B", "N", "M", "<", ">", ".", ",", "`", "¬"};
		String[] symbolsStr      = {":", ";", "^", "#", "\\", "*", "/", "=", " \tSPACE      ", "!", "@", "£", "$", "%", "|", "&", "(", ")"};
		
		/*
		 * Instantiate all the Numeric Buttons(1, 2, 3,...,9) displayed in the Application
		 * Set the Colour, Font, size of the Button and Text
		 */
		for(int i = 1; i < numericButtons.length; i++) {
			
			numericButtons[i] = new Button(String.valueOf(i));    // Instantiate Button stored in Array
			numericButtons[i].setPadding(in);                     //Size of the Buttons is set
			numericButtons[i].setFont(Font.font("SansSerif", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 30)); // Set Font of the Button
			numericButtons[i].setStyle("-fx-background-color: BLACK");  // Set the Background Colour 
			numericButtons[i].setTextFill(Color.WHITE);                 // Set Text of the Colour
			
			hBoxA.getChildren().add(numericButtons[i]);  // Add the Buttons to the HBox layout
			
		}
		
		/*
		 * Instantiate all the Numeric Buttons(1, 2, 3,...,9) displayed in the Application
		 * Set the Colour, Font, size of the Button and Text
		 */
		for(int i = 0; i < alphaNumericButtons.length; i++) {
			
			alphaNumericButtons[i] = new Button(alphaNumericStr[i]);  // Instantiate Button stored in Array
			alphaNumericButtons[i].setPadding(in);
			alphaNumericButtons[i].setFont(Font.font("SansSerif", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 30));
			alphaNumericButtons[i].setStyle("-fx-background-color: BLACK");
			alphaNumericButtons[i].setTextFill(Color.WHITE);
			
			hBoxA.getChildren().add(alphaNumericButtons[i]);
			
		}
		
		/*
		 * Instantiate all the Numeric Buttons(1, 2, 3,...,9) displayed in the Application
		 * Set the Colour, Font, size of the Button and Text
		 */
		for(int i = 0; i < lettersOfAlpha1.length; i++) {
			
			lettersOfAlphaButtons1[i] = new Button(lettersOfAlpha1[i]);     // Instantiate Button stored in Array
			lettersOfAlphaButtons1[i].setPadding(in);
			lettersOfAlphaButtons1[i].setFont(Font.font("SansSerif", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 30));
			lettersOfAlphaButtons1[i].setStyle("-fx-background-color: BLACK");
			lettersOfAlphaButtons1[i].setTextFill(Color.WHITE);
			
			
			hBoxB.getChildren().add(lettersOfAlphaButtons1[i]);
		}
		
		/*
		 * Instantiate all the Numeric Buttons(1, 2, 3,...,9) displayed in the Application
		 * Set the Colour, Font, size of the Button and Text
		 */
		for(int i = 0; i < lettersOfAlpha2.length; i++) {
			
			lettersOfAlphaButtons2[i] = new Button(lettersOfAlpha2[i]);    // Instantiate Button stored in Array
			lettersOfAlphaButtons2[i].setPadding(in);
			lettersOfAlphaButtons2[i].setFont(Font.font("SansSerif", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 30));
			lettersOfAlphaButtons2[i].setStyle("-fx-background-color: BLACK");
			lettersOfAlphaButtons2[i].setTextFill(Color.WHITE);
			
			hBoxC.getChildren().add(lettersOfAlphaButtons2[i]);
		}
		
		/*
		 * Instantiate all the Numeric Buttons(1, 2, 3,...,9) displayed in the Application
		 * Set the Colour, Font, size of the Button and Text
		 */
		for(int i = 0; i < lettersOfAlpha3.length; i++) {
			
			lettersOfAlphaButtons3[i] = new Button(lettersOfAlpha3[i]);   // Instantiate Button stored in Array
			lettersOfAlphaButtons3[i].setPadding(in);
			lettersOfAlphaButtons3[i].setFont(Font.font("SansSerif", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 30));
			lettersOfAlphaButtons3[i].setStyle("-fx-background-color: BLACK");
			lettersOfAlphaButtons3[i].setTextFill(Color.WHITE);
			
			hBoxD.getChildren().add(lettersOfAlphaButtons3[i]);
		}
		
		/*
		 * Instantiate all the Numeric Buttons(1, 2, 3,...,9) displayed in the Application
		 * Set the Colour, Font, size of the Button and Text
		 */
		for(int i = 0; i < symbolsStr.length; i++) {
			 
			lettersOfAlphaButtons4[i] = new Button(symbolsStr[i]);         // Instantiate Button stored in Array 
			
			lettersOfAlphaButtons4[i].setFont(Font.font("SansSerif", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 30));
			lettersOfAlphaButtons4[i].setStyle("-fx-background-color: BLACK");
			lettersOfAlphaButtons4[i].setTextFill(Color.WHITE);
			
			hBoxE.getChildren().add(lettersOfAlphaButtons4[i]);
		}
		
		vBox.getChildren().add(displayArea);
		
		flow.getChildren().add(hBoxA);
		flow.getChildren().add(hBoxB);
		flow.getChildren().add(hBoxC);
		flow.getChildren().add(hBoxD);
		flow.getChildren().add(hBoxE);
		
		root.setTop(vBox);
		root.setCenter(flow);
		
		getChildren().add(root);
		
	}

}
