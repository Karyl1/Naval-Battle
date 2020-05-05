package com.karyl.Tests;

import com.karyl.Entity.Coord;
import com.karyl.Entity.Direction;
import com.karyl.Entity.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Coord class")
public class CoordTest {

  private Coord coord;

  @BeforeEach
  void setUp() { this.coord = new Coord(5,5); }

  @Test
  @DisplayName("Creation of new Coord")
  void createCoord() {
    Coord coord = new Coord(1, 1);
    Assertions.assertEquals(true, coord instanceof Coord);
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
    Coord coord = new Coord(this.coord);
    Assertions.assertEquals(5, coord.getX());
    Assertions.assertEquals(5, coord.getY());
  }
}
