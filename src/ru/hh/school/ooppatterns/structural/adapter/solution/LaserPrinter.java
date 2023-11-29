package ru.hh.school.ooppatterns.structural.adapter.solution;

public class LaserPrinter implements Printer {

  private final LaserBurner laserBurner = new LaserBurner();

  @Override
  public void init() {
    laserBurner.turnOn();
    laserBurner.preheat();
  }

  @Override
  public void print(String content) {
    try {
      laserBurner.burn(content.toCharArray());
    } catch (Exception e) {
      // do nothing
    }
  }
}
