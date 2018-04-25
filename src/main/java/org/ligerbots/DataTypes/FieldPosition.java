package org.ligerbots.DataTypes;
import java.util.*;
import java.util.function.Function;
import edu.wpi.first.shuffleboard.api.data.ComplexDataType;
public final class FieldPosition extends  edu.wpi.first.shuffleboard.api.data.ComplexData<FieldPosition> {

  private final double x;
  private final double y;

  public FieldPosition(double x, double y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public Map<String, Object> asMap() {
    Map<String, Object> map = new HashMap<>();
    map.put("x", this.x);
    map.put("y", this.y);
    return map;

    // could also be:
    // return Maps.<String, Object>builder()
    //    .put("x", this.x)
    //    .put("y", this.y)
    //    .build();
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public FieldPosition withX(double newX) {
    return new FieldPosition(newX, this.y);
  }

  public FieldPosition withY(double newY) {
    return new FieldPosition(this.x, newY);
  }

  // equals, hashcode omitted for brevity

}