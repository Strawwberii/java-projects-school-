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
import javafx.scene.layout.HBox;
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
    private ToggleGroup toggleGroup;
    private AudioClip warningSound;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Circle Color Changer");

        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 300);

        Text instructionText = new Text("Change the circle color using the radio buttons. " +
                "Change the scale of the circle between 0-100% using the slider");
        instructionText.setStyle("-fx-font-weight: bold;");

        toggleGroup = new ToggleGroup();
        RadioButton redRadio = new RadioButton("Red");
        redRadio.setToggleGroup(toggleGroup);
        RadioButton greenRadio = new RadioButton("Green");
        greenRadio.setToggleGroup(toggleGroup);
        RadioButton blueRadio = new RadioButton("Blue");
        blueRadio.setToggleGroup(toggleGroup);

        VBox radioBox = new VBox(10, redRadio, greenRadio, blueRadio);
        radioBox.setAlignment(Pos.CENTER_LEFT);

        circle = new Circle(100, Color.ORANGE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);

        sizeSlider = new Slider(0, 100, 25);
        sizeSlider.setShowTickLabels(true);
        sizeSlider.setShowTickMarks(true);
        sizeSlider.setMajorTickUnit(25);
        sizeSlider.setBlockIncrement(5);

        sizeSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                double newSize = newValue.doubleValue() / 100.0;
                circle.setRadius(50 * newSize);
            }
        });

        HBox controlsBox = new HBox(20, radioBox, circle, sizeSlider);
        controlsBox.setAlignment(Pos.CENTER);

        warningText = new Text("Select the radio buttons or the slider only. You'll hear a warning sound if the mouse is clicked elsewhere!");
        warningText.setStyle("-fx-fill: red;");

        root.setTop(instructionText);
        root.setCenter(controlsBox);
        root.setBottom(warningText);

        primaryStage.setScene(scene);
        primaryStage.show();

        // // Load the warning sound
        // warningSound = new AudioClip(getClass().getResource("warning.wav").toExternalForm());

        // scene.setOnMouseClicked(event -> {
        //     if (!isRadioSelected() && !isSliderSelected()) {
        //         // Play the warning sound when clicking elsewhere
        //         warningSound.play();
        //     }
        // });
    }

    private boolean isRadioSelected() {
        return toggleGroup.getSelectedToggle() != null;
    }

    private boolean isSliderSelected() {
        return sizeSlider.isFocused();
    }
}