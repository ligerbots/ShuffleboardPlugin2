package org.ligerbots.DataTypes;
import java.util.*;
import java.util.function.Function;
public final class FieldPositionDataType extends  edu.wpi.first.shuffleboard.api.data.ComplexDataType<FieldPosition> {

  private static final String NAME = "FieldPosition";

  public FieldPositionDataType() {
    super(NAME, FieldPosition.class);
  }

  @Override
  public Function<Map<String, Object>, FieldPosition> fromMap() {
    return map -> {
      return new FieldPosition((double) map.getOrDefault("x", 0.0), (double) map.getOrDefault("y", 0.0));
    };
  }

  @Override
  public FieldPosition getDefaultValue() {
    // use default values of 0 for X and Y coordinate
    return new FieldPosition(0, 0);
  }

}