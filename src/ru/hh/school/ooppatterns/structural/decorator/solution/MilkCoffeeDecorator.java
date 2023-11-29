package ru.hh.school.ooppatterns.structural.decorator.solution;

public class MilkCoffeeDecorator extends CoffeeDecorator {

  public MilkCoffeeDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + " + milk";
  }

  @Override
  public double getCost() {
    return super.getCost() + 30;
  }
}
