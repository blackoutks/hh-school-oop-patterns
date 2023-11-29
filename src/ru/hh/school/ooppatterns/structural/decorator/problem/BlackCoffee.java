package ru.hh.school.ooppatterns.structural.decorator.problem;

public class BlackCoffee implements Coffee {

  @Override
  public String getDescription() {
    return "Coffee";
  }

  @Override
  public double getCost() {
    return 150.0;
  }
}
