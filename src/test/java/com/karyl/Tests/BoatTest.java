package com.karyl.Tests;


import com.karyl.Entity.Boat;
import com.karyl.Entity.Coord;
import com.karyl.Entity.Direction;
import com.karyl.Entity.Model;
import com.karyl.Map.Grid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Test boat class")
class BoatTest {

  private Boat boat;

  @BeforeEach
  void setUp() {
    this.boat = new Boat(5, 7, Model.LONG, Direction.WEST);
  }

  @Test
  @DisplayName("Creation of new boat")
  void createBoat() {
    Assertions.assertEquals(5, boat.getPositionX());
    Assertions.assertEquals(7, boat.getPositionY());
    Assertions.assertEquals(Model.LONG, boat.getModel());
    Assertions.assertEquals(Direction.WEST, boat.getDirection());
    Assertions.assertEquals(5, boat.getSize());
  }

  @Test
  @DisplayName("creation coordinate by x & y")
  void createCoordinate() {
    Coord coord = new Coord(2, 1);
    Assertions.assertEquals(2, coord.getX());
    Assertions.assertEquals(1, coord.getY());
  }


  @Test
  @DisplayName("creation coordinate by Coord class")
  void createCoordinate2() {
    Coord coord = new Coord(boat.getStartCoord());
    Assertions.assertEquals(5, coord.getX());
    Assertions.assertEquals(7, coord.getY());
  }

  @Test
  @DisplayName("Test position coordinate collection")
  void positionCoordinate() {
    List coord = new ArrayList<Coord>();
    coord.add(new Coord(boat.getStartCoord()));
    for (int i = 0; i < 5; i++) {
      coord.add(new Coord(boat.getPositionX() + i, boat.getPositionY()));
      Assertions.assertEquals(7, boat.getPosition(i).getY());
      Assertions.assertEquals(5 - i, boat.getPosition(i).getX());
    }
  }

  @Test
  @DisplayName("Is on map")
  void IsOnMap() {
    Grid grid = new Grid(10, 10);
    Assertions.assertEquals(false, grid.isOutOfMap(boat));
    Boat boat = new Boat(9, 2, Model.LONG, Direction.EAST);
    Assertions.assertEquals(true, grid.isOutOfMap(boat));
  }
}
