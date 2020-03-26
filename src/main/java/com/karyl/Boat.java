package com.karyl;

public class Boat {

  private Position startPosition;
  private String model;
  private String direction;

  public Boat(Position startPosition, String model, String direction) {
    this.startPosition = startPosition;
    this.model = model;
    this.direction = direction;
  }

  public Position getStartPosition() { return startPosition; }

  public String getDirection() { return direction; }

  public String getModel() { return model; }

  public void setDirection(String direction) { this.direction = direction; }

  public void setModel(String model) { this.model = model; }

  public void setStartPosition(Position startPosition) { this.startPosition = startPosition; }
}
