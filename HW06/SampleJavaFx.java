import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SampleJavaFx extends Application {
    public void start(Stage primaryStage) {

        primaryStage.setScene(
                new Scene(new TextField("Hello World")));
        primaryStage.show();

//        StackPane stack = new StackPane();
//        stack.getChildren().addAll(
//                new Rectangle(100,100, Color.LIGHTBLUE),
//                new Label("Go!"));
//        primaryStage.setScene(new Scene(stack));
//        primaryStage.show();
    }

}
