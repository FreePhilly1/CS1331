import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
/**
 * Create Brochure class.
 * @author Phillip Kim
 * @version 1.0
 */
public class Brochure extends Application {
    /**
     * Main method that takes in 1 parameter.
     * @param args String array parameter that is entered in command line.
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Image image = new Image("dababy.jpg");
        ImageView imageView1 = new ImageView(image);
        imageView1.setFitHeight(200);
        imageView1.setFitWidth(200);
        imageView1.setX(200);
        imageView1.setY(200);

        Text text1 = new Text(100, 450, "At OOP-TOPIA you can find DaBaby. Let's Go!");
        text1.setFont(new Font(20));

        Text text2 = new Text(10, 30, "WELCOME TO OOP-TOPIA!");
        text2.setFont(new Font(30));
        text2.setFill(Color.WHITE);

        Rectangle rectangle1 = new Rectangle(0, 0, 400, 40);
        rectangle1.setFill(Color.BLUE);

        Circle circle1 = new Circle(100, 300, 50);
        Circle circle2 = new Circle(500, 300, 50);
        circle1.setFill(Color.GOLD);
        circle1.setStroke(Color.DARKTURQUOISE);
        circle2.setFill(Color.AQUA);
        circle2.setStroke(Color.GOLDENROD);

        pane.getChildren().add(text1);
        pane.getChildren().add(text2);
        pane.getChildren().add(imageView1);
        pane.getChildren().add(rectangle1);
        pane.getChildren().add(circle1);
        pane.getChildren().add(circle2);
        text2.toFront();

        Scene scene = new Scene(pane, 600, 600);
        primaryStage.setTitle("TravelBrochure");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}