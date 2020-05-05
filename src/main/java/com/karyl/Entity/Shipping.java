package com.karyl.Entity;

import java.util.ArrayList;
import java.util.List;

public class Shipping {
  private List<Boat> shipping;

  public Shipping() {
    this.shipping = new ArrayList<Boat>();
  }

  public List<Boat> getShipping() { return shipping; }

  public void setShipping(ArrayList<Boat> shipping) { this.shipping = shipping; }

  public void addBoat(Boat boat) { this.shipping.add(boat); }

  public void removeBoat(int index) { this.shipping.remove(index); }
}
