package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane borderPane = new BorderPane();

        new Thread(()->{
            Rectangle rectangle = new Rectangle(20, 20, 300, 630);
            rectangle.setFill(Color.WHITE);
            rectangle.setStroke(Color.BLACK);

            borderPane.setLeft(rectangle);
        }).start();

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(borderPane, 500, 630));
        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);
    }
}
