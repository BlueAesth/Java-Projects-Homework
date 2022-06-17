/*
Amber Janosh
CS249
Assignment Ten
Program 15.1

(Pick four cards) Write a program that lets the user click the Refresh button to
display four cards from a deck of 52 cards, as shown in Figure 15.26a. (See the
hint in Programming Exercise 14.3 on how to obtain four random cards.)
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Ch15Prog1 extends Application{

    @Override
    public void start(Stage primaryStage){
        Pane hBox = new HBox(10);
        hBox.setPadding(new Insets(5,5,5,5)); //Border padding;

        Button rfrsh = new Button("Refresh");
        HBox hBoxTwo = new HBox(rfrsh);
        hBoxTwo.setSpacing(10);
        hBoxTwo.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane(hBox);
        borderPane.setBottom(hBoxTwo);

        for(int i = 0; i < 4; i++) {
            String imagePath = RCG();

            Image image = new Image(imagePath);
            ImageView imageview = new ImageView(image);
            hBox.getChildren().add(imageview);
        }

        rfrsh.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hBox.getChildren().clear();
                for(int i = 0; i < 4; i++) {
                    String imagePath = RCG();

                    Image image = new Image(imagePath);
                    ImageView imageview = new ImageView(image);
                    hBox.getChildren().add(imageview);
                }
            }
        });

        Scene scene = new Scene(borderPane);
        primaryStage.setTitle("Four Cards @ Random w/Refresh");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public String RCG(){
        Random rand = new Random();
        int randBound = 53;

        String[] cards = new String[52];
        String cardPOS;

        for (int i = 0; i < cards.length; i++){
            cardPOS = String.valueOf(i+1);
            cards[i] = cardPOS;
        }

        int cardNum = rand.nextInt(randBound);
        String imagePath = "image/card/" + cards[cardNum] + ".png";

        return imagePath;
    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
