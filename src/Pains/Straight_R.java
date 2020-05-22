package Pains;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Straight_R implements Shape{
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.RED);
        gr.strokeLine(70,150,120,200);
    }
}
