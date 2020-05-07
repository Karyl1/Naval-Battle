package com.karyl.Tests;

import com.karyl.Entity.Boat;
import com.karyl.Entity.Direction;
import com.karyl.Entity.Fleet;
import com.karyl.Entity.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Fleet class")
public class FleetTest {

  private Fleet fleet;

  @BeforeEach
  void setUp() {
    this.fleet = new Fleet();
  }


  @Test
  @DisplayName("insertion of boats into a new Fleet")
  void insertionFleet() {
    Boat boat1 = new Boat(1, 1, Model.TINY, Direction.NORTH);
    Boat boat2 = new Boat(2, 2, Model.TINY, Direction.WEST);
    Boat boat3 = new Boat(2, 3, Model.TINY, Direction.EAST);

    Assertions.assertEquals(true, this.fleet.addBoat(boat1));
    Assertions.assertEquals(false, this.fleet.addBoat(boat2));
    Assertions.assertEquals(true, this.fleet.addBoat(boat3));

  }


  @Test
  @DisplayName("Vessel position verification")
  void checkFleet() {
    Boat boat1 = new Boat(1, 1, Model.TINY, Direction.NORTH);
    Boat boat2 = new Boat(2, 2, Model.TINY, Direction.WEST);
    Boat boat3 = new Boat(2, 3, Model.TINY, Direction.EAST);

    Assertions.assertEquals(false, this.fleet.isOnABoat(boat1));
    this.fleet.addBoat(boat2);
    Assertions.assertEquals(true, this.fleet.isOnABoat(boat2));
    Assertions.assertEquals(false, this.fleet.isOnABoat(boat3));
  }
}
