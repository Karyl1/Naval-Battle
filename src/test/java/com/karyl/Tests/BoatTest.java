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

@DisplayName("Test Boat class")
class BoatTest {

  private Boat boat;

  @BeforeEach
  void setUp() {
    this.boat = new Boat(5, 7, Model.LONG, Direction.WEST);
  }

  @Test
  @DisplayName("Creation of new boat")
  void createBoat() {
    Assertions.assertEquals(5, boat.getCoord().getX());
    Assertions.assertEquals(7, boat.getCoord().getY());
    Assertions.assertEquals(Model.LONG, boat.getModel());
    Assertions.assertEquals(Direction.WEST, boat.getDirection());
    Assertions.assertEquals(5, boat.getSize());
  }

  @Test
  @DisplayName("Define the size and direction of the boats")
  void setSizeDirectionBoat() {
    Boat tinyBoat = new Boat(5, 2, Model.TINY, Direction.EAST);
    Boat shortBoat = new Boat(5, 2, Model.SHORT, Direction.SOUTH);
    Boat mediumBoat = new Boat(5, 2, Model.MEDIUM, Direction.NORTH);
    Assertions.assertEquals(2, tinyBoat.getSize());
    Assertions.assertEquals(3, shortBoat.getSize());
    Assertions.assertEquals(4, mediumBoat.getSize());
    Assertions.assertEquals(5, boat.getSize());
    Assertions.assertEquals(Direction.EAST, tinyBoat.getDirection());
    Assertions.assertEquals(Direction.SOUTH, shortBoat.getDirection());
    Assertions.assertEquals(Direction.NORTH, mediumBoat.getDirection());
    Assertions.assertEquals(Direction.WEST, boat.getDirection());
  }

  @Test
  @DisplayName("Test position coordinate collection")
  void positionCoordinate() {
    List coord = new ArrayList<Coord>();
    coord.add(new Coord(boat.getCoord()));
    for (int i = 0; i < boat.getSize(); i++) {
      coord.add(new Coord(boat.getCoord().getX() - i, boat.getCoord().getY()));
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
