package com.karyl.Entity;

import java.util.ArrayList;

public class Shipping {
  private ArrayList<Boat> shipping;

  public ArrayList<Boat> getShipping() { return shipping; }

  public Shipping(ArrayList<Boat> shipping) { this.shipping = shipping; }

  public void setShipping(ArrayList<Boat> shipping) { this.shipping = shipping; }

  public void addBoat(Boat boat) { this.shipping.add(boat); }

  public void removeBoat(int index) { this.shipping.remove(index); }
}
