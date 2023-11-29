package ru.hh.school.ooppatterns.structural.decorator.problem;

public class CoffeeWithMilk extends BlackCoffee {

  @Override
  public String getDescription() {
    return super.getDescription() + " + milk";
  }

  @Override
  public double getCost() {
    return super.getCost() + 30.0;
  }
}
