package com.karyl.Map;

import com.karyl.Entity.Boat;
import com.karyl.Entity.Coord;

public class Grid {
  private int maxWidth;
  private int maxHeight;
  public Grid(int width, int height) {
    this.maxWidth = width;
    this.maxHeight = height;
  }

  public boolean isOutOfMap(Boat boat) {
    Boolean isOutOfMap = false;
    for(Coord pos : boat.getPosition()) {
      System.out.println("x: " + pos.getX() + " y: " + pos.getY());
      if(pos.getY() > maxHeight || pos.getY() < 0 || pos.getX() > maxWidth || pos.getX() < 0)
        isOutOfMap = true;
    }
    return isOutOfMap;
  }
}
