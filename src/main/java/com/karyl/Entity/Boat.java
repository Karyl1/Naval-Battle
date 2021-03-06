package com.karyl.Entity;

import java.util.ArrayList;
import java.util.List;

public class Boat {

  private Coord coord;
  private Model model;
  private Direction direction;
  private int size;
  private List<Coord> positions;

  public Boat(int x, int y, Model model, Direction direction) {
    this.coord = new Coord(x, y);
    this.model = model;
    this.direction = direction;

    this.setSize();
    this.positions = new ArrayList<Coord>();
    this.coord.setPosition(this, this.coord, this.direction, this.size);
  }

  public void setPositionBoat(Coord coord) {
    this.positions.add(coord);
  }

  public Coord getCoord() { return coord; }

  public Direction getDirection() { return direction; }

  public Model getModel() { return model; }

  public void setDirection(Direction direction) { this.direction = direction; }

  public void setModel(Model model) { this.model = model; }

  public Coord getPosition(int index) {
    return this.positions.get(index);
  }
  public List<Coord> getPositions() {
    return this.positions;
  }

  public void setcoord(Coord coord) { this.coord = coord; }

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
