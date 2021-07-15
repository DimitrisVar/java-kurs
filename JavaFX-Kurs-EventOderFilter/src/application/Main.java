package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Circle circle = new Circle(20);
			circle.setFill(Color.BLUE);
			circle.setTranslateX(200);
			circle.setTranslateY(200);
			
			Group root = new Group();
			root.getChildren().add(circle);
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			EventHandler<MouseEvent> eventHandler1 = new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					circle.setFill(Color.RED);
					System.out.println("Filter aufgerufen");
				}
			};
			
			EventHandler<MouseEvent> eventHandler2 = new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					circle.setScaleX(2);
					circle.setScaleY(2);
					System.out.println("Handler aufgerufen");
					
				}
			};
			
			circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler1);
			circle.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler2);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
