package Pains;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Gateways_R implements Shape {
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.WHITE);
        gr.fillRect(10,10,500,500);
        gr.setLineDashes(1);
        gr.strokeLine(125,125,150,150);
        gr.strokeLine(150,150,175,125);
        gr.strokeLine(125,125,150,100);
        gr.strokeLine(150,100,175,125);
    }
}
