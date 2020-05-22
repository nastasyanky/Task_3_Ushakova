package Pains;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle_R implements Shape {
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.PINK);
        gr.strokeRect(120,50,75,150);
    }
}
