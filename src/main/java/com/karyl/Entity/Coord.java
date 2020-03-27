package com.karyl.Entity;

public class Coord {

  private int x;
  private int y;

  public Coord(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Coord(Coord coord) {
    this.x = coord.getX();
    this.y = coord.getY();
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

  public int getX() { return x; }

  public int getY() { return y; }

  public void setX(int x) { this.x = x; }

  public void setY(int y) { this.y = y; }
}
