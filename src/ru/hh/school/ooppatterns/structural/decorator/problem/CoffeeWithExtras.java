package ru.hh.school.ooppatterns.structural.decorator.problem;

public class CoffeeWithExtras implements Coffee {

  private boolean withMilk;
  private boolean withCinnamon;

  @Override
  public String getDescription() {
    String description = "Coffee";
    if (withMilk) {
      description += " + milk";
    }
    if (withCinnamon) {
      description += " + cinnamon";
    }
    return description;
  }

  @Override
  public double getCost() {
    double cost = 150.0;
    if (withMilk) {
      cost += 30.0;
    }
    if (withCinnamon) {
      cost += 20.0;
    }
    return cost;
  }

  public void addMilk() {
    withMilk = true;
  }

  public void addCinnamon() {
    withCinnamon = true;
  }
}
