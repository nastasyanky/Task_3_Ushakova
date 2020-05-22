package sample;

import Pains.Shape;
import Pains.Shape_Factory;
import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodTextRun;



public class Controller {
    public Canvas canvas;
    public Button button_1;
    public TextField tx_f;


    public void addPicker(ActionEvent actionEvent) {
        GraphicsContext gr = canvas.getGraphicsContext2D();

        if(  tx_f.getText().equals(""))
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Предупреждение: ");
            alert.setHeaderText(null);
            alert.setContentText("Введено нечисло или число не из диапазона от 0 до 4!");
            alert.showAndWait();
            return;
        }else {
            int numberOfSides = Integer.parseInt(tx_f.getText());
            Shape_Factory shapeFactory = new Shape_Factory();
            Shape shape1 = shapeFactory.createShape(numberOfSides);
            gr.clearRect(0, 0, 250, 485);
            shape1.draw(gr);
    }
}



}
