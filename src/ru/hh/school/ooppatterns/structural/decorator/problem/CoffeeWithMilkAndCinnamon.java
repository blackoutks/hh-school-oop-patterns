package ru.hh.school.ooppatterns.structural.decorator.problem;

public class CoffeeWithMilkAndCinnamon extends CoffeeWithMilk {

  @Override
  public String getDescription() {
    return super.getDescription() + " + cinnamon";
  }

  @Override
  public double getCost() {
    return super.getCost() + 20;
  }
}
