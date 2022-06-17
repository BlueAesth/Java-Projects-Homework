//import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;

/*
Amber Janosh
CS249
Assignment Ten
Chapter 16 Program 13

(pg 708) (Compare loans with various interest rates) Rewrite Programming Exercise
5.21 to create a GUI, as shown in Figure 16.41b. Your program should let the
user enter the loan amount and loan period in the number of years from text
fields, and it should display the monthly and total payments for each interest
rate starting from 5% to 8%, with increments of one-eighth, in a text area.

5.21
(Financial application: compare loans with various interest rates) Write a program
that lets the user enter the loan amount and loan period in number of years,
and displays the monthly and total payments for each interest rate starting from
5% to 8%, with an increment of 1/8. Here is a sample run:
loan Amount: 10000
Number of Years: 5
Interest Rate Monthly Payment Total Payment
5.000%  188.71  11322.74
5.125%  189.29  11357.13
5.250%  189.86  11391.59
...
7.875%  202.17  12129.97
8.000%  202.76  12165.84
 */
public class Ch16Prog13 extends Application {

    protected TextField loan = new TextField();
    protected TextField years = new TextField();
    protected TextArea textA = new TextArea();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button show = new Button("Show");

        HBox ctrl = new HBox(10);
        ctrl.setAlignment(Pos.CENTER);
        ctrl.getChildren().addAll(new Label("Loan"), loan,
                new Label("Years"), years, show);

        BorderPane pane = new BorderPane();
        pane.setTop(ctrl);
        pane.setCenter(textA);

        show.setOnAction(e -> printTable()); //This is weiiiiird.

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Loan Amounts in a Table!~");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void printTable() {
        double monthlyPayment;
        double monthlyIR;

        String header = "Interest Rate(IR)       Monthly Payment          Total\n";

        for (double i = 5.0; i <= 8; i += 0.125) {
            monthlyIR = i / 1200;
            monthlyPayment = Double.parseDouble(loan.getText()) *
                    monthlyIR / (1 - 1 / Math.pow(1 + monthlyIR,
                    Double.parseDouble(years.getText()) * 12));

            header += String.format("%-24.3f%-34.2f%-8.2f\n", i,
                    monthlyPayment, (monthlyPayment * 12) *
                            Double.parseDouble(years.getText()));
        }

        textA.setText(header);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}

