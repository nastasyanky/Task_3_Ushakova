package Pains;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle_R implements Shape{
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.BLUE);
        gr.strokeLine(70,150,170,150);
        gr.strokeLine(70,150,120,100);
        gr.strokeLine(170,150,120,100);

    }
}
