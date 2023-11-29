package ru.hh.school.ooppatterns.structural.decorator.solution;

public class CinnamonCoffeeDecorator extends CoffeeDecorator {

  public CinnamonCoffeeDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + " + cinnamon";
  }

  @Override
  public double getCost() {
    return super.getCost() + 20;
  }
}
