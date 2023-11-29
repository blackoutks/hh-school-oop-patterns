package ru.hh.school.ooppatterns.structural.decorator.problem;

public class CoffeeWithCinnamon extends BlackCoffee {

  @Override
  public String getDescription() {
    return super.getDescription() + " + cinnamon";
  }

  @Override
  public double getCost() {
    return super.getCost() + 20;
  }
}
