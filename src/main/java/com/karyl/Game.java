package com.karyl;

import com.karyl.Entity.Boat;
import com.karyl.Entity.Direction;
import com.karyl.Entity.Model;
import com.karyl.Entity.Shipping;
import com.karyl.Map.Grid;

public class Game {
  public static void main(String[] args) {

    Boat boat = new Boat(5, 5, Model.LONG, Direction.WEST);
    Grid grid = new Grid(10, 10);
    Shipping shipping = new Shipping();
    shipping.addBoat(boat);
    System.out.println(grid.isOutOfMap(boat));
    System.out.println(shipping.getShipping());
  }
}
