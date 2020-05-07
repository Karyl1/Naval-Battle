package com.karyl;

import com.karyl.Entity.Boat;
import com.karyl.Entity.Direction;
import com.karyl.Entity.Model;
import com.karyl.Entity.Fleet;
import com.karyl.Map.Grid;

public class Game {
  public static void main(String[] args) {

    Boat boat = new Boat(10, 5, Model.LONG, Direction.WEST);
    Grid grid = new Grid(10, 10);
    Fleet fleet = new Fleet();
    fleet.addBoat(boat);
    Boat boat1 = new Boat(1, 8, Model.TINY, Direction.EAST);
    fleet.addBoat(boat1);
    Boat boat2 = new Boat(1, 7, Model.TINY, Direction.EAST);
    fleet.addBoat(boat1);
  }
}
