package com.karyl.Entity;

import java.util.ArrayList;
import java.util.List;

public class Coord {

  private int x;
  private int y;
  private List<Coord> position;

  public Coord(int x, int y) {
    this.x = x;
    this.y = y;
    this.position = new ArrayList<Coord>();
  }

  public Coord(Coord coord) {
    this.x = coord.getX();
    this.y = coord.getY();
    this.position = new ArrayList<Coord>();
  }

  public Coord setNextPosition(Direction model) {
    switch(model) {
      case NORTH:
        setX(getX());
        setY(getY() + 1);
        break;
      case EAST :
        setX(getX() + 1);
        setY(getY());
        break;
      case SOUTH:
        setX(getX());
        setY(getY() - 1);
        break;
      case WEST :
        setX(getX() - 1);
        setY(getY());
        break;
    }
    return this;
  }


  void setPosition(Coord startCoord, Direction direction, int size) {
    Coord nextCoordinate = new Coord(startCoord);
    position.add(nextCoordinate);
    for(int i=1;i<size;i++) {
      nextCoordinate = new Coord(nextCoordinate);
      nextCoordinate.setNextPosition(direction);
      position.add(nextCoordinate);
    }
  }

  public List<Coord> getPositions() {
    return position;
  }

  public Coord getPosition(int index) {
    return position.get(index);
  }

  public int getX() { return x; }

  public int getY() { return y; }

  public void setX(int x) { this.x = x; }

  public void setY(int y) { this.y = y; }
}
