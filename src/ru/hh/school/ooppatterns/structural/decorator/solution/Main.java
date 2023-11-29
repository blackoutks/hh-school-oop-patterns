package ru.hh.school.ooppatterns.structural.decorator.solution;

public class Main {

  public static void main(String[] args) {
    Coffee blackCoffee = new BlackCoffee();
    printCoffeeDetails(blackCoffee);

    Coffee coffeeWithMilk = new MilkCoffeeDecorator(blackCoffee);
    printCoffeeDetails(coffeeWithMilk);

    Coffee coffeeWithCinnamon = new CinnamonCoffeeDecorator(blackCoffee);
    printCoffeeDetails(coffeeWithCinnamon);

    Coffee coffeeWithMilkAndCinnamon = new CinnamonCoffeeDecorator(coffeeWithMilk);
    printCoffeeDetails(coffeeWithMilkAndCinnamon);
  }

  private static void printCoffeeDetails(Coffee coffee) {
    System.out.println(coffee.getDescription() + " costs " + coffee.getCost() + " rub.");
  }
}
