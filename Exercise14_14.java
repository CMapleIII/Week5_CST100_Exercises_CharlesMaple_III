/** Display a Rectanguloid
*File: Exercise14_14.java
*Summary: Displays a rectanguloid 
*that grows and shrinks as the window 
*grows or shrinks.
*Author: Charles Maple III
*Date: July 23, 2016
**/

import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise14_14 extends Application 
{
    @Override
    public void start(Stage stage) 
    {
        double width = 600, height = 400;
        Pane pane = new ShapePane();
        Scene scene = new Scene(pane, width, height);
        scene.setFill(Color.BLUE);
        stage.setTitle("Exercise14_14");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.show();
    }

    private class ShapePane extends Pane 
    {
        ShapePane() 
        {
            double margin = 20, extent = 0.8;

            Rectangle rec2 = new Rectangle(0, 0, Color.CRIMSON);
            rec2.xProperty().bind(this.widthProperty().multiply(1-extent).subtract(margin));
            rec2.yProperty().bind(new SimpleDoubleProperty(margin));
            rec2.widthProperty().bind(this.widthProperty().multiply(extent));
            rec2.heightProperty().bind(this.heightProperty().multiply(extent));
            rec2.setStroke(Color.BLACK);
            
            Rectangle rec1 = new Rectangle();
            rec1.xProperty().bind(new SimpleDoubleProperty(margin));
            rec1.yProperty().bind(this.heightProperty().multiply(1-extent).subtract(margin));
            rec1.widthProperty().bind(this.widthProperty().multiply(extent));
            rec1.heightProperty().bind(this.heightProperty().multiply(extent));
            rec1.setStroke(Color.BLACK);

            Line line1 = new Line();
            line1.startXProperty().bind(rec1.xProperty());
            line1.startYProperty().bind(rec1.yProperty());
            line1.endXProperty().bind(rec2.xProperty());
            line1.endYProperty().bind(rec2.yProperty());

            Line line2 = new Line();
            line2.startXProperty().bind(rec1.xProperty());
            line2.startYProperty().bind(rec1.yProperty().add(rec1.heightProperty()));
            line2.endXProperty().bind(rec2.xProperty());
            line2.endYProperty().bind(rec2.yProperty().add(rec2.heightProperty()));

            Line line3 = new Line();
            line3.startXProperty().bind(rec1.xProperty().add(rec1.widthProperty()));
            line3.startYProperty().bind(rec1.yProperty().add(rec1.heightProperty()));
            line3.endXProperty().bind(rec2.xProperty().add(rec2.widthProperty()));
            line3.endYProperty().bind(rec2.yProperty().add(rec2.heightProperty()));

            Line line4 = new Line();
            line4.startXProperty().bind(rec1.xProperty().add(rec1.widthProperty()));
            line4.startYProperty().bind(rec1.yProperty());
            line4.endXProperty().bind(rec2.xProperty().add(rec2.widthProperty()));
            line4.endYProperty().bind(rec2.yProperty());

            this.getChildren().addAll(rec2, rec1, line1, line2, line3, line4);
        }
    }
}