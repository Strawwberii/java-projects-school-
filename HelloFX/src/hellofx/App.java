/*HelloFx - application that contains a circle whose size can be controlled by the 
 * slider and the color can be changed using radio buttons. 
 * 
 * COMP 1231
 * Assignment 5
 * Rupok Ghosh Adin (T00716058)
 */

package hellofx;

import javafx.application.Application;
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
        header.setStyle("-fx-font-weight: bold;");
        topBox.getChildren().add(header);

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
        warningText.setFill(Color.RED);
        bottomBox.getChildren().addAll(sizeSlider, warningText);
        
        // Sound effect if tap anywhere else (couldn't find proper syntax for it)
        /*Idea: use setOnMouseClicked() on borderPane to check 
         * if the mouseclick is on any of the radiobuttons/slider or outside. 
         * if the mouseclick is on radiobuttons and slider then don't do anything
         * or else play the sound. 
        */

        // Add everything to the main layout

        borderPane.setTop(topBox);
        borderPane.setLeft(buttonBox);
        borderPane.setCenter(circleContainer);
        borderPane.setBottom(bottomBox);

        // Set scene

        Scene scene = new Scene(borderPane, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
        
}