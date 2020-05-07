package com.karyl.Entity;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
  private List<Boat> fleet;

  public Fleet() {
    this.fleet = new ArrayList<Boat>();
  }

  public List<Boat> getShipping() { return fleet; }

  public void setShipping(ArrayList<Boat> shipping) { this.fleet = shipping; }

  public void addBoat(Boat boat) {
    if(!isOnABoat(boat))
      fleet.add(boat);
    else
        System.out.println("Vessel position error");
  }

  public void removeBoat(int index) { this.fleet.remove(index); }

  public boolean isOnABoat(Boat boat) {
    Boolean isOnBoat = false;
    for(int i=0; i<fleet.size(); i++) {
      for(Coord boatAdded : fleet.get(i).getPositions()) {
        if(boatAdded.getY() == boat.getCoord().getY() && boatAdded.getX() == boat.getCoord().getX()) {
          isOnBoat = true;
        }
      }
    }
    return isOnBoat;
  }
}
