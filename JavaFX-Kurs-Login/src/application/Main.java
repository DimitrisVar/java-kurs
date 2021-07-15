package application;
	
import javafx.scene.*;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.PopupWindow;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
						
			Label loginLabel = new Label("Login");
			loginLabel.setTranslateX(20);
			loginLabel.setTranslateY(20);
			
			TextField eingabeBenutzername = new TextField("Name");
			eingabeBenutzername.setTranslateX(60);
			eingabeBenutzername.setTranslateY(60);
			eingabeBenutzername.setMaxHeight(100);
			eingabeBenutzername.setMaxWidth(100);
			
			PasswordField eingabePasswort = new PasswordField();
			eingabePasswort.setTranslateX(60);
			eingabePasswort.setTranslateY(100);
			eingabePasswort.setMaxSize(100, 100);
			
			Button loginButton = new Button("Klicken");
			loginButton.setTranslateX(80);
			loginButton.setTranslateY(140);
			
			// ==============================================
			//
			// ==============================================
			
			Group rootLogin = new Group();
			rootLogin.getChildren().add(loginLabel);
			rootLogin.getChildren().add(eingabeBenutzername);
			rootLogin.getChildren().add(eingabePasswort);
			rootLogin.getChildren().add(loginButton);
			
			Scene loginScene = new Scene(rootLogin, 400, 400);
			loginScene.setFill(Color.BEIGE);
			
			primaryStage.setScene(loginScene);
			primaryStage.show();
			primaryStage.setTitle("Login");
			
			// ==============================================
			//
			// ==============================================

			EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					String name = eingabeBenutzername.getText();
					String passwort = eingabePasswort.getText();
					
					if(name.equals("root") && passwort.equals("1234")) {
						Label label1 = new Label("Login erfolgreich");
						
						Stage stage = new Stage();
						HBox root = new HBox();
						root.getChildren().add(label1);
						
						Scene loginBereich = new Scene(root, 400, 400);
						
						stage.setScene(loginBereich);
						stage.show();
						
					} else {
						Label label1 = new Label("Login fehlgeschlagen");
						
						Stage stage = new Stage();
						HBox root = new HBox();
						root.getChildren().add(label1);
						
						Scene loginBereich = new Scene(root, 400, 400);
						
						stage.setScene(loginBereich);
						stage.show();
					}
					
				}
				
			};
			
			loginButton.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
			
			eingabePasswort.setOnKeyPressed(new EventHandler<KeyEvent>() {

				
				@Override
				public void handle(KeyEvent event) {
					
					if(event.getCode().equals(KeyCode.ENTER)) {
						String name = eingabeBenutzername.getText();
						String passwort = eingabePasswort.getText();
						
						if(name.equals("root") && passwort.equals("1234")) {
							Label label1 = new Label("Login erfolgreich");
							
							Stage stage = new Stage();
							HBox root = new HBox();
							root.getChildren().add(label1);
							
							Scene loginBereich = new Scene(root, 400, 400);
							
							stage.setScene(loginBereich);
							stage.show();
							
						} else {
							Label label1 = new Label("Login fehlgeschlagen");
							
							Stage stage = new Stage();
							HBox root = new HBox();
							root.getChildren().add(label1);
							
							Scene loginBereich = new Scene(root, 400, 400);
							
							stage.setScene(loginBereich);
							stage.show();
						}
					}
				}
			});
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) { 
		launch(args);
	}
}
