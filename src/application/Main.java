package application;
	
import controller.Stock;
import javafx.application.Application;
import javafx.stage.Stage;
import view.FArticle;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stock stk = new Stock();
			primaryStage.setScene(new FArticle(stk,640,420));
			primaryStage.setTitle("Artigos");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
