package com.karyl.Entity;

import java.util.ArrayList;
import java.util.List;

public class Boat {

  private Coord startCoord;
  private Model model;
  private Direction direction;
  private int size;
  private List<Coord> position;

  public Boat(int x, int y, Model model, Direction direction) {
    this.startCoord = new Coord(x, y);
    this.model = model;
    this.direction = direction;
    this.position = new ArrayList<Coord>();

    this.setSize();
    this.setPosition();
  }

  public Coord getStartCoord() { return startCoord; }

  public Direction getDirection() { return direction; }

  public Model getModel() { return model; }

  public void setDirection(Direction direction) { this.direction = direction; }

  public void setModel(Model model) { this.model = model; }

  public int getPositionX() { return startCoord.getX(); }

  public int getPositionY() { return startCoord.getY(); }

  public void setStartCoord(Coord startCoord) { this.startCoord = startCoord; }

  private void setPosition() {
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

  public void setSize() {
    switch (model) {
      case TINY: this.size = 2;
        break;
      case SHORT: this.size = 3;
        break;
      case MEDIUM: this.size = 4;
        break;
      case LONG: this.size = 5;
        break;
      default: this.size = 0;
    }
  }

    public int getSize() {
      return size;
    }

}
