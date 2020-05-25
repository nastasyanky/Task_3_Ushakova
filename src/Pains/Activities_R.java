package Pains;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Activities_R implements Shape{
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.WHITE);
        gr.setLineDashes(1);
        gr.fillRect(10,10,500,500);
        gr.strokeRoundRect(75,100,120,50,10,10);

    }
}
