package Kaleidoscope;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Random;

import static javafx.application.Application.launch;

public class Kaleidoscope extends Application{
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
    private static final int RECT_SQUARE = 100;
    Circle circle;
    Image im;
    Random random;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFont(Font.font(12));
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, WIDTH, HEIGHT);
        gc.setStroke(Color.WHITE);

        for (int n = 1; n <13; n++ ){

            im = new Image("Kaleidoscope/images/image"+n+".jpg", false);

        }



        for (int i = 0; i < WIDTH; i += RECT_SQUARE) {

            for (int j = 0; j < HEIGHT; j += RECT_SQUARE) {
                gc.strokeRect(i, j, RECT_SQUARE, RECT_SQUARE);
                gc.setFill(new ImagePattern(im));

                //gc.setFill(Color.WHITE);
                gc.fillOval(i,j,99,99);
                //gc.setFill(Color.WHITE);





            }

        }






        stage.setScene(new Scene(new StackPane(canvas), WIDTH, HEIGHT));
        stage.setTitle("Coordinate System demonstration");
        stage.show();
    }
}
