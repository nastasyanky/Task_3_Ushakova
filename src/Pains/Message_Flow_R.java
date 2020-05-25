package Pains;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Message_Flow_R implements Shape {
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.WHITE);
        gr.fillRect(10,10,500,500);
        gr.setLineDashes(2);
        gr.strokeLine(70,100,170,100);
        gr.strokeLine(170,100,168,103);
        gr.strokeLine(170,100,168,97);

    }
}
