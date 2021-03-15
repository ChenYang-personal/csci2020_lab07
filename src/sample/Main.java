package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.PieChart;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Main extends Application {
    @Override
    public void start(Stage stage) {
        //Preparing ObservbleList object
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("FLASH FLOOD", 45),
                new PieChart.Data("SEVERE THUNDERSTORM", 140),
                new PieChart.Data("SPECIAL MARINE", 18),
                new PieChart.Data("TORNADO", 12));

        //Creating a Pie chart
        PieChart pieChart = new PieChart(pieChartData);


        //setting the direction to arrange the data
        pieChart.setClockwise(true);

        //Setting the length of the label line
        pieChart.setLabelLineLength(50);

        //Setting the labels of the pie chart visible
        pieChart.setLabelsVisible(true);


        //Creating a Group object
        Group root = new Group(pieChart);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 400);

        //Setting title to the Stage
        stage.setTitle("Lab 07");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
