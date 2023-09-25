    package hellofx;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.media.AudioClip;

public class App extends Application {
    private Circle circle;
    private Slider sizeSlider;
    private Text warningText;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // main layout

        BorderPane borderPane = new BorderPane();
        primaryStage.setTitle("Changing Circle");
        
        // header

        VBox topBox = new VBox();
        topBox.setAlignment(Pos.CENTER);
        topBox.setSpacing(30);
        Text header = new Text();
        header.setText("Change the circle color using the radio buttons and the scale of the circle between 0-100% using the slider.");
        topBox.getChildren().add(header);
    
        // Body

        // Add radio buttons on the left

        VBox buttonBox = new VBox();

        ToggleGroup toggleGroup = new ToggleGroup();

        RadioButton radioOrange = new RadioButton("Orange");
        RadioButton radioYellow = new RadioButton("Yellow");
        RadioButton radioBlue = new RadioButton("Blue");

        radioOrange.setToggleGroup(toggleGroup);
        radioYellow.setToggleGroup(toggleGroup);
        radioBlue.setToggleGroup(toggleGroup);
        
        buttonBox.setSpacing(40);
        buttonBox.setAlignment(Pos.CENTER);

        // Add event handlers to radio buttons to change circle color
        radioOrange.setOnAction(event -> circle.setFill(Color.ORANGE));
        radioYellow.setOnAction(event -> circle.setFill(Color.YELLOW));
        radioBlue.setOnAction(event -> circle.setFill(Color.BLUE));

        buttonBox.getChildren().addAll(radioOrange,radioYellow,radioBlue);

        // Add circle on the center

        VBox circleContainer = new VBox();
        circle = new Circle(0,0,25, Color.ORANGE);
        circleContainer.setAlignment(Pos.CENTER);
        circleContainer.getChildren().addAll(circle);

        // Add slider and Warning Text on the bottom

        VBox bottomBox = new VBox();
        bottomBox.setAlignment(Pos.CENTER);

        sizeSlider = new Slider(0, 100, 25);

        // Add a change listener to the slider to update the circle size
        sizeSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            double newSize = newValue.doubleValue();
            circle.setRadius(newSize);
        });

        // Warning text
        warningText = new Text("Select the radio buttons or the slider only. You'll hear a warning sound if the mouse is clicked elsewhere!");

        bottomBox.getChildren().addAll(sizeSlider, warningText);
        
        // Sound effect if tap anywhere else
        

        // Add everything to the main layout
        borderPane.setTop(topBox);
        borderPane.setLeft(buttonBox);
        borderPane.setCenter(circleContainer);
        borderPane.setBottom(bottomBox);

        Scene scene = new Scene(borderPane, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
        
}