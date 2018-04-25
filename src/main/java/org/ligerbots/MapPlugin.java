package org.ligerbots;

import java.util.List;

import org.ligerbots.Widgets.MapWidget;
import org.ligerbots.DataTypes.*;
import com.google.common.collect.ImmutableList;

import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;


@Description(group = "org.ligerbots", name = "Map Plugin", version = "1.0.0",
    summary = "Map Plugin")



public class MapPlugin extends edu.wpi.first.shuffleboard.api.plugin.Plugin {

 	/*@Override
  	public List<DataType> getDataTypes() {
   	 return ImmutableList.of(new FieldPositionDataType());
  	}*/

	public MapPlugin() {
		super();
		
	}
	public List<ComponentType> getComponents() {
    		return ImmutableList.of(
      			WidgetType.forAnnotatedWidget(MapWidget.class)
    		);
  	}
}
