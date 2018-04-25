package org.ligerbots.Widgets;

import org.ligerbots.DataTypes.*;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.sources.DataSource;
import edu.wpi.first.shuffleboard.api.sources.SubSource;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import edu.wpi.first.shuffleboard.api.widget.Widget;

import java.util.Collection;
import java.util.function.BiFunction;
import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;

import javafx.scene.layout.Region;
import javafx.scene.layout.Pane;
 
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage; 



@Description(name = "MapWidget", dataTypes = {double[].class})
public class MapWidget extends SimpleAnnotatedWidget {
	private void initialize() {
		//overrideWidgetSize(4, 3);
	}
	int y, x;
	
	public void setCirclePosition(double x, double y) {
		this.y = (int)((y * 119.0) / 161.5) -119;
		this.x = (int)((x*217.0) / 648) - 217;
	}
	public Pane getView() {
		final double data[] = (double[])(getData());
		if (data != null) {
			if (data.length == 2) {
				setCirclePosition(data[0], data[1]);
			}
		}
		Image image = new Image("http://c1.staticflickr.com/1/894/41310108272_a65ef8bd62.jpg");
		ImageView view = new ImageView();
		view.setImage(image);
		Pane root = new Pane();
		Circle circle = new Circle(10,Color.BLUE);
     		circle.relocate(x-5, y-5);
		root.getChildren().addAll(view, circle);
		root.setPrefSize(500,500);
		return root;
        }
}
