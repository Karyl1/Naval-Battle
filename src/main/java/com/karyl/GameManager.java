package com.karyl;

import com.karyl.Entity.Boat;
import com.karyl.Entity.Direction;
import com.karyl.Entity.Fleet;
import com.karyl.Entity.Model;
import com.karyl.Map.Grid;

import java.util.Scanner;

public class GameManager {
  private int boatNumber;
  private Fleet fleetPlayer;
  private Fleet fleetBot;
  private Grid grid;
  private Scanner sc;

  public GameManager(int boatNumber, int gridSize) {
    this.boatNumber = boatNumber;
    this.fleetPlayer = new Fleet();
    this.grid = new Grid(gridSize, gridSize);
    this.sc = new Scanner(System.in);
  }

  public void initMap() {
    for(int i=1; i<boatNumber; i++) {
      System.out.println("Type the X coordinate of your boat");
      int boatPositionX= sc.nextInt();
      System.out.println("Type the Y coordinate of your boat");
      int boatPositionY = sc.nextInt();
      System.out.println("Type the model id");
      System.out.println("1 = tiny | 2 = short | 3 = medium | 4 = long");
      int boatModel = sc.nextInt();
      System.out.println(boatPositionX + " " + boatPositionY);
    }
  }

  public void debug() {
    Boat boat = new Boat(10, 5, Model.LONG, Direction.WEST);
    Grid grid = new Grid(10, 10);
    Fleet fleet = new Fleet();
    fleet.addBoat(boat);
    Boat boat1 = new Boat(1, 8, Model.TINY, Direction.EAST);
    fleet.addBoat(boat1);
    Boat boat2 = new Boat(1, 9, Model.TINY, Direction.EAST);
    fleet.addBoat(boat2);
    Boat boat3 = new Boat(1, 6, Model.TINY, Direction.NORTH);
    fleet.addBoat(boat3);
  }
}
