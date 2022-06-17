package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://192.168.1.18:3306/MTGDB/listcard",
                    "blue", "SpaceWave_09");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

        Statement stmt = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        String strSelect = "select\n" +
                "    c.name\n" +
                "from\n" +
                "    cards c;";
        ResultSet cName = null;
        try {
            cName = stmt.executeQuery(strSelect);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            String cardName = cName.getString("name");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        while (cName.next()){
            String name = cName.getString("name");
            System.out.println(name);
        }

        //launch(args);
    }
}
