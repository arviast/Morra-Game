import java.util.HashMap;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TheGameOfMorra extends Application {
	// client GUI data members
	private Pane instrPane;
	private Pane introPane, gamePane;
	private TextField ipField, portNum, guess;
	private Button loginButton, guessButton, f0but, f1but, f2but, f3but, f4but, f5but, playAgain, quit, fromInstr;
	private HBox introHbox, fingers, guessHbox;
	private VBox gameVbox,instrucBox;
	private EventHandler<ActionEvent> toTheGame, toTheInstr;
	private Text ip, port, instructions, instrucGuess, instr_text;
	private ImageView finger0, finger2, finger3, finger4, finger5, finger1;
	private ListView<String> listView;
	private Client clientConnection;

	// scene function for intro
	public Scene introScene() {
		ipField = new TextField("127.0.0.1");
		portNum = new TextField("5555");
		introHbox = new HBox(30,ipField, portNum);
		introHbox.setLayoutX(150);
		introHbox.setLayoutY(200);
		
		// login Button
		loginButton = new Button("Next");
		loginButton.setLayoutX(150);
		loginButton.setLayoutY(240);
		loginButton.setOnAction(toTheInstr);
		
		// intro Pane with background
		introPane = new Pane(introHbox, loginButton);
		Image image = new Image("background_intro.jpg");
		BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT,
												BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background = new Background(backgroundImage);
		introPane.setBackground(background);
		
		return new Scene(introPane,600,600);
	}
	
	public Scene instructionScene() {
		
		instr_text = new Text("~ There must be 2 players in order to play the game"+
							  "\n~ After 2 Player made their choice "
							  + "server will update with the results\n~ If both players guess right 0 points added\n"
							  + "~ 2 points for the win\n~ Good Luck !!!");
		instr_text.setFont(Font.font("Verdana", 15));
		fromInstr = new Button("Start");
		fromInstr.setOnAction(toTheGame);
		instrucBox = new VBox(50,instr_text,fromInstr);
		instrucBox.setLayoutX(70);
		instrucBox.setLayoutY(300);
		instrPane = new Pane(instrucBox);
		Image image = new Image("background_instr.jpg");
		BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT,
												BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background = new Background(backgroundImage);
		instrPane.setBackground(background);
		return new Scene(instrPane, 600,600);
	}
	
	// scene for game
	public Scene gameScene() {
		// ip and port display
		ip = new Text();
		ip.setFill(Color.WHITE);
		port = new Text();
		port.setFill(Color.WHITE);
		gameVbox = new VBox(5, ip, port);
		
		// instruction how to play game
		instructions = new Text("Choose your finger");
		instructions.setLayoutX(200);
		instructions.setLayoutY(100);
		instructions.setFill(Color.WHITE);
		instructions.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		
		// buttons with finger pictures
		finger0 = new ImageView("0.png");
		finger0.setFitHeight(100);
		finger0.setFitWidth(100);
		f0but = new Button();
		f0but.setGraphic(finger0);
		f0but.setStyle("-fx-background-color:transparent;");
		f0but.setOnAction(e-> {
			f1but.setDisable(true);
			f2but.setDisable(true);
			f3but.setDisable(true);
			f4but.setDisable(true);
			f5but.setDisable(true);
			clientConnection.mora.clientFingerChoose = 0;
		});
		
		finger1 = new ImageView("1.png");
		finger1.setFitHeight(100);
		finger1.setFitWidth(100);
		f1but = new Button();
		f1but.setGraphic(finger1);
		f1but.setStyle("-fx-background-color:transparent;");
		f1but.setOnAction(e-> {
			f0but.setDisable(true);
			f2but.setDisable(true);
			f3but.setDisable(true);
			f4but.setDisable(true);
			f5but.setDisable(true);
			clientConnection.mora.clientFingerChoose = 1;
		});
		
		finger2 = new ImageView("2.png");
		finger2.setFitHeight(100);
		finger2.setFitWidth(100);
		f2but = new Button();
		f2but.setGraphic(finger2);
		f2but.setStyle("-fx-background-color:transparent;");
		f2but.setOnAction(e-> {
			f0but.setDisable(true);
			f1but.setDisable(true);
			f3but.setDisable(true);
			f4but.setDisable(true);
			f5but.setDisable(true);
			clientConnection.mora.clientFingerChoose = 2;
		});
		
		finger3 = new ImageView("3.png");
		finger3.setFitHeight(100);
		finger3.setFitWidth(100);
		f3but = new Button();
		f3but.setGraphic(finger3);
		f3but.setStyle("-fx-background-color:transparent;");
		f3but.setOnAction(e-> {
			f0but.setDisable(true);
			f1but.setDisable(true);
			f2but.setDisable(true);
			f4but.setDisable(true);
			f5but.setDisable(true);
			clientConnection.mora.clientFingerChoose = 3;
		});
		
		finger4 = new ImageView("4.png");
		finger4.setFitHeight(100);
		finger4.setFitWidth(100);
		f4but = new Button();
		f4but.setGraphic(finger4);
		f4but.setStyle("-fx-background-color:transparent;");
		f4but.setOnAction(e-> {
			f0but.setDisable(true);
			f1but.setDisable(true);
			f2but.setDisable(true);
			f3but.setDisable(true);
			f5but.setDisable(true);
			clientConnection.mora.clientFingerChoose = 4;
		});
		
		finger5 = new ImageView("5.png");
		finger5.setFitHeight(100);
		finger5.setFitWidth(100);
		f5but = new Button();
		f5but.setGraphic(finger5);
		f5but.setStyle("-fx-background-color:transparent;");
		f5but.setOnAction(e-> {
			f0but.setDisable(true);
			f1but.setDisable(true);
			f2but.setDisable(true);
			f3but.setDisable(true);
			f4but.setDisable(true);
			clientConnection.mora.clientFingerChoose = 5;
			
		});
		
		fingers = new HBox(f0but, f1but, f2but, f3but, f4but, f5but);
		fingers.setLayoutY(130);
	
		// guess input
		instrucGuess = new Text("Input you guess below");
		instrucGuess.setLayoutY(280);
		instrucGuess.setLayoutX(170);
		instrucGuess.setFill(Color.WHITE);
		instrucGuess.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		
		guess = new TextField("0-10");		
		guessButton = new Button("Submit");
		
		// submit button event handler
		guessButton.setOnAction(e->{
			if(isValidPort(guess.getText())) {
				int temp = Integer.parseInt(guess.getText());
				if((temp > -1 && temp < 11) && (clientConnection.mora.clientFingerChoose != -1)) {
					clientConnection.mora.clientGuessChoose = temp;
					clientConnection.mora.clientToServerSent = true;
					guess.setText("Wait for the other player ...");
					guessButton.setDisable(true);
					playAgain.setDisable(false);
					quit.setDisable(false);
					clientConnection.send(clientConnection.mora);
				}
				else {
					guess.setText("It has to be 0-10");
				}
			}
		});
		
		// playAgain button event handler
		playAgain = new Button("Play Again");
		playAgain.setDisable(true);
		playAgain.setOnAction(e-> {
			clientConnection.mora = new MorraInfo();
			guess.setText("0-10");
			f0but.setDisable(false);
			f1but.setDisable(false);
			f2but.setDisable(false);
			f3but.setDisable(false);
			f4but.setDisable(false);
			f5but.setDisable(false);
			guessButton.setDisable(false);
			playAgain.setDisable(true);
			quit.setDisable(true);
		});
		
		// quit button event handler
		quit = new Button("Quit");
		quit.setDisable(true);
		quit.setOnAction(e->{
			System.exit(0);
		});
		
		guessHbox = new HBox(10, guess,guessButton, playAgain, quit);
		guessHbox.setLayoutX(120);
		guessHbox.setLayoutY(320);
		
		// listView to get messages from client
		listView = new ListView<>();
		listView.setLayoutY(350);
		listView.setLayoutX(180);
		listView.setPrefSize(300, 250);
		
		// main Pane with background
		gamePane = new Pane(gameVbox,fingers,instructions,instrucGuess,guessHbox, listView);
		Image image2 = new Image("background_game.png");
		BackgroundImage backgroundImage2 = new BackgroundImage(image2, BackgroundRepeat.NO_REPEAT,
												BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background2 = new Background(backgroundImage2);
		gamePane.setBackground(background2);
		
		return new Scene(gamePane,700,600);
	}
	
	// checks if number correct
	public boolean isValidPort(String port) {
		for(char x : port.toCharArray()) {
			if(!Character.isDigit(x)) {
				return false;
			}
		}
		return true;
	}
	
	// checks if Ip is correct
	public boolean isValidIP(String port) {
		for(char x : port.toCharArray()) {
			if((!Character.isDigit(x)) && x != '.') {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("(Client) Let's Play Morra!!!");
		
		HashMap<String,Scene> sceneMap = new HashMap<String,Scene>();
		
		sceneMap.put("game", gameScene());		
		// Login button event handler from intro scene
		toTheGame = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				ip.setText("Your IP: " + ipField.getText());
				port.setText("Your Port: " + portNum.getText());
				
				primaryStage.setScene(sceneMap.get("game"));
				clientConnection = new Client(data->{
					Platform.runLater(()->{
						listView.getItems().add(data.toString());
						
						// checking if Game is over
						int temp = listView.getItems().size();
						listView.scrollTo(temp);
						String temp1 = listView.getItems().get(temp-1);
						if(temp1.contains("GoodBye.")) {
							playAgain.setDisable(true);
						}
									});
					}, ipField.getText(), Integer.parseInt(portNum.getText()));
				
				clientConnection.start();
			}
		};
		
		sceneMap.put("instr", instructionScene());
		toTheInstr = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(isValidPort(portNum.getText()) && isValidIP(ipField.getText())) {
					primaryStage.setScene(sceneMap.get("instr"));
				}
				else {
					portNum.setText("Check Port Number");
					ipField.setText("Check IP number");
				}
			}
		};
		
		sceneMap.put("intro", introScene());
		primaryStage.setScene(sceneMap.get("intro"));
		primaryStage.show();
	}

}
