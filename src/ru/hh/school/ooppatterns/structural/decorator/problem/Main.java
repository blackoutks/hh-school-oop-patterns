package ru.hh.school.ooppatterns.structural.decorator.problem;

public class Main {

  public static void main(String[] args) {
    /*
     * TODO:
     *  Add the ability to make coffee with milk and cinnamon in different combinations.
     *  Each ingredient may cost extra money.
     */
    Coffee blackCoffee = new BlackCoffee();
    printCoffeeDetails(blackCoffee);

    Coffee coffeeWithMilk = new CoffeeWithMilk();
    printCoffeeDetails(coffeeWithMilk);

    Coffee coffeeWithCinnamon = new CoffeeWithCinnamon();
    printCoffeeDetails(coffeeWithCinnamon);

    Coffee coffeeWithMilkAndCinnamon = new CoffeeWithMilkAndCinnamon();
    printCoffeeDetails(coffeeWithMilkAndCinnamon);
  }

  private static void printCoffeeDetails(Coffee coffee) {
    System.out.println(coffee.getDescription() + " costs " + coffee.getCost() + " rub.");
  }
}
