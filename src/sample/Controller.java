package sample;

import Pains.Shape;
import Pains.Shape_Factory;
import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodTextRun;

import java.util.Objects;


public class Controller {
    public Canvas canvas;
    public Button button_1;
    public TextField tx_f;



    public void addPicker(ActionEvent actionEvent) {
        GraphicsContext gr = canvas.getGraphicsContext2D();


         if(Objects.equals(tx_f.getText(), "A")
                 ||Objects.equals(tx_f.getText(), "E")
                 ||Objects.equals(tx_f.getText(), "G")
                 ||Objects.equals(tx_f.getText(), "M")
                 ||Objects.equals(tx_f.getText(), "S")){

             String stringOfSides = tx_f.getText();
             Shape_Factory shapeFactory = new Shape_Factory();
             Shape shape1 = shapeFactory.createShape(stringOfSides);
             gr.clearRect(0, 0, 250, 495);
             shape1.draw(gr);
         }

        else
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Предупреждение:: ");
            alert.setHeaderText(null);
            alert.setContentText("Проверьте правильность введённой буквы и её регистр!");
            alert.showAndWait();
            return;
        }

}

}
